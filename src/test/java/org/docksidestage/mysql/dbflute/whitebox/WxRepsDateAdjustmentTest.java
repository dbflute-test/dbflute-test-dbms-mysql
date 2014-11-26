package org.docksidestage.mysql.dbflute.whitebox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.coption.LikeSearchOption;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.helper.HandyDate;
import org.dbflute.util.DfTypeUtil;
import org.docksidestage.mysql.dbflute.cbean.MemberAddressCB;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteDateAdjustmentCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteDateAdjustmentBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.OptionMemberPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.MemberAddress;
import org.docksidestage.mysql.dbflute.exentity.WhiteDateAdjustment;
import org.docksidestage.mysql.dbflute.exentity.customize.OptionMember;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.4A (2013/03/10 Saturday)
 */
public class WxRepsDateAdjustmentTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private WhiteDateAdjustmentBhv whiteDateAdjustmentBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_Birthdate_remained() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberAccount_Equal("Pixy");

        // ## Act ##
        LocalDate birthdate = memberBhv.selectEntityWithDeletedCheck(cb).getBirthdate();

        // ## Assert ##
        assertEquals("1965/03/03", toString(birthdate, "yyyy/MM/dd"));
    }

    public void test_FormalizedDatetime_remained() {
        // ## Arrange ##
        final String firstDate = "2003-02-25";
        final String lastDate = "2006-09-04";
        final String lastNextDate = "2006-09-05";
        OptionMemberPmb pmb = new OptionMemberPmb();
        pmb.setFromFormalizedDate_FromDate(toLocalDate("2003-02-25"));
        pmb.setToFormalizedDate_ToDate(toLocalDate(lastDate));

        // ## Act ##
        List<OptionMember> memberList = memberBhv.outsideSql().selectList(pmb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        boolean existsLastDate = false;
        for (OptionMember member : memberList) {
            String memberName = member.getMemberName();
            LocalDateTime formalizedDatetime = member.getFormalizedDatetime();
            log(memberName + ", " + formalizedDatetime);
            if (DfTypeUtil.toString(formalizedDatetime, "yyyy-MM-dd").equals(lastDate)) {
                existsLastDate = true;
            }
        }
        assertEquals(firstDate, DfTypeUtil.toString(pmb.getFromFormalizedDate(), "yyyy-MM-dd"));
        assertEquals(lastNextDate, DfTypeUtil.toString(pmb.getToFormalizedDate(), "yyyy-MM-dd"));
        assertTrue(existsLastDate);
    }

    public void test_MemberAddress_remained() {
        // ## Arrange ##
        final LocalDate targetDate = new HandyDate("2005/12/12").getLocalDate();
        final String targetChar = "i";

        MemberCB cb = new MemberCB();
        LikeSearchOption likeSearchOption = new LikeSearchOption().likeContain();
        cb.query().queryMemberAddressAsValid(targetDate).setAddress_LikeSearch(targetChar, likeSearchOption);
        cb.query().queryMemberAddressAsValid(targetDate).addOrderBy_Address_Asc();
        cb.query().addOrderBy_MemberId_Asc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, memberList.size());
        memberBhv.loadMemberAddress(memberList, new ConditionBeanSetupper<MemberAddressCB>() {
            public void setup(MemberAddressCB cb) {
                cb.query().setAddress_LikeSearch(targetChar, new LikeSearchOption().likeContain());
                cb.query().setValidBeginDate_LessEqual(targetDate);
                cb.query().setValidEndDate_GreaterEqual(targetDate);
            }
        });
        log("[" + targetDate + "]");
        for (Member member : memberList) {
            MemberAddress memberAddressAsValid = member.getMemberAddressAsValid().orElse(null);
            assertNull(memberAddressAsValid); // because of no setup-select.
            List<MemberAddress> memberAddressList = member.getMemberAddressList();
            assertEquals(1, memberAddressList.size());
            MemberAddress memberAddress = memberAddressList.get(0);
            String memberName = member.getMemberName();
            LocalDate validBeginDate = memberAddress.getValidBeginDate();
            LocalDate validEndDate = memberAddress.getValidEndDate();
            String address = memberAddress.getAddress();
            log(memberName + ", " + validBeginDate + ", " + validEndDate + ", " + address);
            assertTrue(memberAddress.getAddress().contains("a"));
        }
    }

    public void test_PurchaseDatetime_added() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }, Member.ALIAS_latestLoginDatetime); // rental
        LocalDate currentDate = currentLocalDate();
        LocalDate fromDate = toLocalDate(new HandyDate(currentDate).addMonth(-6));
        LocalDate toDate = toLocalDate(currentDate);
        cb.query().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchaseDatetime();
            }
        }).fromTo(fromDate, toDate, op -> {});

        // ## Act ##
        // Expect no exception
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        for (Member member : memberList) {
            LocalDateTime latestDate = member.getLatestLoginDatetime();
            log(member.getMemberName() + ", " + toString(member.getLatestLoginDatetime()));
            assertTrue(fromDate.equals(latestDate) || fromDate.isBefore(latestDate.toLocalDate()));
            assertTrue(toDate.equals(latestDate) || toDate.isAfter(latestDate.toLocalDate()));
        }
    }

    // ===================================================================================
    //                                                                              Detail
    //                                                                              ======
    public void test_detail() throws Exception {
        // ## Arrange ##
        WhiteDateAdjustmentCB cb = new WhiteDateAdjustmentCB();
        cb.query().addOrderBy_DateAdjustmentId_Asc();

        // ## Act ##
        ListResultBean<WhiteDateAdjustment> adjustmentList = whiteDateAdjustmentBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(adjustmentList);
        for (WhiteDateAdjustment adjustment : adjustmentList) {
            Long id = adjustment.getDateAdjustmentId();
            LocalDate date = adjustment.getAdjustedDate();
            LocalDateTime datetime = adjustment.getAdjustedDatetime();
            LocalTime time = adjustment.getAdjustedTime();
            Integer integer = adjustment.getAdjustedInteger();
            Long namedStringLong = adjustment.getAdjustedNamedStringLong();
            Long namedTypedLong = adjustment.getAdjustedNamedTypedLong();
            Long pinpointStringLong = adjustment.getAdjustedPinpointStringLong();
            Long pinpointTypedLong = adjustment.getAdjustedPinpointTypedLong();
            String string = adjustment.getAdjustedString();
            if (id <= 4) {
                LocalDate namedStringDate = toLocalDate(namedStringLong);
                LocalDate namedTypedDate = toLocalDate(namedTypedLong);
                LocalDate pinpointStringDate = toLocalDate(pinpointStringLong);
                LocalDate pinpointTypedDate = toLocalDate(pinpointTypedLong);
                String timeExp = toString(time, "HH:mm:ss");
                log(id, date, datetime, timeExp, integer, namedStringDate, namedTypedDate, pinpointStringDate, pinpointTypedDate, string);
                HandyDate baseHandy = new HandyDate(currentLocalDate()).addDay(-30);
                assertTrue(baseHandy.isLessEqual(date));
                LocalDateTime expectedDatetime = new HandyDate(date).addDay(1).addHour(12).addMinute(34).addSecond(56).getLocalDateTime();
                assertEquals(expectedDatetime, datetime);
                if (timeExp.startsWith("12")) {
                    assertEquals("12:34:56", timeExp);
                    markHere("timeFirst");
                } else {
                    assertEquals("23:59:59", timeExp);
                    markHere("timeSecond");
                }
                assertEquals(id.intValue(), integer.intValue());
                assertEquals(new HandyDate(date).addDay(2).getLocalDate(), namedStringDate);
                assertEquals(namedStringDate, namedTypedDate);
                assertEquals(new HandyDate("2008/02/04").addDay(30).getLocalDate(), pinpointStringDate);
                assertEquals(new HandyDate(pinpointStringDate).addDay(1).getLocalDate(), pinpointTypedDate);
                if (string.equals("1202223600000")) {
                    markHere("stringNoAdjusted");
                }
                markHere("exists");
            } else if (id.equals(5L)) { // means all columns are null (see the excel data)
                log(id, date, datetime, time, integer, namedStringLong, namedTypedLong, pinpointStringLong, pinpointTypedLong, string);
                assertNull(date);
                assertNull(datetime);
                assertNull(time);
                assertNull(integer);
                assertNull(namedStringLong);
                assertNull(pinpointStringLong);
                assertNull(string);
                markHere("nullRow");
            } else if (id.equals(6L)) { // $sysdate
                log(id, date, datetime, time, integer, namedStringLong, namedTypedLong, pinpointStringLong, pinpointTypedLong, string);
                assertTrue(new HandyDate(currentLocalDate()).isLessEqual(date));
                markHere("sysdate");
            } else {
                fail("unknown id: " + id);
            }
        }
        assertMarked("exists");
        assertMarked("nullRow");
        assertMarked("sysdate");
        assertMarked("timeFirst");
        assertMarked("timeSecond");
        assertMarked("stringNoAdjusted");
    }
}