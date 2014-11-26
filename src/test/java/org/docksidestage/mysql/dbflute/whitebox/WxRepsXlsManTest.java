package org.docksidestage.mysql.dbflute.whitebox;

import java.time.LocalDateTime;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.cbean.WhiteXlsManCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteXlsManBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteXlsMan;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.5 (2010/10/23 Saturday)
 */
public class WxRepsXlsManTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteXlsManBhv whiteXlsManBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_replaceSchema_XLS() throws Exception {
        // ## Arrange ##
        WhiteXlsManCB cb = new WhiteXlsManCB();

        // ## Act ##
        ListResultBean<WhiteXlsMan> xlsManList = whiteXlsManBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, xlsManList.size());
        assertEquals(15, xlsManList.size());
        for (WhiteXlsMan vendorXlsMan : xlsManList) {
            log(vendorXlsMan);
        }
        assertEquals("bar", xlsManList.get(0).getStringConverted());
        assertEquals("f", xlsManList.get(1).getStringConverted());
        assertEquals("case sensitive", xlsManList.get(2).getStringConverted());
        assertEquals(null, xlsManList.get(3).getStringConverted()); // NullValue to null
        assertEquals("", xlsManList.get(4).getStringConverted()); // converted to ""
        assertEquals(" ", xlsManList.get(5).getStringConverted()); // not trimmed
        assertEquals("null", xlsManList.get(6).getStringConverted());
        assertEquals("quoted", xlsManList.get(7).getStringConverted()); // "" to quoted
        assertEquals("before\nafter", xlsManList.get(8).getStringConverted()); // "\n" to line
        assertEquals("before\nafter", xlsManList.get(9).getStringConverted()); // no changed

        LocalDateTime implementedTime = toLocalDateTime("2011-07-30 12:30:00.0");
        assertTrue(xlsManList.get(0).getTimestampConverted().isBefore(implementedTime));
        assertTrue(xlsManList.get(1).getTimestampConverted().isBefore(implementedTime));
        assertTrue(xlsManList.get(2).getTimestampConverted().isBefore(implementedTime));
        assertTrue(xlsManList.get(3).getTimestampConverted().isBefore(implementedTime));
        assertTrue(xlsManList.get(4).getTimestampConverted().isAfter(implementedTime)); // sysdate
        assertTrue(xlsManList.get(5).getTimestampConverted().isBefore(implementedTime));

        LocalDateTime timestampPlusWeek = xlsManList.get(10).getTimestampConverted();
        log("timestampPlusWeek: " + timestampPlusWeek);
        LocalDateTime timestampPast = xlsManList.get(11).getTimestampConverted();
        log("timestampPast: " + timestampPast);
        LocalDateTime currentDate = currentLocalDateTime();
        assertTrue(currentDate.isAfter(timestampPast));
        LocalDateTime timestampFuture = xlsManList.get(12).getTimestampConverted();
        log("timestampFuture: " + timestampFuture);
        assertTrue(currentDate.isBefore(timestampFuture));
        LocalDateTime timestampLastDay = xlsManList.get(13).getTimestampConverted();
        log("timestampLastDay: " + timestampLastDay);
        assertTrue(new HandyDate(timestampLastDay).isDay_MonthLastDay());

        assertEquals("   foo   bar   ", xlsManList.get(14).getStringConverted()); // not trimmed
    }
}
