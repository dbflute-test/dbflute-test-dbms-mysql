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
import org.docksidestage.mysql.dbflute.immuhama.exbhv.*;
import org.docksidestage.mysql.dbflute.immuhama.exentity.*;

/**
 * The referrer loader of (会員退会情報)MEMBER_WITHDRAWAL as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ID
 *
 * [column]
 *     MEMBER_ID, WITHDRAWAL_REASON_CODE, WITHDRAWAL_REASON_INPUT_TEXT, WITHDRAWAL_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
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
 *     MEMBER, CDEF_WITHDRAWAL_REASON
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, cdefWithdrawalReason
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMemberWithdrawal {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMemberWithdrawal> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberWithdrawalBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMemberWithdrawal ready(List<ImmuMemberWithdrawal> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberWithdrawalBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberWithdrawalBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMember _foreignMemberLoader;
    public ImmuLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected ImmuLoaderOfCdefWithdrawalReason _foreignCdefWithdrawalReasonLoader;
    public ImmuLoaderOfCdefWithdrawalReason pulloutCdefWithdrawalReason() {
        if (_foreignCdefWithdrawalReasonLoader == null)
        { _foreignCdefWithdrawalReasonLoader = new ImmuLoaderOfCdefWithdrawalReason().ready(myBhv().pulloutCdefWithdrawalReason(_selectedList), _selector); }
        return _foreignCdefWithdrawalReasonLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMemberWithdrawal> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
