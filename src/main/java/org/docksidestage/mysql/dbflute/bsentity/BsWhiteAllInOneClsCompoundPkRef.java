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
 * The entity of WHITE_ALL_IN_ONE_CLS_COMPOUND_PK_REF as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhiteAllInOneClsCompoundPkRef extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _fooCode;

    /** BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} */
    protected String _barCode;

    /** QUX_CODE: {PK, NotNull, CHAR(3)} */
    protected String _quxCode;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "white_all_in_one_cls_compound_pk_ref";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_fooCode == null) { return false; }
        if (_barCode == null) { return false; }
        if (_quxCode == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** WHITE_ALL_IN_ONE_CLS_ELEMENT by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'. */
    protected OptionalEntity<WhiteAllInOneClsElement> _whiteAllInOneClsElementAsFoo;

    /**
     * [get] WHITE_ALL_IN_ONE_CLS_ELEMENT by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteAllInOneClsElement> getWhiteAllInOneClsElementAsFoo() {
        if (_whiteAllInOneClsElementAsFoo == null) { _whiteAllInOneClsElementAsFoo = OptionalEntity.relationEmpty(this, "whiteAllInOneClsElementAsFoo"); }
        return _whiteAllInOneClsElementAsFoo;
    }

    /**
     * [set] WHITE_ALL_IN_ONE_CLS_ELEMENT by my FOO_CODE, named 'whiteAllInOneClsElementAsFoo'.
     * @param whiteAllInOneClsElementAsFoo The entity of foreign property 'whiteAllInOneClsElementAsFoo'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementAsFoo(OptionalEntity<WhiteAllInOneClsElement> whiteAllInOneClsElementAsFoo) {
        _whiteAllInOneClsElementAsFoo = whiteAllInOneClsElementAsFoo;
    }

    /** WHITE_ALL_IN_ONE_CLS_ELEMENT by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'. */
    protected OptionalEntity<WhiteAllInOneClsElement> _whiteAllInOneClsElementAsBar;

    /**
     * [get] WHITE_ALL_IN_ONE_CLS_ELEMENT by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'whiteAllInOneClsElementAsBar'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<WhiteAllInOneClsElement> getWhiteAllInOneClsElementAsBar() {
        if (_whiteAllInOneClsElementAsBar == null) { _whiteAllInOneClsElementAsBar = OptionalEntity.relationEmpty(this, "whiteAllInOneClsElementAsBar"); }
        return _whiteAllInOneClsElementAsBar;
    }

    /**
     * [set] WHITE_ALL_IN_ONE_CLS_ELEMENT by my BAR_CODE, named 'whiteAllInOneClsElementAsBar'.
     * @param whiteAllInOneClsElementAsBar The entity of foreign property 'whiteAllInOneClsElementAsBar'. (NullAllowed)
     */
    public void setWhiteAllInOneClsElementAsBar(OptionalEntity<WhiteAllInOneClsElement> whiteAllInOneClsElementAsBar) {
        _whiteAllInOneClsElementAsBar = whiteAllInOneClsElementAsBar;
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
        if (obj instanceof BsWhiteAllInOneClsCompoundPkRef) {
            BsWhiteAllInOneClsCompoundPkRef other = (BsWhiteAllInOneClsCompoundPkRef)obj;
            if (!xSV(_fooCode, other._fooCode)) { return false; }
            if (!xSV(_barCode, other._barCode)) { return false; }
            if (!xSV(_quxCode, other._quxCode)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _fooCode);
        hs = xCH(hs, _barCode);
        hs = xCH(hs, _quxCode);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementAsFoo != null && _whiteAllInOneClsElementAsFoo.isPresent())
        { sb.append(li).append(xbRDS(_whiteAllInOneClsElementAsFoo, "whiteAllInOneClsElementAsFoo")); }
        if (_whiteAllInOneClsElementAsBar != null && _whiteAllInOneClsElementAsBar.isPresent())
        { sb.append(li).append(xbRDS(_whiteAllInOneClsElementAsBar, "whiteAllInOneClsElementAsBar")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_fooCode));
        sb.append(dm).append(xfND(_barCode));
        sb.append(dm).append(xfND(_quxCode));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whiteAllInOneClsElementAsFoo != null && _whiteAllInOneClsElementAsFoo.isPresent())
        { sb.append(dm).append("whiteAllInOneClsElementAsFoo"); }
        if (_whiteAllInOneClsElementAsBar != null && _whiteAllInOneClsElementAsBar.isPresent())
        { sb.append(dm).append("whiteAllInOneClsElementAsBar"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhiteAllInOneClsCompoundPkRef clone() {
        return (WhiteAllInOneClsCompoundPkRef)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * @return The value of the column 'FOO_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getFooCode() {
        checkSpecifiedProperty("fooCode");
        return _fooCode;
    }

    /**
     * [set] FOO_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * @param fooCode The value of the column 'FOO_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setFooCode(String fooCode) {
        registerModifiedProperty("fooCode");
        _fooCode = fooCode;
    }

    /**
     * [get] BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * @return The value of the column 'BAR_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getBarCode() {
        checkSpecifiedProperty("barCode");
        return _barCode;
    }

    /**
     * [set] BAR_CODE: {PK, NotNull, CHAR(3), FK to WHITE_ALL_IN_ONE_CLS_ELEMENT} <br>
     * @param barCode The value of the column 'BAR_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setBarCode(String barCode) {
        registerModifiedProperty("barCode");
        _barCode = barCode;
    }

    /**
     * [get] QUX_CODE: {PK, NotNull, CHAR(3)} <br>
     * @return The value of the column 'QUX_CODE'. (basically NotNull if selected: for the constraint)
     */
    public String getQuxCode() {
        checkSpecifiedProperty("quxCode");
        return _quxCode;
    }

    /**
     * [set] QUX_CODE: {PK, NotNull, CHAR(3)} <br>
     * @param quxCode The value of the column 'QUX_CODE'. (basically NotNull if update: for the constraint)
     */
    public void setQuxCode(String quxCode) {
        registerModifiedProperty("quxCode");
        _quxCode = quxCode;
    }
}
