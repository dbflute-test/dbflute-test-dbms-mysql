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
 * The referrer loader of (会員住所)MEMBER_ADDRESS as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_ADDRESS_ID
 *
 * [column]
 *     MEMBER_ADDRESS_ID, MEMBER_ID, VALID_BEGIN_DATE, ADDRESS, REGION_ID, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_ADDRESS_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER, CDEF_REGION
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     member, cdefRegion
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMemberAddress {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMemberAddress> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberAddressBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMemberAddress ready(List<ImmuMemberAddress> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberAddressBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberAddressBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMember _foreignMemberLoader;
    public ImmuLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    protected ImmuLoaderOfCdefRegion _foreignCdefRegionLoader;
    public ImmuLoaderOfCdefRegion pulloutCdefRegion() {
        if (_foreignCdefRegionLoader == null)
        { _foreignCdefRegionLoader = new ImmuLoaderOfCdefRegion().ready(myBhv().pulloutCdefRegion(_selectedList), _selector); }
        return _foreignCdefRegionLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMemberAddress> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
