package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityDuplicatedException;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.cbean.VendorLargeDataRefCB;
import org.docksidestage.mysql.dbflute.exbhv.VendorLargeDataRefBhv;
import org.docksidestage.mysql.dbflute.exentity.VendorLargeDataRef;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/11 Tuesday)
 */
public class WxEntitySelectMySQLTest extends UnitContainerTestCase {

    private VendorLargeDataRefBhv vendorLargeDataRefBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    public void tearDown() throws Exception {
        vendorLargeDataRefBhv.getFetchSizeMap().clear();
        vendorLargeDataRefBhv.getRowDataClassMap().clear();
        super.tearDown();
    }

    @Override
    protected boolean isUseOneTimeContainer() {
        return true;
    }

    @Override
    protected boolean isDestroyContainerAtTearDown() {
        return true;
    }

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
    public void test_pagingSynchronizedFetchSize_DBFluteConfig() throws Exception {
        assertEquals(Integer.MIN_VALUE, DBFluteConfig.getInstance().getEntitySelectFetchSize());
    }

    public void test_entitySelectFetchSize_defaultFetchSize() throws Exception {
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.query().setLargeDataRefId_IsNotNull(); // to avoid no condition exception

        try {
            vendorLargeDataRefBhv.selectEntity(cb).get();
            fail();
        } catch (EntityDuplicatedException e) { // needs manual test by large data
            log(e.getMessage());
        }
        assertEquals(Integer.MIN_VALUE, vendorLargeDataRefBhv.getFetchSizeMap().get("selectEntity"));
        assertEquals(com.mysql.jdbc.RowDataDynamic.class, vendorLargeDataRefBhv.getRowDataClassMap().get("selectEntity"));
    }

    public void test_entitySelectFetchSize_selectList_static() {
        // ## Arrange ##
        VendorLargeDataRefCB cb = new VendorLargeDataRefCB();
        cb.query().setLargeDataId_Equal(1L);
        int countAll = vendorLargeDataRefBhv.selectCount(cb);

        // ## Act ##
        ListResultBean<VendorLargeDataRef> memberList = vendorLargeDataRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        assertEquals(countAll, memberList.size());
        assertEquals(0, vendorLargeDataRefBhv.getFetchSizeMap().get("selectList"));
        assertEquals(com.mysql.jdbc.RowDataStatic.class, vendorLargeDataRefBhv.getRowDataClassMap().get("selectList"));
    }
}
