package org.docksidestage.mysql.dbflute.whitebox.dfprop.addifk;

import java.time.LocalDateTime;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.dbflute.exentity.SummaryWithdrawal;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/12/17 Monday)
 */
public class WxBizManyToOnePlainRelationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_NonPKRelation_SpecifyColumn_foreignColumn_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_SummaryWithdrawal(); // non PK relation
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifySummaryWithdrawal().columnWithdrawalDatetime();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            SummaryWithdrawal withdrawal = purchase.getSummaryWithdrawal().orElse(null);
            Integer memberId = withdrawal != null ? withdrawal.getMemberId() : null;
            LocalDateTime withdrawalDatetime = withdrawal != null ? withdrawal.getWithdrawalDatetime() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, withdrawalDatetime);
            if (withdrawalDatetime != null) {
                assertNotNull(withdrawal.getMemberId());
                assertNotNull(memberId);
                assertNotNull(withdrawalDatetime);
                assertNull(withdrawal.xznocheckGetMemberStatusCode());
                assertNonSpecifiedAccess(() -> withdrawal.getWithdrawalReasonCode());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_NonPKRelation_SpecifyColumn_foreignColumn_duplicateSpecify() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_SummaryWithdrawal(); // non PK relation
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifySummaryWithdrawal().columnMemberId(); // duplicate specify
        cb.specify().specifySummaryWithdrawal().columnWithdrawalDatetime();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            SummaryWithdrawal withdrawal = purchase.getSummaryWithdrawal().orElse(null);
            Integer memberId = withdrawal != null ? withdrawal.getMemberId() : null;
            LocalDateTime withdrawalDatetime = withdrawal != null ? withdrawal.getWithdrawalDatetime() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, withdrawalDatetime);
            if (withdrawalDatetime != null) {
                assertNotNull(withdrawal.getMemberId());
                assertNotNull(memberId);
                assertNotNull(withdrawalDatetime);
                assertNull(withdrawal.xznocheckGetMemberStatusCode());
                assertNonSpecifiedAccess(() -> withdrawal.getWithdrawalReasonCode());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }
}
