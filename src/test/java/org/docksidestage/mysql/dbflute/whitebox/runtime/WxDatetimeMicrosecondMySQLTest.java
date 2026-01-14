package org.docksidestage.mysql.dbflute.whitebox.runtime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.exbhv.VendorCheckBhv;
import org.docksidestage.mysql.dbflute.exentity.VendorCheck;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.3.2 (2026/01/10 Saturday at wangan makuhari PA)
 */
public class WxDatetimeMicrosecondMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorCheckBhv vendorCheckBhv;

    // ===================================================================================
    //                                                                       Insert/Select
    //                                                                       =============
    public void test_microsecond_insert_select() {
        // ## Arrange ##
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

        // ## Act ##
        vendorCheckBhv.selectByPK(inserted.getVendorCheckId()).alwaysPresent(selected -> {
            // ## Assert ##
            assertEquals(inserted.getTypeOfDatetime(), selected.getTypeOfDatetime());
            assertEquals(inserted.getTypeOfDatetime1Millis(), selected.getTypeOfDatetime1Millis());
            assertEquals(inserted.getTypeOfDatetime2Millis(), selected.getTypeOfDatetime2Millis());
            assertEquals(inserted.getTypeOfDatetime3Millis(), selected.getTypeOfDatetime3Millis());

            // done jflute truncated when select (2026/01/10)
            assertEquals(inserted.getTypeOfDatetime4Micros(), selected.getTypeOfDatetime4Micros());
            assertEquals(inserted.getTypeOfDatetime5Micros(), selected.getTypeOfDatetime5Micros());
            assertEquals(inserted.getTypeOfDatetime6Micros(), selected.getTypeOfDatetime6Micros());
        });
    }

    private HandyDate prepareHandyMaxDatetime() {
        return prepareHandyMaxDate().moveToDayTerminal();
    }

    private HandyDate prepareHandyMaxDate() {
        return new HandyDate("9999/12/31");
    }
}
