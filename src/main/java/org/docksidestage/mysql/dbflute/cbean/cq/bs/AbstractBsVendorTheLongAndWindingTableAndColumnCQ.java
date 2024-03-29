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
package org.docksidestage.mysql.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import org.docksidestage.mysql.dbflute.allcommon.*;
import org.docksidestage.mysql.dbflute.cbean.*;
import org.docksidestage.mysql.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of vendor_the_long_and_winding_table_and_column.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsVendorTheLongAndWindingTableAndColumnCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsVendorTheLongAndWindingTableAndColumnCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "vendor_the_long_and_winding_table_and_column";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_Equal(Long theLongAndWindingTableAndColumnId) {
        doSetTheLongAndWindingTableAndColumnId_Equal(theLongAndWindingTableAndColumnId);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_Equal(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_EQ, theLongAndWindingTableAndColumnId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_NotEqual(Long theLongAndWindingTableAndColumnId) {
        doSetTheLongAndWindingTableAndColumnId_NotEqual(theLongAndWindingTableAndColumnId);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_NotEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_NES, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GT, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_LessThan(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LT, theLongAndWindingTableAndColumnId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_GreaterEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_GE, theLongAndWindingTableAndColumnId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnId The value of theLongAndWindingTableAndColumnId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_LessEqual(Long theLongAndWindingTableAndColumnId) {
        regTheLongAndWindingTableAndColumnId(CK_LE, theLongAndWindingTableAndColumnId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setTheLongAndWindingTableAndColumnId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of theLongAndWindingTableAndColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of theLongAndWindingTableAndColumnId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_InScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        doSetTheLongAndWindingTableAndColumnId_InScope(theLongAndWindingTableAndColumnIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_InScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnIdList), xgetCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     * @param theLongAndWindingTableAndColumnIdList The collection of theLongAndWindingTableAndColumnId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        doSetTheLongAndWindingTableAndColumnId_NotInScope(theLongAndWindingTableAndColumnIdList);
    }

    protected void doSetTheLongAndWindingTableAndColumnId_NotInScope(Collection<Long> theLongAndWindingTableAndColumnIdList) {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnIdList), xgetCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from vendor_the_long_and_winding_table_and_column_ref where ...)} <br>
     * vendor_the_long_and_winding_table_and_column_ref by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsVendorTheLongAndWindingTableAndColumnRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of VendorTheLongAndWindingTableAndColumnRefList for 'exists'. (NotNull)
     */
    public void existsVendorTheLongAndWindingTableAndColumnRef(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_ExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID from vendor_the_long_and_winding_table_and_column_ref where ...)} <br>
     * vendor_the_long_and_winding_table_and_column_ref by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsVendorTheLongAndWindingTableAndColumnRef</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList for 'not exists'. (NotNull)
     */
    public void notExistsVendorTheLongAndWindingTableAndColumnRef(SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerNotExistsReferrer(cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList");
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_NotExistsReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    public void xsderiveVendorTheLongAndWindingTableAndColumnRefList(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", pp, "vendorTheLongAndWindingTableAndColumnRefList", al, op);
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_SpecifyDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from vendor_the_long_and_winding_table_and_column_ref where ...)} <br>
     * vendor_the_long_and_winding_table_and_column_ref by THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID, named 'vendorTheLongAndWindingTableAndColumnRefAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedVendorTheLongAndWindingTableAndColumnRef()</span>.<span style="color: #CC4747">max</span>(refCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     refCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     refCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB> derivedVendorTheLongAndWindingTableAndColumnRef() {
        return xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList();
    }
    protected HpQDRFunction<VendorTheLongAndWindingTableAndColumnRefCB> xcreateQDRFunctionVendorTheLongAndWindingTableAndColumnRefList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveVendorTheLongAndWindingTableAndColumnRefList(fn, sq, rd, vl, op));
    }
    public void xqderiveVendorTheLongAndWindingTableAndColumnRefList(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnRefCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(cb.query()); String prpp = keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID", sqpp, "vendorTheLongAndWindingTableAndColumnRefList", rd, vl, prpp, op);
    }
    public abstract String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefList(VendorTheLongAndWindingTableAndColumnRefCQ sq);
    public abstract String keepTheLongAndWindingTableAndColumnId_QueryDerivedReferrer_VendorTheLongAndWindingTableAndColumnRefListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnId_IsNull() { regTheLongAndWindingTableAndColumnId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setTheLongAndWindingTableAndColumnId_IsNotNull() { regTheLongAndWindingTableAndColumnId(CK_ISNN, DOBJ); }

    protected void regTheLongAndWindingTableAndColumnId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTheLongAndWindingTableAndColumnId(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID"); }
    protected abstract ConditionValue xgetCValueTheLongAndWindingTableAndColumnId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnName_Equal(String theLongAndWindingTableAndColumnName) {
        doSetTheLongAndWindingTableAndColumnName_Equal(fRES(theLongAndWindingTableAndColumnName));
    }

    protected void doSetTheLongAndWindingTableAndColumnName_Equal(String theLongAndWindingTableAndColumnName) {
        regTheLongAndWindingTableAndColumnName(CK_EQ, theLongAndWindingTableAndColumnName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnName_NotEqual(String theLongAndWindingTableAndColumnName) {
        doSetTheLongAndWindingTableAndColumnName_NotEqual(fRES(theLongAndWindingTableAndColumnName));
    }

    protected void doSetTheLongAndWindingTableAndColumnName_NotEqual(String theLongAndWindingTableAndColumnName) {
        regTheLongAndWindingTableAndColumnName(CK_NES, theLongAndWindingTableAndColumnName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnNameList The collection of theLongAndWindingTableAndColumnName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnName_InScope(Collection<String> theLongAndWindingTableAndColumnNameList) {
        doSetTheLongAndWindingTableAndColumnName_InScope(theLongAndWindingTableAndColumnNameList);
    }

    protected void doSetTheLongAndWindingTableAndColumnName_InScope(Collection<String> theLongAndWindingTableAndColumnNameList) {
        regINS(CK_INS, cTL(theLongAndWindingTableAndColumnNameList), xgetCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnNameList The collection of theLongAndWindingTableAndColumnName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTheLongAndWindingTableAndColumnName_NotInScope(Collection<String> theLongAndWindingTableAndColumnNameList) {
        doSetTheLongAndWindingTableAndColumnName_NotInScope(theLongAndWindingTableAndColumnNameList);
    }

    protected void doSetTheLongAndWindingTableAndColumnName_NotInScope(Collection<String> theLongAndWindingTableAndColumnNameList) {
        regINS(CK_NINS, cTL(theLongAndWindingTableAndColumnNameList), xgetCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)} <br>
     * <pre>e.g. setTheLongAndWindingTableAndColumnName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_LikeSearch(String theLongAndWindingTableAndColumnName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTheLongAndWindingTableAndColumnName_LikeSearch(theLongAndWindingTableAndColumnName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)} <br>
     * <pre>e.g. setTheLongAndWindingTableAndColumnName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_LikeSearch(String theLongAndWindingTableAndColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(theLongAndWindingTableAndColumnName), xgetCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_NotLikeSearch(String theLongAndWindingTableAndColumnName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setTheLongAndWindingTableAndColumnName_NotLikeSearch(theLongAndWindingTableAndColumnName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME: {UQ, NotNull, VARCHAR(180)}
     * @param theLongAndWindingTableAndColumnName The value of theLongAndWindingTableAndColumnName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTheLongAndWindingTableAndColumnName_NotLikeSearch(String theLongAndWindingTableAndColumnName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(theLongAndWindingTableAndColumnName), xgetCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME", likeSearchOption);
    }

    protected void regTheLongAndWindingTableAndColumnName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTheLongAndWindingTableAndColumnName(), "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_NAME"); }
    protected abstract ConditionValue xgetCValueTheLongAndWindingTableAndColumnName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortName_Equal(String shortName) {
        doSetShortName_Equal(fRES(shortName));
    }

    protected void doSetShortName_Equal(String shortName) {
        regShortName(CK_EQ, shortName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortName_NotEqual(String shortName) {
        doSetShortName_NotEqual(fRES(shortName));
    }

    protected void doSetShortName_NotEqual(String shortName) {
        regShortName(CK_NES, shortName);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortNameList The collection of shortName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortName_InScope(Collection<String> shortNameList) {
        doSetShortName_InScope(shortNameList);
    }

    protected void doSetShortName_InScope(Collection<String> shortNameList) {
        regINS(CK_INS, cTL(shortNameList), xgetCValueShortName(), "SHORT_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortNameList The collection of shortName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortName_NotInScope(Collection<String> shortNameList) {
        doSetShortName_NotInScope(shortNameList);
    }

    protected void doSetShortName_NotInScope(Collection<String> shortNameList) {
        regINS(CK_NINS, cTL(shortNameList), xgetCValueShortName(), "SHORT_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setShortName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param shortName The value of shortName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShortName_LikeSearch(String shortName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShortName_LikeSearch(shortName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)} <br>
     * <pre>e.g. setShortName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shortName The value of shortName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShortName_LikeSearch(String shortName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shortName), xgetCValueShortName(), "SHORT_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setShortName_NotLikeSearch(String shortName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setShortName_NotLikeSearch(shortName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHORT_NAME: {NotNull, VARCHAR(200)}
     * @param shortName The value of shortName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShortName_NotLikeSearch(String shortName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shortName), xgetCValueShortName(), "SHORT_NAME", likeSearchOption);
    }

    protected void regShortName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShortName(), "SHORT_NAME"); }
    protected abstract ConditionValue xgetCValueShortName();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_Equal(Integer shortSize) {
        doSetShortSize_Equal(shortSize);
    }

    protected void doSetShortSize_Equal(Integer shortSize) {
        regShortSize(CK_EQ, shortSize);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_NotEqual(Integer shortSize) {
        doSetShortSize_NotEqual(shortSize);
    }

    protected void doSetShortSize_NotEqual(Integer shortSize) {
        regShortSize(CK_NES, shortSize);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_GreaterThan(Integer shortSize) {
        regShortSize(CK_GT, shortSize);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_LessThan(Integer shortSize) {
        regShortSize(CK_LT, shortSize);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_GreaterEqual(Integer shortSize) {
        regShortSize(CK_GE, shortSize);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSize The value of shortSize as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShortSize_LessEqual(Integer shortSize) {
        regShortSize(CK_LE, shortSize);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param minNumber The min number of shortSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shortSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setShortSize_RangeOf(Integer minNumber, Integer maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setShortSize_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param minNumber The min number of shortSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shortSize. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShortSize_RangeOf(Integer minNumber, Integer maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShortSize(), "SHORT_SIZE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSizeList The collection of shortSize as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortSize_InScope(Collection<Integer> shortSizeList) {
        doSetShortSize_InScope(shortSizeList);
    }

    protected void doSetShortSize_InScope(Collection<Integer> shortSizeList) {
        regINS(CK_INS, cTL(shortSizeList), xgetCValueShortSize(), "SHORT_SIZE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHORT_SIZE: {NotNull, INT(10)}
     * @param shortSizeList The collection of shortSize as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShortSize_NotInScope(Collection<Integer> shortSizeList) {
        doSetShortSize_NotInScope(shortSizeList);
    }

    protected void doSetShortSize_NotInScope(Collection<Integer> shortSizeList) {
        regINS(CK_NINS, cTL(shortSizeList), xgetCValueShortSize(), "SHORT_SIZE");
    }

    protected void regShortSize(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShortSize(), "SHORT_SIZE"); }
    protected abstract ConditionValue xgetCValueShortSize();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;VendorTheLongAndWindingTableAndColumnCB&gt;() {
     *     public void query(VendorTheLongAndWindingTableAndColumnCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<VendorTheLongAndWindingTableAndColumnCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, VendorTheLongAndWindingTableAndColumnCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(VendorTheLongAndWindingTableAndColumnCQ sq);

    protected VendorTheLongAndWindingTableAndColumnCB xcreateScalarConditionCB() {
        VendorTheLongAndWindingTableAndColumnCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected VendorTheLongAndWindingTableAndColumnCB xcreateScalarConditionPartitionByCB() {
        VendorTheLongAndWindingTableAndColumnCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<VendorTheLongAndWindingTableAndColumnCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<VendorTheLongAndWindingTableAndColumnCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(VendorTheLongAndWindingTableAndColumnCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "THE_LONG_AND_WINDING_TABLE_AND_COLUMN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(VendorTheLongAndWindingTableAndColumnCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<VendorTheLongAndWindingTableAndColumnCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        VendorTheLongAndWindingTableAndColumnCB cb = new VendorTheLongAndWindingTableAndColumnCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(VendorTheLongAndWindingTableAndColumnCQ sq);

    // ===================================================================================
    //                                                                    Full Text Search
    //                                                                    ================
    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumn The text column. (NotNull, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, No modifier specified)
     */
    public void match(org.dbflute.dbmeta.info.ColumnInfo textColumn
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        assertObjectNotNull("textColumn", textColumn);
        match(newArrayList(textColumn), conditionValue, modifier);
    }

    /**
     * Match for full-text search. <br>
     * Bind variable is unused because the condition value should be literal in MySQL.
     * @param textColumnList The list of text column. (NotNull, NotEmpty, StringColumn, TargetTableColumn)
     * @param conditionValue The condition value embedded without binding (by MySQL restriction) but escaped. (NullAllowed: if null or empty, no condition)
     * @param modifier The modifier of full-text search. (NullAllowed: If the value is null, no modifier specified)
     */
    public void match(List<org.dbflute.dbmeta.info.ColumnInfo> textColumnList
                    , String conditionValue
                    , org.dbflute.dbway.WayOfMySQL.FullTextSearchModifier modifier) {
        xdoMatchForMySQL(textColumnList, conditionValue, modifier);
    }

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected VendorTheLongAndWindingTableAndColumnCB newMyCB() {
        return new VendorTheLongAndWindingTableAndColumnCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return VendorTheLongAndWindingTableAndColumnCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
