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
 * The referrer loader of WHITE_UQ_FK as TABLE. <br />
 * <pre>
 * [primary key]
 *     UQ_FK_ID
 *
 * [column]
 *     UQ_FK_ID, UQ_FK_CODE
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
 *     white_uq_fk_ref
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     whiteUqFkRefByFkToPkIdList, whiteUqFkRefByFkToUqCodeList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWhiteUqFk {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WhiteUqFk> _selectedList;
    protected BehaviorSelector _selector;
    protected WhiteUqFkBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWhiteUqFk ready(List<WhiteUqFk> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WhiteUqFkBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WhiteUqFkBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToPkIdList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToPkIdList(ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        myBhv().loadWhiteUqFkRefByFkToPkIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteUqFkRefByFkToPkIdList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToPkIdList, _selector));
    }

    protected List<WhiteUqFkRef> _referrerWhiteUqFkRefByFkToUqCodeList;
    public NestedReferrerLoaderGateway<LoaderOfWhiteUqFkRef> loadWhiteUqFkRefByFkToUqCodeList(ConditionBeanSetupper<WhiteUqFkRefCB> refCBLambda) {
        myBhv().loadWhiteUqFkRefByFkToUqCodeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWhiteUqFkRefByFkToUqCodeList = refLs);
        return hd -> hd.handle(new LoaderOfWhiteUqFkRef().ready(_referrerWhiteUqFkRefByFkToUqCodeList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WhiteUqFk> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
