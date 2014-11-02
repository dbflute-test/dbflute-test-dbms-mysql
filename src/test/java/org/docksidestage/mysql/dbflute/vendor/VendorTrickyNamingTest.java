package org.docksidestage.mysql.dbflute.vendor;

import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.UnionQuery;
import org.docksidestage.mysql.dbflute.cbean.VendorTheLongAndWindingTableAndColumnRefCB;
import org.docksidestage.mysql.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnBhv;
import org.docksidestage.mysql.dbflute.exbhv.VendorTheLongAndWindingTableAndColumnRefBhv;
import org.docksidestage.mysql.dbflute.exentity.VendorTheLongAndWindingTableAndColumn;
import org.docksidestage.mysql.dbflute.exentity.VendorTheLongAndWindingTableAndColumnRef;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/10/17 Monday)
 */
public class VendorTrickyNamingTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private VendorTheLongAndWindingTableAndColumnBhv vendorTheLongAndWindingTableAndColumnBhv;
    private VendorTheLongAndWindingTableAndColumnRefBhv vendorTheLongAndWindingTableAndColumnRefBhv;

    // ===================================================================================
    //                                                                           Long Name
    //                                                                           =========
    public void test_LongName_basic() throws Exception {
        // ## Arrange ##
        registerTheLongAndWindingData();
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
        cb.setupSelect_VendorTheLongAndWindingTableAndColumn();
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc();

        // ## Act ##
        ListResultBean<VendorTheLongAndWindingTableAndColumnRef> refList = vendorTheLongAndWindingTableAndColumnRefBhv
                .selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (VendorTheLongAndWindingTableAndColumnRef ref : refList) {
            log(ref);
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefId());
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefDate());
            assertNotNull(ref.getShortDate());
            assertEquals("2011/10", toString(ref.getTheLongAndWindingTableAndColumnRefDate(), "yyyy/MM"));
            assertEquals("2000/01", toString(ref.getShortDate(), "yyyy/MM"));
            VendorTheLongAndWindingTableAndColumn main = ref.getVendorTheLongAndWindingTableAndColumn().get();
            assertNotNull(main);
            assertNotNull(main.getTheLongAndWindingTableAndColumnId());
            assertEquals("longName", main.getTheLongAndWindingTableAndColumnName());
            assertEquals("shortName", main.getShortName());
            assertEquals(3, main.getShortSize());
        }
    }

    public void test_LongName_union() throws Exception {
        // ## Arrange ##
        registerTheLongAndWindingData();
        VendorTheLongAndWindingTableAndColumnRefCB cb = new VendorTheLongAndWindingTableAndColumnRefCB();
        cb.setupSelect_VendorTheLongAndWindingTableAndColumn();
        cb.union(new UnionQuery<VendorTheLongAndWindingTableAndColumnRefCB>() {
            public void query(VendorTheLongAndWindingTableAndColumnRefCB unionCB) {
            }
        });
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefDate_Asc();
        cb.query().addOrderBy_TheLongAndWindingTableAndColumnRefId_Asc();

        // ## Act ##
        ListResultBean<VendorTheLongAndWindingTableAndColumnRef> refList = vendorTheLongAndWindingTableAndColumnRefBhv
                .selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        for (VendorTheLongAndWindingTableAndColumnRef ref : refList) {
            log(ref);
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefId());
            assertNotNull(ref.getTheLongAndWindingTableAndColumnRefDate());
            assertNotNull(ref.getShortDate());
            assertEquals("2011/10", toString(ref.getTheLongAndWindingTableAndColumnRefDate(), "yyyy/MM"));
            assertEquals("2000/01", toString(ref.getShortDate(), "yyyy/MM"));
            VendorTheLongAndWindingTableAndColumn main = ref.getVendorTheLongAndWindingTableAndColumn().get();
            assertNotNull(main);
            assertNotNull(main.getTheLongAndWindingTableAndColumnId());
            assertEquals("longName", main.getTheLongAndWindingTableAndColumnName());
            assertEquals("shortName", main.getShortName());
            assertEquals(3, main.getShortSize());
        }
    }

    protected VendorTheLongAndWindingTableAndColumn registerTheLongAndWindingData() {
        VendorTheLongAndWindingTableAndColumn main = new VendorTheLongAndWindingTableAndColumn();
        main.setTheLongAndWindingTableAndColumnId(1L);
        main.setTheLongAndWindingTableAndColumnName("longName");
        main.setShortName("shortName");
        main.setShortSize(3);
        vendorTheLongAndWindingTableAndColumnBhv.insert(main);

        List<VendorTheLongAndWindingTableAndColumnRef> refList = newArrayList();
        {
            VendorTheLongAndWindingTableAndColumnRef ref = new VendorTheLongAndWindingTableAndColumnRef();
            ref.setTheLongAndWindingTableAndColumnRefId(3L);
            ref.setTheLongAndWindingTableAndColumnId(1L);
            ref.setTheLongAndWindingTableAndColumnRefDate(toLocalDate("2011/10/17"));
            ref.setShortDate(toLocalDate("2000/01/01"));
            vendorTheLongAndWindingTableAndColumnRefBhv.insert(ref);
            refList.add(ref);
        }
        {
            VendorTheLongAndWindingTableAndColumnRef ref = new VendorTheLongAndWindingTableAndColumnRef();
            ref.setTheLongAndWindingTableAndColumnRefId(4L);
            ref.setTheLongAndWindingTableAndColumnId(1L);
            ref.setTheLongAndWindingTableAndColumnRefDate(toLocalDate("2011/10/18"));
            ref.setShortDate(toLocalDate("2000/01/02"));
            vendorTheLongAndWindingTableAndColumnRefBhv.insert(ref);
            refList.add(ref);
        }

        main.setVendorTheLongAndWindingTableAndColumnRefList(refList);
        return main;
    }
}
