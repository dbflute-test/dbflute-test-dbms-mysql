package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.cbean.result.PagingResultBean;
import org.dbflute.exception.EntityDuplicatedException;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.exbhv.VendorLargeDataRefBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.LargeAutoPagingPmb;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.LargeManualPagingPmb;
import org.docksidestage.mysql.dbflute.exentity.customize.LargeAutoPaging;
import org.docksidestage.mysql.dbflute.exentity.customize.LargeManualPaging;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/11 Tuesday)
 */
public class WxOutsideSqlAutoPagingMySQLTest extends UnitContainerTestCase {

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

    // ===================================================================================
    //                                                                          Fetch Size
    //                                                                          ==========
    public void test_pagingSynchronizedFetchSize_DBFluteConfig() throws Exception {
        assertTrue(DBFluteConfig.getInstance().isUsePagingByCursorSkipSynchronizedFetchSize());
        assertEquals(Integer.MIN_VALUE, DBFluteConfig.getInstance().getFixedPagingByCursorSkipSynchronizedFetchSize());
    }

    public void test_pagingSynchronizedFetchSize_autoPaging() throws Exception {
        // ## Arrange ##
        boolean originally = DBFluteConfig.getInstance().isInternalDebug(); // for looking
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setInternalDebug(true);
        try {
            LargeAutoPagingPmb pmb = new LargeAutoPagingPmb();
            pmb.paging(20, 2);

            // ## Act ##
            // ## Assert ##
            PagingResultBean<LargeAutoPaging> page = vendorLargeDataRefBhv.outsideSql().selectPage(pmb); // expects no exception
            assertHasAnyElement(page);
        } finally {
            DBFluteConfig.getInstance().setInternalDebug(originally);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_pagingSynchronizedFetchSize_entitySelect() throws Exception {
        // ## Arrange ##
        boolean originally = DBFluteConfig.getInstance().isInternalDebug(); // for looking
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setInternalDebug(true);
        try {
            LargeAutoPagingPmb pmb = new LargeAutoPagingPmb();
            try {
                // ## Act ##
                // ## Assert ##
                vendorLargeDataRefBhv.outsideSql().selectEntity(pmb); // expects no exception
                fail();
            } catch (EntityDuplicatedException e) { // needs manual test by large data
                log(e.getMessage());
            }
        } finally {
            DBFluteConfig.getInstance().setInternalDebug(originally);
            DBFluteConfig.getInstance().lock();
        }
    }

    public void test_pagingSynchronizedFetchSize_manualPaging() throws Exception {
        boolean originally = DBFluteConfig.getInstance().isInternalDebug(); // for looking
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setInternalDebug(true);
        try {
            LargeManualPagingPmb pmb = new LargeManualPagingPmb();
            pmb.paging(20, 2);
            PagingResultBean<LargeManualPaging> page = vendorLargeDataRefBhv.outsideSql().selectPage(pmb); // expects no exception
            assertHasAnyElement(page);
        } finally {
            DBFluteConfig.getInstance().setInternalDebug(originally);
            DBFluteConfig.getInstance().lock();
        }
    }
}
