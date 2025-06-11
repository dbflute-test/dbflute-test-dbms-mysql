package org.docksidestage.mysql.dbflute.whitebox;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.SQLFailureException;
import org.docksidestage.mysql.dbflute.exbhv.WhiteGeneratedColumnBaseBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteGeneratedColumnBase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxGeneratedColumnBasicTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteGeneratedColumnBaseBhv whiteGeneratedColumnBaseBhv;

    // ===================================================================================
    //                                                                              Select
    //                                                                              ======
    public void test_generatedColumn_select_basic() throws Exception {
        // ## Arrange ##

        // ## Act ##
        WhiteGeneratedColumnBase base = whiteGeneratedColumnBaseBhv.selectEntity(cb -> {
            cb.query().setColumnBaseDatetime_Equal(prepareExistingBaseDatetime());
        }).orElseThrow();

        // ## Assert ##
        LocalDateTime baseDatetime = base.getColumnBaseDatetime();
        LocalDate dateCast = base.getColumnBaseVirtualDateCast();
        LocalDate dateForamt = base.getColumnBaseVirtualDateFormat();
        log(base.getColumnBaseId(), base.getColumnBaseName(), baseDatetime, dateCast, dateForamt);
        LocalDate expectedDate = baseDatetime.toLocalDate();
        assertEquals(expectedDate, dateCast);
        assertEquals(expectedDate, dateForamt);
    }

    public void test_generatedColumn_select_byDateCast() throws Exception {
        // ## Arrange ##

        // ## Act ##
        ListResultBean<WhiteGeneratedColumnBase> baseList = whiteGeneratedColumnBaseBhv.selectList(cb -> {
            cb.query().setColumnBaseVirtualDateCast_Equal(prepareExistingBaseDate());
        });

        // ## Assert ##
        assertHasAnyElement(baseList);
        for (WhiteGeneratedColumnBase base : baseList) {
            LocalDateTime baseDatetime = base.getColumnBaseDatetime();
            LocalDate dateCast = base.getColumnBaseVirtualDateCast();
            LocalDate dateForamt = base.getColumnBaseVirtualDateFormat();
            log(base.getColumnBaseId(), base.getColumnBaseName(), baseDatetime, dateCast, dateForamt);
            LocalDate expectedDate = baseDatetime.toLocalDate();
            assertEquals(expectedDate, dateCast);
            assertEquals(expectedDate, dateForamt);
        }
    }

    public void test_generatedColumn_select_byDateFormat() throws Exception {
        // ## Arrange ##

        // ## Act ##
        ListResultBean<WhiteGeneratedColumnBase> baseList = whiteGeneratedColumnBaseBhv.selectList(cb -> {
            cb.query().setColumnBaseVirtualDateFormat_Equal(prepareExistingBaseDate());
        });

        // ## Assert ##
        assertHasAnyElement(baseList);
        for (WhiteGeneratedColumnBase base : baseList) {
            LocalDateTime baseDatetime = base.getColumnBaseDatetime();
            LocalDate dateCast = base.getColumnBaseVirtualDateCast();
            LocalDate dateForamt = base.getColumnBaseVirtualDateFormat();
            log(base.getColumnBaseId(), base.getColumnBaseName(), baseDatetime, dateCast, dateForamt);
            LocalDate expectedDate = baseDatetime.toLocalDate();
            assertEquals(expectedDate, dateCast);
            assertEquals(expectedDate, dateForamt);
        }
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_generatedColumn_insert_plainEntity_basic() throws Exception {
        // ## Arrange ##
        LocalDateTime currentTime = LocalDateTime.of(2012, 12, 12, 12, 12, 12); // no millisecond
        WhiteGeneratedColumnBase base = new WhiteGeneratedColumnBase();
        base.setColumnBaseId(null);
        base.setColumnBaseName("inserted");
        base.setColumnBaseNumberFirst(55);
        base.setColumnBaseNumberSecond(66);
        base.setColumnBaseDatetime(currentTime);

        // ## Act ##
        whiteGeneratedColumnBaseBhv.insert(base);

        // ## Assert ##
        WhiteGeneratedColumnBase actual = whiteGeneratedColumnBaseBhv.selectEntity(cb -> {
            cb.query().setColumnBaseDatetime_Equal(currentTime); // also no millisecond
        }).orElseThrow(); // so surely selected
        log(actual);
    }

    public void test_generatedColumn_insert_selectedEntity_basic() throws Exception {
        // ## Arrange ##
        LocalDateTime currentTime = LocalDateTime.of(2012, 12, 12, 12, 12, 12); // no millisecond
        WhiteGeneratedColumnBase base = whiteGeneratedColumnBaseBhv.selectEntity(cb -> {
            cb.query().setColumnBaseDatetime_Equal(prepareExistingBaseDatetime());
        }).orElseThrow();
        base.setColumnBaseId(null);
        base.setColumnBaseName("inserted");
        base.setColumnBaseNumberFirst(55);
        base.setColumnBaseNumberSecond(66);
        base.setColumnBaseDatetime(currentTime);
        log("mymodifiedProperties(): " + base.mymodifiedProperties());
        log("myspecifiedProperties(): " + base.myspecifiedProperties());
        log("createdBySelect(): " + base.createdBySelect());
        // if createdBySelect() is true, the insert SQL has the virtual column

        // ## Act ##
        // ## Assert ##
        assertException(SQLFailureException.class, () -> {
            whiteGeneratedColumnBaseBhv.insert(base);
        }).handle(cause -> {
            // The value specified for generated column 'COLUMN_BASE_VIRTUAL_DATE_CAST'
            // in table 'white_generated_column_base' is not allowed.
            assertContainsAll(cause.getMessage(), "COLUMN_BASE_VIRTUAL_DATE_CAST", "is not allowed");
        });
    }

    public void test_generatedColumn_insert_selectedEntity_clearMarkAsSelect() throws Exception {
        // ## Arrange ##
        LocalDateTime currentTime = LocalDateTime.of(2012, 12, 12, 12, 12, 12); // no millisecond
        WhiteGeneratedColumnBase base = whiteGeneratedColumnBaseBhv.selectEntity(cb -> {
            cb.query().setColumnBaseDatetime_Equal(prepareExistingBaseDatetime());
        }).orElseThrow();
        base.setColumnBaseId(null);
        base.setColumnBaseName("inserted");
        base.setColumnBaseNumberFirst(55);
        base.setColumnBaseNumberSecond(66);
        base.setColumnBaseDatetime(currentTime);
        // not-allowed error
        //base.setColumnBaseVirtualDateCast(currentLocalDate());
        log("mymodifiedProperties(): " + base.mymodifiedProperties());
        log("myspecifiedProperties(): " + base.myspecifiedProperties());
        base.clearMarkAsSelect(); // here
        log("createdBySelect(): " + base.createdBySelect());

        // ## Act ##
        whiteGeneratedColumnBaseBhv.insert(base);

        // ## Assert ##
        WhiteGeneratedColumnBase actual = whiteGeneratedColumnBaseBhv.selectEntity(cb -> {
            cb.query().setColumnBaseDatetime_Equal(currentTime); // also no millisecond
        }).orElseThrow(); // so surely selected
        log(actual);
    }

    // ===================================================================================
    //                                                                        Small Helper
    //                                                                        ============
    private LocalDate prepareExistingBaseDate() {
        return LocalDate.of(2025, 6, 10);
    }

    private LocalDateTime prepareExistingBaseDatetime() {
        return LocalDateTime.of(2025, 6, 10, 23, 19, 48);
    }
}
