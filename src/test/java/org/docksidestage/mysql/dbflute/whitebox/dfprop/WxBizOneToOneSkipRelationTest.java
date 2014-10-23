package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exentity.MemberAddress;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneSkipRelationTest extends UnitContainerTestCase {

    private PurchaseBhv purchaseBhv;

    public void test_SkipRelation_SpecifyColumn_foreignColumn_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_MemberAddressAsSkipRelation(currentDate());
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifyMemberAddressAsSkipRelation().columnAddress();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            MemberAddress address = purchase.getMemberAddressAsSkipRelation();
            Integer memberId = address != null ? address.getMemberId() : null;
            String addressStr = address != null ? address.getAddress() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, addressStr);
            if (address != null) {
                assertNotNull(address.getMemberAddressId());
                assertNotNull(memberId);
                assertNotNull(addressStr);
                assertNull(address.xznocheckGetRegionId());
                assertNonSpecifiedAccess(() -> address.getRegionId());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }

    public void test_SkipRelation_SpecifyColumn_foreignColumn_duplicateSpecify() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_MemberAddressAsSkipRelation(currentDate());
        cb.specify().columnMemberId(); // duplicate specify
        cb.specify().columnPurchaseDatetime();
        cb.specify().specifyMemberAddressAsSkipRelation().columnAddress();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        boolean exists = false;
        for (Purchase purchase : purchaseList) {
            MemberAddress address = purchase.getMemberAddressAsSkipRelation();
            Integer memberId = address != null ? address.getMemberId() : null;
            String addressStr = address != null ? address.getAddress() : null;
            log(purchase.getPurchaseId(), purchase.getPurchaseDatetime(), memberId, addressStr);
            if (address != null) {
                assertNotNull(address.getMemberAddressId());
                assertNotNull(memberId);
                assertNotNull(addressStr);
                assertNull(address.xznocheckGetRegionId());
                assertNonSpecifiedAccess(() -> address.getRegionId());
                assertEquals(purchase.getMemberId(), memberId);
                exists = true;
            }
        }
        assertTrue(exists);
    }
}