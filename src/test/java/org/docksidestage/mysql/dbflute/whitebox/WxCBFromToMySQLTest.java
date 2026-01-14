package org.docksidestage.mysql.dbflute.whitebox;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import org.dbflute.exception.SQLFailureException;
import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.mysql.dbflute.exentity.VendorCheck;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.3.2 (2026/01/10 Saturday at ichihara)
 */
public class WxCBFromToMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                     compareAsYear()
    //                                                                     ===============

    // ===================================================================================
    //                                                                     compareAsDate()
    //                                                                     ===============
    public void test_fromTo_compareAsDate_to99991231_asDate_basic() {
        // ## Arrange ##
        updateMemberMaxDate();
        LocalDate fromDate = new HandyDate("2000/01/01").getLocalDate();
        LocalDate toDate = prepareHandyMaxDate().getLocalDate();

        // ## Act ##
        // ## Assert ##
        assertException(SQLFailureException.class, () -> {
            memberBhv.selectList(cb -> {
                cb.query().setBirthdate_FromTo(fromDate, toDate, op -> op.compareAsDate());
            });
        }).handle(cause -> {
            assertContains(cause.getMessage(), "Incorrect DATE value: '10000-01-01'");
        });
    }

    public void test_fromTo_compareAsDate_to99991231_asDatetime_basic() {
        // ## Arrange ##
        updateMemberMaxDate();
        LocalDateTime fromDatetime = new HandyDate("2000/01/01 12:23:34").getLocalDateTime();
        LocalDateTime toDatetime = prepareHandyMaxDate().getLocalDateTime();

        // ## Act ##
        // ## Assert ##
        assertException(SQLFailureException.class, () -> {
            memberBhv.selectList(cb -> {
                cb.query().setFormalizedDatetime_FromTo(fromDatetime, toDatetime, op -> op.compareAsDate());
            });
        }).handle(cause -> {
            assertContains(cause.getMessage(), "Incorrect DATETIME value: '10000-01-01 00:00:00'");
        });
    }

    public void test_fromTo_compareAsDate_to99991231_asDatetime_variation() {
        // ## Arrange ##
        insertVendorMaxDatetime();
        LocalDateTime fromDatetime = new HandyDate("2000/01/01 12:23:34").getLocalDateTime();
        LocalDateTime toDatetime = prepareHandyMaxDate().getLocalDateTime();

        // ## Act ##
        // ## Assert ##
        assertException(SQLFailureException.class, () -> {
            vendorCheckBhv.selectList(cb -> {
                cb.query().setTypeOfDatetime1Millis_FromTo(fromDatetime, toDatetime, op -> op.compareAsDate());
            });
        }).handle(cause -> {
            assertContains(cause.getMessage(), "Incorrect DATETIME value: '10000-01-01 00:00:00'");
        });
    }
    // TODO jflute aaaaaaaaaaa (2026/01/11)

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    private void updateMemberMaxDate() {
        LocalDate maxDate = prepareHandyMaxDate().getLocalDate();
        LocalDateTime maxDateTime = prepareHandyMaxDatetime().getLocalDateTime();
        memberBhv.selectByPK(17).alwaysPresent(member -> {
            member.setBirthdate(maxDate);
            member.setFormalizedDatetime(maxDateTime);
            memberBhv.updateNonstrict(member);
        });
    }

    private VendorCheck insertVendorMaxDatetime() {
        VendorCheck inserted = new VendorCheck();
        inserted.setVendorCheckId(123456L);
        inserted.setTypeOfDatetime(prepareHandyMaxDatetime().moveToSecondJust().getLocalDateTime());
        inserted.setTypeOfDatetime1Millis(prepareHandyMaxDatetime().moveToMillisecond(100).getLocalDateTime());
        inserted.setTypeOfDatetime2Millis(prepareHandyMaxDatetime().moveToMillisecond(220).getLocalDateTime());
        LocalDateTime millisMax = prepareHandyMaxDatetime().moveToMillisecond(333).getLocalDateTime();
        inserted.setTypeOfDatetime3Millis(millisMax);
        inserted.setTypeOfDatetime4Micros(millisMax.with(ChronoField.MICRO_OF_SECOND, 444400));
        inserted.setTypeOfDatetime5Micros(millisMax.with(ChronoField.MICRO_OF_SECOND, 555550));
        inserted.setTypeOfDatetime6Micros(millisMax.with(ChronoField.MICRO_OF_SECOND, 666666));
        vendorCheckBhv.insert(inserted);

        vendorCheckBhv.selectByPK(inserted.getVendorCheckId()).alwaysPresent(selected -> {
            assertEquals(inserted.getTypeOfDatetime(), selected.getTypeOfDatetime());
            assertEquals(inserted.getTypeOfDatetime1Millis(), selected.getTypeOfDatetime1Millis());
            assertEquals(inserted.getTypeOfDatetime2Millis(), selected.getTypeOfDatetime2Millis());
            assertEquals(inserted.getTypeOfDatetime3Millis(), selected.getTypeOfDatetime3Millis());
            assertEquals(inserted.getTypeOfDatetime4Micros(), selected.getTypeOfDatetime4Micros());
            assertEquals(inserted.getTypeOfDatetime5Micros(), selected.getTypeOfDatetime5Micros());
            assertEquals(inserted.getTypeOfDatetime6Micros(), selected.getTypeOfDatetime6Micros());
        });
        return inserted;
    }

    private HandyDate prepareHandyMaxDatetime() {
        return prepareHandyMaxDate().moveToDayTerminal().moveToMillisecond(499); // avoid round
    }

    private HandyDate prepareHandyMaxDate() {
        return new HandyDate("9999/12/31");
    }
}
