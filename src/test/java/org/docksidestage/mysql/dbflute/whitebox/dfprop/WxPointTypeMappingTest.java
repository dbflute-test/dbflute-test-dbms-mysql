package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.time.LocalDate;
import java.util.Date;

import org.dbflute.helper.HandyDate;
import org.docksidestage.mysql.dbflute.cbean.WhitePointTypeMappingCB;
import org.docksidestage.mysql.dbflute.exbhv.WhitePointTypeMappingBhv;
import org.docksidestage.mysql.dbflute.exentity.WhitePointTypeMapping;
import org.docksidestage.mysql.mytype.MyMemberName;
import org.docksidestage.mysql.mytype.MyPriceCount;
import org.docksidestage.mysql.mytype.MySaleDate;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5D (2014/03/21 Friday)
 */
public class WxPointTypeMappingTest extends UnitContainerTestCase {

    private WhitePointTypeMappingBhv whitePointTypeMappingBhv;

    public void test_insert_select() throws Exception {
        // ## Arrange ##
        WhitePointTypeMapping inserted = new WhitePointTypeMapping();
        inserted.setPointTypeMappingId(99999L);
        inserted.setPointTypeMappingMemberName(new MyMemberName().setup("Stoikovic"));
        inserted.setPointTypeMappingPriceCount(new MyPriceCount().setup(3));
        Date saleDate = new HandyDate("2014/03/21").getDate();
        inserted.setPointTypeMappingSaleDate(new MySaleDate().setup(saleDate.getTime()));
        LocalDate wantedDate = new HandyDate("1992/01/01 12:34:56").getLocalDate();
        inserted.setPointTypeMappingWantedDatetime(wantedDate);
        whitePointTypeMappingBhv.insert(inserted);

        WhitePointTypeMappingCB cb = new WhitePointTypeMappingCB();
        cb.query().setPointTypeMappingId_Equal(99999L);

        // ## Act ##
        WhitePointTypeMapping mapping = whitePointTypeMappingBhv.selectEntityWithDeletedCheck(cb);

        // ## Assert ##
        assertEquals("Stoikovic", mapping.getPointTypeMappingMemberName().getValue());
        assertEquals(3, mapping.getPointTypeMappingPriceCount().getValue());
        assertEquals(Long.valueOf(saleDate.getTime()), mapping.getPointTypeMappingSaleDate().getValue());
        assertEquals(wantedDate, mapping.getPointTypeMappingWantedDatetime());
    }
}
