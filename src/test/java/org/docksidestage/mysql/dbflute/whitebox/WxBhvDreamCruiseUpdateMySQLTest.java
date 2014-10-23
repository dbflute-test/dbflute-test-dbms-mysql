package org.docksidestage.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/12/15 Saturday)
 */
public class WxBhvDreamCruiseUpdateMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private PurchaseBhv purchaseBhv;
    private boolean originallyCheckCountBeforeQueryUpdate;

    // ===================================================================================
    //                                                                             Prepare
    //                                                                             =======
    @Override
    public void setUp() throws Exception {
        super.setUp();
        originallyCheckCountBeforeQueryUpdate = DBFluteConfig.getInstance().isQueryUpdateCountPreCheck();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(false);
    }

    @Override
    public void tearDown() throws Exception {
        DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(originallyCheckCountBeforeQueryUpdate);
        DBFluteConfig.getInstance().unlock();
        super.tearDown();
    }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    public void test_varyingUpdate_SelfCalculation_DreamCruise_plain() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPurchaseId(3L);
        purchase.setPaymentCompleteFlg_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // ## Act ##
            purchaseBhv.varyingUpdateNonstrict(purchase, op -> op.self(new SpecifyQuery<PurchaseCB>() {
                public void specify(PurchaseCB cb) {
                    cb.specify().columnPurchasePrice();
                }
            }).multiply(new PurchaseCB().dreamCruiseCB().specify().columnPurchaseCount()));

            // ## Assert ##
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            assertTrue(sql.contains("set PURCHASE_PRICE = ((PURCHASE_PRICE - 13) * PURCHASE_COUNT + 13)"));
            assertTrue(sql.contains(", VERSION_NO = VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_varyingQueryUpdate_SelfCalculation_DreamCruise_plain() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPaymentCompleteFlg_True();

        PurchaseCB cb = new PurchaseCB();
        cb.query().setPaymentCompleteFlg_Equal_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            int updatedCount = purchaseBhv.varyingQueryUpdate(purchase, cb, op -> op.self(colCB -> {
                colCB.specify().columnPurchasePrice();
            }).multiply(cb.dreamCruiseCB().specify().columnPurchaseCount()));

            // ## Assert ##
            assertNotSame(0, updatedCount);
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            assertTrue(sql.contains("set PURCHASE_PRICE = ((PURCHASE_PRICE - 13) * PURCHASE_COUNT + 13)"));
            assertTrue(sql.contains(", VERSION_NO = VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_varyingQueryUpdate_SelfCalculation_DreamCruise_joined() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPaymentCompleteFlg_True();

        PurchaseCB cb = new PurchaseCB();
        cb.query().queryMember().setMemberStatusCode_Equal_Formalized();
        cb.query().setPaymentCompleteFlg_Equal_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            int updatedCount = purchaseBhv.varyingQueryUpdate(
                    purchase,
                    cb,
                    op -> op.self(colCB -> {
                        colCB.specify().columnPurchasePrice();
                    }).multiply(cb.dreamCruiseCB().specify().columnPurchaseCount())
                            .divide(cb.dreamCruiseCB().specify().specifyMember().columnMemberId()));

            // ## Assert ##
            assertNotSame(0, updatedCount);
            assertHasOnlyOneElement(infoList);
            SqlLogInfo info = infoList.get(0);
            String sql = info.getDisplaySql();
            String left = "set dfloc.PURCHASE_PRICE";
            assertTrue(sql.contains(left
                    + " = (((dfloc.PURCHASE_PRICE - 13) * dfloc.PURCHASE_COUNT) / dfrel_0.MEMBER_ID + 13)"));
            assertTrue(sql.contains(", dfloc.VERSION_NO = dfloc.VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }
}
