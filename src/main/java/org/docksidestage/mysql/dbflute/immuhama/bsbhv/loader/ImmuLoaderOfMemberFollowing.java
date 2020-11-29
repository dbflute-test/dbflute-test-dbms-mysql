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
 * The referrer loader of (会員フォローイング)MEMBER_FOLLOWING as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_FOLLOWING_ID
 *
 * [column]
 *     MEMBER_FOLLOWING_ID, MY_MEMBER_ID, YOUR_MEMBER_ID, FOLLOW_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_FOLLOWING_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     MEMBER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     memberByMyMemberId, memberByYourMemberId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMemberFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMemberFollowing> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberFollowingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMemberFollowing ready(List<ImmuMemberFollowing> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberFollowingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberFollowingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMember _foreignMemberByMyMemberIdLoader;
    public ImmuLoaderOfMember pulloutMemberByMyMemberId() {
        if (_foreignMemberByMyMemberIdLoader == null)
        { _foreignMemberByMyMemberIdLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMemberByMyMemberId(_selectedList), _selector); }
        return _foreignMemberByMyMemberIdLoader;
    }

    protected ImmuLoaderOfMember _foreignMemberByYourMemberIdLoader;
    public ImmuLoaderOfMember pulloutMemberByYourMemberId() {
        if (_foreignMemberByYourMemberIdLoader == null)
        { _foreignMemberByYourMemberIdLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMemberByYourMemberId(_selectedList), _selector); }
        return _foreignMemberByYourMemberIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMemberFollowing> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
