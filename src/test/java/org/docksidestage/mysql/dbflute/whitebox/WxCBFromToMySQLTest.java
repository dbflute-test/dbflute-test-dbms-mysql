package org.docksidestage.mysql.dbflute.whitebox;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.dbflute.exception.SQLFailureException;
import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
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

    // ===================================================================================
    //                                                                     compareAsYear()
    //                                                                     ===============

    // ===================================================================================
    //                                                                     compareAsDate()
    //                                                                     ===============
    public void test_fromTo_compareAsDate_to99991231_asDate() {
        // ## Arrange ##
        updateMaxDate();
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

    public void test_fromTo_compareAsDate_to99991231_asDatetime() {
        // ## Arrange ##
        updateMaxDate();
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

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    private void updateMaxDate() {
        LocalDate maxDate = prepareHandyMaxDate().getLocalDate();
        LocalDateTime maxDateTime = prepareHandyMaxDatetime().getLocalDateTime();
        memberBhv.selectByPK(17).alwaysPresent(member -> {
            member.setBirthdate(maxDate);
            member.setFormalizedDatetime(maxDateTime);
            memberBhv.updateNonstrict(member);
        });
    }

    private HandyDate prepareHandyMaxDatetime() {
        return prepareHandyMaxDate().moveToDayTerminal().moveToMillisecond(499); // avoid round
    }

    private HandyDate prepareHandyMaxDate() {
        return new HandyDate("9999/12/31");
    }
}
