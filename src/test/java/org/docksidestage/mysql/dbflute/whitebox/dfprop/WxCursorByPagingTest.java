package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.bhv.readable.EntityRowHandler;
import org.docksidestage.mysql.dbflute.resola.exbhv.ResolaStationBhv;
import org.docksidestage.mysql.dbflute.resola.exentity.ResolaStation;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxCursorByPagingTest extends UnitContainerTestCase {

    private ResolaStationBhv resolaStationBhv;

    public void test_customizeCursorSelect_breakCursor() throws Exception {
        // ## Arrange ##
        EntityRowHandler<ResolaStation> handler = new EntityRowHandler<ResolaStation>() {

            private boolean cursorBreak;
            private int index;

            @Override
            public void handle(ResolaStation station) {
                log(index, station.getStationId(), station.getStationName());
                if (index > 1) {
                    cursorBreak = true;
                    return;
                }
                ++index;
            }

            @Override
            public boolean isBreakCursor() {
                return cursorBreak;
            }

            @Override
            public String toString() {
                return String.valueOf(index);
            }
        };

        // ## Act ##
        resolaStationBhv.selectCursor(cb -> {
            cb.customizeCursorSelect(op -> op.byPagingOrderByPK(3));
            cb.query().addOrderBy_StationId_Asc();
        }, handler);

        // ## Assert ##
        assertEquals("2", handler.toString());
    }

    public void test_customizeCursorSelect_nonBreakCursor() throws Exception {
        // ## Arrange ##
        int countAll = resolaStationBhv.selectCount(cb -> {});
        EntityRowHandler<ResolaStation> handler = new EntityRowHandler<ResolaStation>() {

            private int index;

            @Override
            public void handle(ResolaStation station) {
                log(index, station.getStationId(), station.getStationName());
                ++index;
            }

            @Override
            public String toString() {
                return String.valueOf(index);
            }
        };

        // ## Act ##
        resolaStationBhv.selectCursor(cb -> {
            cb.customizeCursorSelect(op -> op.byPagingOrderByPK(3));
            cb.query().addOrderBy_StationId_Asc();
        }, handler);

        // ## Assert ##
        assertEquals(String.valueOf(countAll), handler.toString());
    }
}
