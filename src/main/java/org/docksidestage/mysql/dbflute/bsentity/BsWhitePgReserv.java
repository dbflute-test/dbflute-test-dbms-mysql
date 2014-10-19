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
import org.docksidestage.mysql.dbflute.allcommon.DBMetaInstanceHandler;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The entity of WHITE_PG_RESERV as TABLE. <br />
 * <pre>
 * [primary-key]
 *     CLASS
 * 
 * [column]
 *     CLASS, CASE, PACKAGE, DEFAULT, NEW, NATIVE, VOID, PUBLIC, PROTECTED, PRIVATE, INTERFACE, ABSTRACT, FINAL, FINALLY, RETURN, DOUBLE, FLOAT, SHORT, TYPE, RESERV_NAME
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
 *     white_pg_reserv_ref
 * 
 * [foreign property]
 *     
 * 
 * [referrer property]
 *     whitePgReservRefList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Integer classSynonym = entity.getClassSynonym();
 * Integer caseSynonym = entity.getCaseSynonym();
 * Integer packageSynonym = entity.getPackageSynonym();
 * Integer defaultSynonym = entity.getDefaultSynonym();
 * Integer newSynonym = entity.getNewSynonym();
 * Integer nativeSynonym = entity.getNativeSynonym();
 * Integer voidSynonym = entity.getVoidSynonym();
 * Integer publicSynonym = entity.getPublicSynonym();
 * Integer protectedSynonym = entity.getProtectedSynonym();
 * Integer privateSynonym = entity.getPrivateSynonym();
 * Integer interfaceSynonym = entity.getInterfaceSynonym();
 * Integer abstractSynonym = entity.getAbstractSynonym();
 * Integer finalSynonym = entity.getFinalSynonym();
 * Integer finallySynonym = entity.getFinallySynonym();
 * Integer returnSynonym = entity.getReturnSynonym();
 * Integer doubleSynonym = entity.getDoubleSynonym();
 * Integer floatSynonym = entity.getFloatSynonym();
 * Integer shortSynonym = entity.getShortSynonym();
 * String type = entity.getType();
 * String reservName = entity.getReservName();
 * entity.setClassSynonym(classSynonym);
 * entity.setCaseSynonym(caseSynonym);
 * entity.setPackageSynonym(packageSynonym);
 * entity.setDefaultSynonym(defaultSynonym);
 * entity.setNewSynonym(newSynonym);
 * entity.setNativeSynonym(nativeSynonym);
 * entity.setVoidSynonym(voidSynonym);
 * entity.setPublicSynonym(publicSynonym);
 * entity.setProtectedSynonym(protectedSynonym);
 * entity.setPrivateSynonym(privateSynonym);
 * entity.setInterfaceSynonym(interfaceSynonym);
 * entity.setAbstractSynonym(abstractSynonym);
 * entity.setFinalSynonym(finalSynonym);
 * entity.setFinallySynonym(finallySynonym);
 * entity.setReturnSynonym(returnSynonym);
 * entity.setDoubleSynonym(doubleSynonym);
 * entity.setFloatSynonym(floatSynonym);
 * entity.setShortSynonym(shortSynonym);
 * entity.setType(type);
 * entity.setReservName(reservName);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWhitePgReserv extends AbstractEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} */
    protected Integer _classSynonym;

    /** ((using DBFlute synonym))CASE: {INT(10)} */
    protected Integer _caseSynonym;

    /** ((using DBFlute synonym))PACKAGE: {INT(10)} */
    protected Integer _packageSynonym;

    /** ((using DBFlute synonym))DEFAULT: {INT(10)} */
    protected Integer _defaultSynonym;

    /** ((using DBFlute synonym))NEW: {INT(10)} */
    protected Integer _newSynonym;

    /** ((using DBFlute synonym))NATIVE: {INT(10)} */
    protected Integer _nativeSynonym;

    /** ((using DBFlute synonym))VOID: {INT(10)} */
    protected Integer _voidSynonym;

    /** ((using DBFlute synonym))PUBLIC: {INT(10)} */
    protected Integer _publicSynonym;

    /** ((using DBFlute synonym))PROTECTED: {INT(10)} */
    protected Integer _protectedSynonym;

    /** ((using DBFlute synonym))PRIVATE: {INT(10)} */
    protected Integer _privateSynonym;

    /** ((using DBFlute synonym))INTERFACE: {INT(10)} */
    protected Integer _interfaceSynonym;

    /** ((using DBFlute synonym))ABSTRACT: {INT(10)} */
    protected Integer _abstractSynonym;

    /** ((using DBFlute synonym))FINAL: {INT(10)} */
    protected Integer _finalSynonym;

    /** ((using DBFlute synonym))FINALLY: {INT(10)} */
    protected Integer _finallySynonym;

    /** ((using DBFlute synonym))RETURN: {INT(10)} */
    protected Integer _returnSynonym;

    /** ((using DBFlute synonym))DOUBLE: {INT(10)} */
    protected Integer _doubleSynonym;

    /** ((using DBFlute synonym))FLOAT: {INT(10)} */
    protected Integer _floatSynonym;

    /** ((using DBFlute synonym))SHORT: {INT(10)} */
    protected Integer _shortSynonym;

    /** TYPE: {CHAR(3)} */
    protected String _type;

    /** RESERV_NAME: {NotNull, VARCHAR(32)} */
    protected String _reservName;


    // ===================================================================================
    //                                                                          Table Name
    //                                                                          ==========
    /** {@inheritDoc} */
    public String getTableDbName() {
        return "white_pg_reserv";
    }

    /** {@inheritDoc} */
    public String getTablePropertyName() {
        return "whitePgReserv";
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    /** {@inheritDoc} */
    public DBMeta getDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(getTableDbName());
    }

    // ===================================================================================
    //                                                                         Primary Key
    //                                                                         ===========
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_classSynonym == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'. */
    protected List<WhitePgReservRef> _whitePgReservRefList;

    /**
     * [get] white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @return The entity list of referrer property 'whitePgReservRefList'. (NotNull: even if no loading, returns empty list)
     */
    public List<WhitePgReservRef> getWhitePgReservRefList() {
        if (_whitePgReservRefList == null) { _whitePgReservRefList = newReferrerList(); }
        return _whitePgReservRefList;
    }

    /**
     * [set] white_pg_reserv_ref by CLASS, named 'whitePgReservRefList'.
     * @param whitePgReservRefList The entity list of referrer property 'whitePgReservRefList'. (NullAllowed)
     */
    public void setWhitePgReservRefList(List<WhitePgReservRef> whitePgReservRefList) {
        _whitePgReservRefList = whitePgReservRefList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsWhitePgReserv) {
            BsWhitePgReserv other = (BsWhitePgReserv)obj;
            if (!xSV(_classSynonym, other._classSynonym)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, getTableDbName());
        hs = xCH(hs, _classSynonym);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_whitePgReservRefList != null) { for (WhitePgReservRef et : _whitePgReservRefList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "whitePgReservRefList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(_classSynonym);
        sb.append(dm).append(_caseSynonym);
        sb.append(dm).append(_packageSynonym);
        sb.append(dm).append(_defaultSynonym);
        sb.append(dm).append(_newSynonym);
        sb.append(dm).append(_nativeSynonym);
        sb.append(dm).append(_voidSynonym);
        sb.append(dm).append(_publicSynonym);
        sb.append(dm).append(_protectedSynonym);
        sb.append(dm).append(_privateSynonym);
        sb.append(dm).append(_interfaceSynonym);
        sb.append(dm).append(_abstractSynonym);
        sb.append(dm).append(_finalSynonym);
        sb.append(dm).append(_finallySynonym);
        sb.append(dm).append(_returnSynonym);
        sb.append(dm).append(_doubleSynonym);
        sb.append(dm).append(_floatSynonym);
        sb.append(dm).append(_shortSynonym);
        sb.append(dm).append(_type);
        sb.append(dm).append(_reservName);
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_whitePgReservRefList != null && !_whitePgReservRefList.isEmpty())
        { sb.append(dm).append("whitePgReservRefList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public WhitePgReserv clone() {
        return (WhitePgReserv)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} <br />
     * @return The value of the column 'CLASS'. (basically NotNull if selected: for the constraint)
     */
    public Integer getClassSynonym() {
        return _classSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CLASS: {PK, NotNull, INT(10)} <br />
     * @param classSynonym The value of the column 'CLASS'. (basically NotNull if update: for the constraint)
     */
    public void setClassSynonym(Integer classSynonym) {
        __modifiedProperties.addPropertyName("classSynonym");
        _classSynonym = classSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))CASE: {INT(10)} <br />
     * @return The value of the column 'CASE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getCaseSynonym() {
        return _caseSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))CASE: {INT(10)} <br />
     * @param caseSynonym The value of the column 'CASE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCaseSynonym(Integer caseSynonym) {
        __modifiedProperties.addPropertyName("caseSynonym");
        _caseSynonym = caseSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PACKAGE: {INT(10)} <br />
     * @return The value of the column 'PACKAGE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPackageSynonym() {
        return _packageSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PACKAGE: {INT(10)} <br />
     * @param packageSynonym The value of the column 'PACKAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPackageSynonym(Integer packageSynonym) {
        __modifiedProperties.addPropertyName("packageSynonym");
        _packageSynonym = packageSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))DEFAULT: {INT(10)} <br />
     * @return The value of the column 'DEFAULT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDefaultSynonym() {
        return _defaultSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))DEFAULT: {INT(10)} <br />
     * @param defaultSynonym The value of the column 'DEFAULT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDefaultSynonym(Integer defaultSynonym) {
        __modifiedProperties.addPropertyName("defaultSynonym");
        _defaultSynonym = defaultSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))NEW: {INT(10)} <br />
     * @return The value of the column 'NEW'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNewSynonym() {
        return _newSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))NEW: {INT(10)} <br />
     * @param newSynonym The value of the column 'NEW'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNewSynonym(Integer newSynonym) {
        __modifiedProperties.addPropertyName("newSynonym");
        _newSynonym = newSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))NATIVE: {INT(10)} <br />
     * @return The value of the column 'NATIVE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getNativeSynonym() {
        return _nativeSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))NATIVE: {INT(10)} <br />
     * @param nativeSynonym The value of the column 'NATIVE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setNativeSynonym(Integer nativeSynonym) {
        __modifiedProperties.addPropertyName("nativeSynonym");
        _nativeSynonym = nativeSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))VOID: {INT(10)} <br />
     * @return The value of the column 'VOID'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getVoidSynonym() {
        return _voidSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))VOID: {INT(10)} <br />
     * @param voidSynonym The value of the column 'VOID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setVoidSynonym(Integer voidSynonym) {
        __modifiedProperties.addPropertyName("voidSynonym");
        _voidSynonym = voidSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PUBLIC: {INT(10)} <br />
     * @return The value of the column 'PUBLIC'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPublicSynonym() {
        return _publicSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PUBLIC: {INT(10)} <br />
     * @param publicSynonym The value of the column 'PUBLIC'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPublicSynonym(Integer publicSynonym) {
        __modifiedProperties.addPropertyName("publicSynonym");
        _publicSynonym = publicSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PROTECTED: {INT(10)} <br />
     * @return The value of the column 'PROTECTED'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getProtectedSynonym() {
        return _protectedSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PROTECTED: {INT(10)} <br />
     * @param protectedSynonym The value of the column 'PROTECTED'. (NullAllowed: null update allowed for no constraint)
     */
    public void setProtectedSynonym(Integer protectedSynonym) {
        __modifiedProperties.addPropertyName("protectedSynonym");
        _protectedSynonym = protectedSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))PRIVATE: {INT(10)} <br />
     * @return The value of the column 'PRIVATE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getPrivateSynonym() {
        return _privateSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))PRIVATE: {INT(10)} <br />
     * @param privateSynonym The value of the column 'PRIVATE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setPrivateSynonym(Integer privateSynonym) {
        __modifiedProperties.addPropertyName("privateSynonym");
        _privateSynonym = privateSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))INTERFACE: {INT(10)} <br />
     * @return The value of the column 'INTERFACE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getInterfaceSynonym() {
        return _interfaceSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))INTERFACE: {INT(10)} <br />
     * @param interfaceSynonym The value of the column 'INTERFACE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setInterfaceSynonym(Integer interfaceSynonym) {
        __modifiedProperties.addPropertyName("interfaceSynonym");
        _interfaceSynonym = interfaceSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))ABSTRACT: {INT(10)} <br />
     * @return The value of the column 'ABSTRACT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getAbstractSynonym() {
        return _abstractSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))ABSTRACT: {INT(10)} <br />
     * @param abstractSynonym The value of the column 'ABSTRACT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAbstractSynonym(Integer abstractSynonym) {
        __modifiedProperties.addPropertyName("abstractSynonym");
        _abstractSynonym = abstractSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FINAL: {INT(10)} <br />
     * @return The value of the column 'FINAL'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFinalSynonym() {
        return _finalSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FINAL: {INT(10)} <br />
     * @param finalSynonym The value of the column 'FINAL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFinalSynonym(Integer finalSynonym) {
        __modifiedProperties.addPropertyName("finalSynonym");
        _finalSynonym = finalSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FINALLY: {INT(10)} <br />
     * @return The value of the column 'FINALLY'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFinallySynonym() {
        return _finallySynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FINALLY: {INT(10)} <br />
     * @param finallySynonym The value of the column 'FINALLY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFinallySynonym(Integer finallySynonym) {
        __modifiedProperties.addPropertyName("finallySynonym");
        _finallySynonym = finallySynonym;
    }

    /**
     * [get] ((using DBFlute synonym))RETURN: {INT(10)} <br />
     * @return The value of the column 'RETURN'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getReturnSynonym() {
        return _returnSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))RETURN: {INT(10)} <br />
     * @param returnSynonym The value of the column 'RETURN'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReturnSynonym(Integer returnSynonym) {
        __modifiedProperties.addPropertyName("returnSynonym");
        _returnSynonym = returnSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))DOUBLE: {INT(10)} <br />
     * @return The value of the column 'DOUBLE'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getDoubleSynonym() {
        return _doubleSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))DOUBLE: {INT(10)} <br />
     * @param doubleSynonym The value of the column 'DOUBLE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDoubleSynonym(Integer doubleSynonym) {
        __modifiedProperties.addPropertyName("doubleSynonym");
        _doubleSynonym = doubleSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))FLOAT: {INT(10)} <br />
     * @return The value of the column 'FLOAT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getFloatSynonym() {
        return _floatSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))FLOAT: {INT(10)} <br />
     * @param floatSynonym The value of the column 'FLOAT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFloatSynonym(Integer floatSynonym) {
        __modifiedProperties.addPropertyName("floatSynonym");
        _floatSynonym = floatSynonym;
    }

    /**
     * [get] ((using DBFlute synonym))SHORT: {INT(10)} <br />
     * @return The value of the column 'SHORT'. (NullAllowed even if selected: for no constraint)
     */
    public Integer getShortSynonym() {
        return _shortSynonym;
    }

    /**
     * [set] ((using DBFlute synonym))SHORT: {INT(10)} <br />
     * @param shortSynonym The value of the column 'SHORT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShortSynonym(Integer shortSynonym) {
        __modifiedProperties.addPropertyName("shortSynonym");
        _shortSynonym = shortSynonym;
    }

    /**
     * [get] TYPE: {CHAR(3)} <br />
     * @return The value of the column 'TYPE'. (NullAllowed even if selected: for no constraint)
     */
    public String getType() {
        return _type;
    }

    /**
     * [set] TYPE: {CHAR(3)} <br />
     * @param type The value of the column 'TYPE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setType(String type) {
        __modifiedProperties.addPropertyName("type");
        _type = type;
    }

    /**
     * [get] RESERV_NAME: {NotNull, VARCHAR(32)} <br />
     * @return The value of the column 'RESERV_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getReservName() {
        return _reservName;
    }

    /**
     * [set] RESERV_NAME: {NotNull, VARCHAR(32)} <br />
     * @param reservName The value of the column 'RESERV_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setReservName(String reservName) {
        __modifiedProperties.addPropertyName("reservName");
        _reservName = reservName;
    }
}
