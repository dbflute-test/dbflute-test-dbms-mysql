package org.docksidestage.mysql.dbflute.resola.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.docksidestage.mysql.dbflute.resola.exbhv.*;
import org.docksidestage.mysql.dbflute.resola.exentity.*;

/**
 * The referrer loader of station as TABLE.
 * @author DBFlute(AutoGenerator)
 */
public class ResolaLoaderOfStation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ResolaStation> _selectedList;
    protected BehaviorSelector _selector;
    protected ResolaStationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public ResolaLoaderOfStation ready(List<ResolaStation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ResolaStationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ResolaStationBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ResolaStation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
