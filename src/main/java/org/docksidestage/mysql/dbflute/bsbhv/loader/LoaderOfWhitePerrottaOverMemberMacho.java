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
package org.docksidestage.mysql.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.exentity.*;
import org.docksidestage.mysql.dbflute.cbean.*;

/**
 * The referrer loader of WHITE_PERROTTA_OVER_MEMBER_MACHO as TABLE. <br />
 * <pre>
 * [primary key]
 *     MACHO_CODE
 *
 * [column]
 *     MACHO_CODE, MACHO_NAME
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
 *     white_perrotta_over_member
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whitePerrottaOverMemberList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhitePerrottaOverMemberMacho {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhitePerrottaOverMemberMacho> _selectedList;
    protected BehaviorSelector _selector;
    protected WhitePerrottaOverMemberMachoBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhitePerrottaOverMemberMacho ready(List<WhitePerrottaOverMemberMacho> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhitePerrottaOverMemberMachoBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhitePerrottaOverMemberMachoBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhitePerrottaOverMember> _referrerWhitePerrottaOverMemberList;
    public NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember> loadWhitePerrottaOverMemberList(ConditionBeanSetupper<WhitePerrottaOverMemberCB> refCBLambda) {
        myBhv().loadWhitePerrottaOverMemberList(_selectedList, refCBLambda).withNestedReferrer(new ReferrerListHandler<WhitePerrottaOverMember>() {
            public void handle(List<WhitePerrottaOverMember> referrerList) { _referrerWhitePerrottaOverMemberList = referrerList; }
        });
        return new NestedReferrerLoaderGateway<LoaderOfWhitePerrottaOverMember>() {
            public void withNestedReferrer(ReferrerLoaderHandler<LoaderOfWhitePerrottaOverMember> handler) {
                handler.handle(new LoaderOfWhitePerrottaOverMember().ready(_referrerWhitePerrottaOverMemberList, _selector));
            }
        };
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhitePerrottaOverMemberMacho> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
