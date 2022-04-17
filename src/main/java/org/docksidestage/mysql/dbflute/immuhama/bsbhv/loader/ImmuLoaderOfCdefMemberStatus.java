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
package org.docksidestage.mysql.dbflute.immuhama.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;
import org.docksidestage.mysql.dbflute.immuhama.cbean.*;

/**
 * The referrer loader of ([区分値]会員ステータス)CDEF_MEMBER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_CODE
 *
 * [column]
 *     MEMBER_STATUS_CODE, MEMBER_STATUS_NAME, DESCRIPTION, DISPLAY_ORDER
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
 *     MEMBER_LOGIN, MEMBER_STATUS
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     memberLoginList, memberStatusList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfCdefMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuCdefMemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuCdefMemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfCdefMemberStatus ready(List<ImmuCdefMemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuCdefMemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuCdefMemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<ImmuMemberLogin> _referrerMemberLogin;

    /**
     * Load referrer of memberLoginList by the set-upper of referrer. <br>
     * (会員ログイン)MEMBER_LOGIN by LOGIN_MEMBER_STATUS_CODE, named 'memberLoginList'.
     * <pre>
     * <span style="color: #0000C0">cdefMemberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cdefMemberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadMemberLogin</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuCdefMemberStatus cdefMemberStatus : <span style="color: #553000">cdefMemberStatusList</span>) {
     *     ... = cdefMemberStatus.<span style="color: #CC4747">getMemberLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setLoginMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_LoginMemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberLogin> loadMemberLogin(ReferrerConditionSetupper<ImmuMemberLoginCB> refCBLambda) {
        myBhv().loadMemberLogin(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberLogin = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberLogin().ready(_referrerMemberLogin, _selector));
    }

    protected List<ImmuMemberStatus> _referrerMemberStatus;

    /**
     * Load referrer of memberStatusList by the set-upper of referrer. <br>
     * (会員ステータス)MEMBER_STATUS by MEMBER_STATUS_CODE, named 'memberStatusList'.
     * <pre>
     * <span style="color: #0000C0">cdefMemberStatusBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">cdefMemberStatusList</span>, <span style="color: #553000">statusLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">statusLoader</span>.<span style="color: #CC4747">loadMemberStatus</span>(<span style="color: #553000">statusCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">statusCB</span>.setupSelect...
     *         <span style="color: #553000">statusCB</span>.query().set...
     *         <span style="color: #553000">statusCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">statusLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    statusLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (ImmuCdefMemberStatus cdefMemberStatus : <span style="color: #553000">cdefMemberStatusList</span>) {
     *     ... = cdefMemberStatus.<span style="color: #CC4747">getMemberStatusList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMemberStatusCode_InScope(pkList);
     * cb.query().addOrderBy_MemberStatusCode_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<ImmuLoaderOfMemberStatus> loadMemberStatus(ReferrerConditionSetupper<ImmuMemberStatusCB> refCBLambda) {
        myBhv().loadMemberStatus(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMemberStatus = refLs);
        return hd -> hd.handle(new ImmuLoaderOfMemberStatus().ready(_referrerMemberStatus, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuCdefMemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
