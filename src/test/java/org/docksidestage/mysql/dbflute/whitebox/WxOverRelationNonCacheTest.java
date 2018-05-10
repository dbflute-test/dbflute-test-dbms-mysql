package org.docksidestage.mysql.dbflute.whitebox;

import java.util.Map;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.cbean.WhitePerrottaOverMemberCB;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverMemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverMemberMachoBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverProductBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverProductNestedBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhitePerrottaOverTraceBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberLogin;
import org.docksidestage.mysql.dbflute.exentity.MemberStatus;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverMember;
import org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverMemberMacho;
import org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverProduct;
import org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverProductNested;
import org.docksidestage.mysql.dbflute.exentity.WhitePerrottaOverTrace;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5K (2014/08/22 Friday)
 */
public class WxOverRelationNonCacheTest extends UnitContainerTestCase {

    private WhitePerrottaOverMemberBhv whitePerrottaOverMemberBhv;
    private WhitePerrottaOverMemberMachoBhv whitePerrottaOverMemberMachoBhv;
    private WhitePerrottaOverProductBhv whitePerrottaOverProductBhv;
    private WhitePerrottaOverProductNestedBhv whitePerrottaOverProductNestedBhv;
    private WhitePerrottaOverTraceBhv whitePerrottaOverTraceBhv;
    private PurchaseBhv purchaseBhv;

    public void test_nonCache_when_UnderOverRelation_basic() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhitePerrottaOverMemberCB cb = new WhitePerrottaOverMemberCB();
        cb.setupSelect_WhitePerrottaOverMemberMacho();
        cb.setupSelect_WhitePerrottaOverProduct().withWhitePerrottaOverProductNested();
        cb.setupSelect_WhitePerrottaOverProduct().withWhitePerrottaOverTraceAsPerrotta();
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<WhitePerrottaOverMember> memberList = whitePerrottaOverMemberBhv.selectList(cb);

        // ## Assert ##
        // sea (1) -> CupRamen(21) -(over)-> {21, FOO}
        // land(2) -> CupRamen(21) -(over)-> {21, BAR}
        // iks (3) -> Coffee  (21) -(over)-> null
        for (WhitePerrottaOverMember member : memberList) {
            WhitePerrottaOverProduct product = member.getWhitePerrottaOverProduct().get();
            Integer productId = product.getProductId();
            String productName = product.getProductName();
            WhitePerrottaOverTrace trace = product.getWhitePerrottaOverTraceAsPerrotta().orElse(null);
            Integer previousProductId = trace != null ? trace.getPreviousProductId() : null;
            Integer nextProductId = trace != null ? trace.getNextProductId() : null;
            String traceType = trace != null ? trace.getTraceTypeCode() : null;
            Integer traceHash = trace != null ? trace.instanceHash() : null;
            log(member.getMemberName(), productId, productName, previousProductId, nextProductId, traceType, traceHash);
        }

        assertEquals(3, memberList.size());
        WhitePerrottaOverMember firstMember = memberList.get(0);
        WhitePerrottaOverMember secondMember = memberList.get(1);
        WhitePerrottaOverMember thirdMember = memberList.get(2);
        assertEquals(Long.valueOf(1), firstMember.getMemberId());
        assertEquals(Long.valueOf(2), secondMember.getMemberId());
        assertEquals(Long.valueOf(3), thirdMember.getMemberId());
        assertEquals("sea", firstMember.getMemberName());
        assertEquals("land", secondMember.getMemberName());
        assertEquals("iks", thirdMember.getMemberName());
        assertNotSame(firstMember, secondMember);
        assertNotSame(firstMember.instanceHash(), secondMember.instanceHash());

        WhitePerrottaOverProduct firstProduct = firstMember.getWhitePerrottaOverProduct().get();
        WhitePerrottaOverProduct secondProduct = secondMember.getWhitePerrottaOverProduct().get();
        WhitePerrottaOverProduct thirdProduct = thirdMember.getWhitePerrottaOverProduct().get();
        assertEquals(Long.valueOf(21), firstProduct.getProductId());
        assertEquals(firstProduct.getProductId(), secondProduct.getProductId());
        assertEquals("CupRamen", firstProduct.getProductName());
        assertEquals(Long.valueOf(23), thirdProduct.getProductId());
        assertNotSame(firstProduct, secondProduct);
        assertNotSame(firstProduct.instanceHash(), secondProduct.instanceHash());

        WhitePerrottaOverTrace firstTrace = firstProduct.getWhitePerrottaOverTraceAsPerrotta().get();
        WhitePerrottaOverTrace secondTrace = secondProduct.getWhitePerrottaOverTraceAsPerrotta().get();
        assertNull(thirdProduct.getWhitePerrottaOverTraceAsPerrotta().orElse(null));
        assertEquals(Long.valueOf(301), firstTrace.getTraceId());
        assertEquals(Long.valueOf(302), secondTrace.getTraceId());
        assertNotSame(firstTrace, secondTrace);
        assertNotSame(firstTrace.instanceHash(), secondTrace.instanceHash());

        WhitePerrottaOverProductNested firstNested = firstProduct.getWhitePerrottaOverProductNested().get();
        WhitePerrottaOverProductNested secondNested = secondProduct.getWhitePerrottaOverProductNested().get();
        assertSame(firstNested, secondNested);
        assertEquals(firstNested.instanceHash(), secondNested.instanceHash());

        WhitePerrottaOverMemberMacho firstMacho = firstMember.getWhitePerrottaOverMemberMacho().get();
        WhitePerrottaOverMemberMacho secondMacho = secondMember.getWhitePerrottaOverMemberMacho().get();
        WhitePerrottaOverMemberMacho thirdMacho = thirdMember.getWhitePerrottaOverMemberMacho().get();
        assertEquals("AAA", firstMacho.getMachoCode());
        assertEquals("BBB", secondMacho.getMachoCode());
        assertEquals("AAA", thirdMacho.getMachoCode());
        assertEquals("Foo", firstMacho.getMachoName());
        assertEquals("Bar", secondMacho.getMachoName());
        assertEquals("Foo", thirdMacho.getMachoName());
        assertSame(firstMacho, thirdMacho);
        assertEquals(firstMacho.instanceHash(), thirdMacho.instanceHash());
    }

    public void test_normalOverRelation_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignBindOverTest(3);

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<Long, MemberLogin> loginMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember().get();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertNotSame(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberLogin login = member.getMemberLoginAsForeignForeignBindOverTest().orElse(null);
            if (login != null) {
                MemberLogin existingLogin = loginMap.get(login.getMemberLoginId());
                if (existingLogin != null) {
                    assertNotSame(login.instanceHash(), existingLogin.instanceHash());
                    markHere("existsLogin");
                }
                loginMap.put(login.getMemberLoginId(), login);
            }
        }
        assertMarked("existsMember");
        assertMarked("existsLogin");
    }

    public void test_normalOverRelation_nested() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberLoginAsForeignForeignBindOverTest(3).withMemberStatus();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<Long, MemberLogin> loginMap = newHashMap();
        Map<String, MemberStatus> statusMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember().get();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertNotSame(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberLogin login = member.getMemberLoginAsForeignForeignBindOverTest().orElse(null);
            if (login != null) {
                MemberLogin existingLogin = loginMap.get(login.getMemberLoginId());
                if (existingLogin != null) {
                    assertNotSame(login.instanceHash(), existingLogin.instanceHash());
                    markHere("existsLogin");
                }
                loginMap.put(login.getMemberLoginId(), login);
                MemberStatus status = login.getMemberStatus().orElse(null);
                if (status != null) {
                    MemberStatus existingStatus = statusMap.get(status.getMemberStatusCode());
                    if (existingStatus != null) {
                        assertEquals(status.instanceHash(), existingStatus.instanceHash());
                        markHere("existsStatus");
                    }
                    statusMap.put(status.getMemberStatusCode(), status);
                }
            }
        }
        assertMarked("existsMember");
        assertMarked("existsLogin");
        assertMarked("existsStatus");
    }

    public void test_normalFixedCondition_basic() throws Exception {
        // ## Arrange ##
        PurchaseCB cb = new PurchaseCB();
        cb.setupSelect_Member().withMemberStatus();

        // ## Act ##
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(purchaseList);
        Map<Integer, Member> memberMap = newHashMap();
        Map<String, MemberStatus> statusMap = newHashMap();
        for (Purchase purchase : purchaseList) {
            Member member = purchase.getMember().get();
            Member existingMember = memberMap.get(member.getMemberId());
            if (existingMember != null) {
                assertEquals(member.instanceHash(), existingMember.instanceHash());
                markHere("existsMember");
            }
            memberMap.put(member.getMemberId(), member);
            MemberStatus status = member.getMemberStatus().orElse(null);
            if (status != null) {
                MemberStatus existingStatus = statusMap.get(status.getMemberStatusCode());
                if (existingStatus != null) {
                    assertEquals(status.instanceHash(), existingStatus.instanceHash());
                    markHere("existsStatus");
                }
                statusMap.put(status.getMemberStatusCode(), status);
            }
        }
        assertMarked("existsMember");
        assertMarked("existsStatus");
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void registerTestData() {
        registerNested("DOC", "DockSideStage");
        registerNested("HUN", "HungerStage");
        registerProduct(21, "CupRamen", "HUN");
        registerProduct(22, "Uchiwa", "HUN");
        registerProduct(23, "Coffee", "DOC");
        registerMacho("AAA", "Foo");
        registerMacho("BBB", "Bar");
        registerMember(1, "sea", 21, "FOO", "AAA");
        registerMember(2, "land", 21, "BAR", "BBB");
        registerMember(3, "iks", 23, "BAR", "AAA");
        registerTrace(301L, 21, 22, "FOO");
        registerTrace(302L, 21, 23, "BAR");
    }

    protected void registerNested(String code, String name) {
        WhitePerrottaOverProductNested nested = new WhitePerrottaOverProductNested();
        nested.setProductNestedCode(code);
        nested.setProductNestedName(name);
        whitePerrottaOverProductNestedBhv.insert(nested);
    }

    protected void registerProduct(Integer id, String name, String nested) {
        WhitePerrottaOverProduct product = new WhitePerrottaOverProduct();
        product.setProductId(id);
        product.setProductName(name);
        product.setProductNestedCode(nested);
        whitePerrottaOverProductBhv.insert(product);
    }

    protected void registerMacho(String code, String name) {
        WhitePerrottaOverMemberMacho nested = new WhitePerrottaOverMemberMacho();
        nested.setMachoCode(code);
        nested.setMachoName(name);
        whitePerrottaOverMemberMachoBhv.insert(nested);
    }

    protected void registerMember(Integer memberId, String name, Integer productId, String traceType, String machoCode) {
        WhitePerrottaOverMember member = new WhitePerrottaOverMember();
        member.setMemberId(memberId);
        member.setMemberName(name);
        member.setProductId(productId);
        member.setTraceTypeCode(traceType);
        member.setMachoCode(machoCode);
        whitePerrottaOverMemberBhv.insert(member);
    }

    protected void registerTrace(Long traceId, Integer previousId, Integer nextId, String traceType) {
        WhitePerrottaOverTrace trace = new WhitePerrottaOverTrace();
        trace.setTraceId(traceId);
        trace.setPreviousProductId(previousId);
        trace.setNextProductId(nextId);
        trace.setTraceTypeCode(traceType);
        whitePerrottaOverTraceBhv.insert(trace);
    }

    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
    // wall
}
