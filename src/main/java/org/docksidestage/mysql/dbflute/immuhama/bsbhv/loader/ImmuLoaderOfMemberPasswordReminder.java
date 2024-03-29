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
 * The referrer loader of (会員パスワードリマインダ)MEMBER_PASSWORD_REMINDER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MEMBER_PASSWORD_REMINDER_ID
 *
 * [column]
 *     MEMBER_PASSWORD_REMINDER_ID, MEMBER_ID, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MEMBER_PASSWORD_REMINDER_ID
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
 *     member
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class ImmuLoaderOfMemberPasswordReminder {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ImmuMemberPasswordReminder> _selectedList;
    protected BehaviorSelector _selector;
    protected ImmuMemberPasswordReminderBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ImmuLoaderOfMemberPasswordReminder ready(List<ImmuMemberPasswordReminder> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ImmuMemberPasswordReminderBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ImmuMemberPasswordReminderBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected ImmuLoaderOfMember _foreignMemberLoader;
    public ImmuLoaderOfMember pulloutMember() {
        if (_foreignMemberLoader == null)
        { _foreignMemberLoader = new ImmuLoaderOfMember().ready(myBhv().pulloutMember(_selectedList), _selector); }
        return _foreignMemberLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ImmuMemberPasswordReminder> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
