package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.util.Set;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.dbflute.exentity.SummaryWithdrawal;
import org.docksidestage.mysql.dbflute.exentity.WhiteNoPkRelation;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.1 (2012/11/05 Monday)
 */
public class WxCBRelationMappingNoPKTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private PurchaseBhv purchaseBhv;

    // ===================================================================================
    //                                                                      First Relation
    //                                                                      ==============
    public void test_firstRelation_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_WhiteNoPkRelation();
        cb.setupSelect_SummaryWithdrawal();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Set<Integer> productIdSet = newHashSet();
        Set<String> productHashSet = newHashSet();
        Set<Integer> withdrawalIdSet = newHashSet();
        Set<String> withdrawalHashSet = newHashSet();
        boolean existsWithdrawal = false;
        for (Purchase purchase : purchaseList) {
            WhiteNoPkRelation relation = purchase.getWhiteNoPkRelation().get();
            Integer productId = relation.getProductId();
            String productName = relation.getProductName();
            assertNotNull(productName);
            assertEquals(purchase.getProductId(), productId);
            productIdSet.add(productId);
            String productHash = Integer.toHexString(relation.instanceHash());
            productHashSet.add(productHash);

            SummaryWithdrawal withdrawal = purchase.getSummaryWithdrawal().orElse(null);
            if (withdrawal != null) {
                Integer memberId = withdrawal.getMemberId();
                String memberName = withdrawal.getMemberName();
                assertNotNull(memberName);
                assertEquals(purchase.getMemberId(), memberId);
                withdrawalIdSet.add(memberId);
                String withdrawalHash = Integer.toHexString(withdrawal.instanceHash());
                withdrawalHashSet.add(withdrawalHash);
                log(productId, productName, productHash, memberId, memberName, withdrawalHash);
                existsWithdrawal = true;
            } else {
                log(productId, productName, productHash);
            }
        }
        assertTrue(existsWithdrawal);
        log(productIdSet.size() + " = " + productHashSet.size());
        assertEquals(productIdSet.size(), productHashSet.size());
        log(withdrawalIdSet.size() + " = " + withdrawalHashSet.size());
        assertEquals(withdrawalIdSet.size(), withdrawalHashSet.size());
    }

    // ===================================================================================
    //                                                                       Next Relation
    //                                                                       =============
    public void test_nextRelation_basic() {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_PurchaseSelf().withSummaryWithdrawal();
        cb.setupSelect_PurchaseSelf().withWhiteNoPkRelation();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Set<Integer> productIdSet = newHashSet();
        Set<String> productHashSet = newHashSet();
        Set<Integer> withdrawalIdSet = newHashSet();
        Set<String> withdrawalHashSet = newHashSet();
        boolean existsWithdrawal = false;
        for (Purchase purchase : purchaseList) {
            Purchase purchaseSelf = purchase.getPurchaseSelf().get();
            WhiteNoPkRelation relation = purchaseSelf.getWhiteNoPkRelation().get();
            Integer productId = relation.getProductId();
            String productName = relation.getProductName();
            assertNotNull(productName);
            assertEquals(purchaseSelf.getProductId(), productId);
            productIdSet.add(productId);
            String productHash = Integer.toHexString(relation.instanceHash());
            productHashSet.add(productHash);

            SummaryWithdrawal withdrawal = purchaseSelf.getSummaryWithdrawal().orElse(null);
            if (withdrawal != null) {
                Integer memberId = withdrawal.getMemberId();
                String memberName = withdrawal.getMemberName();
                assertNotNull(memberName);
                assertEquals(purchaseSelf.getMemberId(), memberId);
                withdrawalIdSet.add(memberId);
                String withdrawalHash = Integer.toHexString(withdrawal.instanceHash());
                withdrawalHashSet.add(withdrawalHash);
                log(productId, productName, productHash, memberId, memberName, withdrawalHash);
                existsWithdrawal = true;
            } else {
                log(productId, productName, productHash);
            }
        }
        assertTrue(existsWithdrawal);
        log(productIdSet.size() + " = " + productHashSet.size());
        assertEquals(productIdSet.size(), productHashSet.size());
        log(withdrawalIdSet.size() + " = " + withdrawalHashSet.size());
        assertEquals(withdrawalIdSet.size(), withdrawalHashSet.size());
    }
}
