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
import org.docksidestage.mysql.dbflute.exbhv.*;
import org.docksidestage.mysql.dbflute.exentity.*;

/**
 * The referrer loader of WHITE_SELF_REFERENCE_REF_ONE as TABLE. <br />
 * <pre>
 * [primary key]
 *     SELF_REFERENCE_ID
 *
 * [column]
 *     SELF_REFERENCE_ID, SELF_REFERENCE_REF_ONE_NAME
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
 *     white_self_reference, WHITE_SELF_REFERENCE(AsDirectParent)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     whiteSelfReference, whiteSelfReferenceAsDirectParent
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteSelfReferenceRefOne {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteSelfReferenceRefOne> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteSelfReferenceRefOneBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteSelfReferenceRefOne ready(List<WhiteSelfReferenceRefOne> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteSelfReferenceRefOneBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteSelfReferenceRefOneBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfWhiteSelfReference _foreignWhiteSelfReferenceLoader;
    public LoaderOfWhiteSelfReference pulloutWhiteSelfReference() {
        if (_foreignWhiteSelfReferenceLoader != null) { return _foreignWhiteSelfReferenceLoader; }
        List<WhiteSelfReference> pulledList = myBhv().pulloutWhiteSelfReference(_selectedList);
        _foreignWhiteSelfReferenceLoader = new LoaderOfWhiteSelfReference().ready(pulledList, _selector);
        return _foreignWhiteSelfReferenceLoader;
    }

    protected LoaderOfWhiteSelfReference _foreignWhiteSelfReferenceAsDirectParentLoader;
    public LoaderOfWhiteSelfReference pulloutWhiteSelfReferenceAsDirectParent() {
        if (_foreignWhiteSelfReferenceAsDirectParentLoader != null) { return _foreignWhiteSelfReferenceAsDirectParentLoader; }
        List<WhiteSelfReference> pulledList = myBhv().pulloutWhiteSelfReferenceAsDirectParent(_selectedList);
        _foreignWhiteSelfReferenceAsDirectParentLoader = new LoaderOfWhiteSelfReference().ready(pulledList, _selector);
        return _foreignWhiteSelfReferenceAsDirectParentLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteSelfReferenceRefOne> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
