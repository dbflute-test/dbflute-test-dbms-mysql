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
 * The referrer loader of (会員ステータス)MEMBER_STATUS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_STATUS_ID
 *
 * [column]
 *     MEMBER_STATUS_ID, MEMBER_ID, MEMBER_STATUS_CODE, MEMBER_STATUS_UPDATE_DATETIME, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_STATUS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER, CDEF_MEMBER_STATUS
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, cdefMemberStatus
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMemberStatus {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMemberStatus> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberStatusBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMemberStatus ready(List<ImmuMemberStatus> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberStatusBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberStatusBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMember _foreignMemberLoader;
    public ImmuLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected ImmuLoaderOfCdefMemberStatus _foreignCdefMemberStatusLoader;
    public ImmuLoaderOfCdefMemberStatus pulloutCdefMemberStatus() {
        if (_foreignCdefMemberStatusLoader == null)
        { _foreignCdefMemberStatusLoader = new ImmuLoaderOfCdefMemberStatus().ready(myBhv().pulloutCdefMemberStatus(_selectedList), _selector); }
        return _foreignCdefMemberStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMemberStatus> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
