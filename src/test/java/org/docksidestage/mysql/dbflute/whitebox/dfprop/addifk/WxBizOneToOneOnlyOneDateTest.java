package org.docksidestage.mysql.dbflute.whitebox.dfprop.addifk;

import java.time.LocalDate;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.MemberAddressCB;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberAddress;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneOnlyOneDateTest extends UnitContainerTestCase {

    private MemberBhv memberBhv;
    private MemberAddressBhv memberAddressBhv;

    public void test_OnlyOneDate_basic() throws Exception {
        // ## Arrange ##
        LocalDate currentDate = currentLocalDate();
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberAddressAsOnlyOneDate(currentDate);
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        MemberCB expectedCB = new MemberCB();
        expectedCB.setupSelect_MemberAddressAsValid(currentDate);
        expectedCB.query().addOrderBy_MemberId_Asc();
        ListResultBean<Member> expectedList = memberBhv.selectList(expectedCB);
        // assert detail just in case
        assertEquals(expectedList.size(), memberList.size());
        boolean exists = false;
        for (int i = 0; i < memberList.size(); i++) {
            Member expected = expectedList.get(i);
            Member member = memberList.get(i);
            MemberAddress address = member.getMemberAddressAsOnlyOneDate().orElse(null);
            log(member.getMemberName() + ", " + address);
            assertEquals(expected, member);
            MemberAddress expectedAddress = expected.getMemberAddressAsValid().orElse(null);
            if (!(expectedAddress == null && address != null)) {
                // if e.g. only 2003-2007 exists, different result
                exists = true;
                assertEquals(expectedAddress, address);
            }
        }
        assertTrue(exists);
        assertEquals(expectedList, memberList);
    }

    public void test_OnlyOneDate_query() throws Exception {
        // ## Arrange ##
        LocalDate currentDate = currentLocalDate();
        MemberAddressCB cb = new MemberAddressCB();
        cb.setupSelect_Member().withMemberAddressAsOnlyOneDate(currentDate);
        cb.query().queryMember().queryMemberAddressAsOnlyOneDate(currentDate).setMemberAddressId_IsNotNull();

        // ## Act ##
        ListResultBean<MemberAddress> addressList = memberAddressBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(addressList);
        for (MemberAddress address : addressList) {
            log(address.getMember().get().getMemberAddressAsOnlyOneDate());
        }
    }
}