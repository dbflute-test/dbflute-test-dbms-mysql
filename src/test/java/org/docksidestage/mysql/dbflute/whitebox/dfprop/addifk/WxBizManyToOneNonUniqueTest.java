package org.docksidestage.mysql.dbflute.whitebox.dfprop.addifk;

import java.time.LocalDate;

import javax.annotation.Resource;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.exbhv.WhiteNonUniqueManyToOneFromBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteNonUniqueManyToOneToBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteNonUniqueManyToOneFrom;
import org.docksidestage.mysql.dbflute.exentity.WhiteNonUniqueManyToOneTo;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizManyToOneNonUniqueTest extends UnitContainerTestCase {

    @Resource
    private WhiteNonUniqueManyToOneFromBhv fromBhv;
    @Resource
    private WhiteNonUniqueManyToOneToBhv toBhv;

    public void test_NonUniqueManyToOne_fromTo_basic() throws Exception {
        // ## Arrange ##
        registerData();

        // ## Act ##
        ListResultBean<WhiteNonUniqueManyToOneFrom> fromList = fromBhv.selectList(cb -> {
            cb.setupSelect_WhiteNonUniqueManyToOneToAsNonUniqueManyToOne();
        });

        // ## Assert ##
        // dfprop:
        //  ; FK_WHITE_NON_UNIQUE_MANY_TO_ONE_FROM_TO = map:{
        //      ; localTableName  = WHITE_NON_UNIQUE_MANY_TO_ONE_FROM ; foreignTableName  = WHITE_NON_UNIQUE_MANY_TO_ONE_TO
        //      ; localColumnName = NON_UNIQUE_CODE ; foreignColumnName  = NON_UNIQUE_CODE
        //      ; fixedCondition =
        //       $$foreignAlias$$.BEGIN_DATE <= $$localAlias$$.BEGIN_DATE
        //   and $$foreignAlias$$.END_DATE >= $$localAlias$$.BEGIN_DATE
        //      ; fixedSuffix = AsNonUniqueManyToOne
        //  }
        //
        // result:
        //  from1-1, NU1, to1-1
        //  from2-1, NU1, to1-1
        //  from3-1, NU1, to1-1
        //  from4-1, NU1, to2-1 // Good
        //  from5-1, NU1, to3-1 // Good
        //  from6-2, NU2, to4-2
        //  from7-2, NU2, to5-2
        assertHasAnyElement(fromList);
        for (WhiteNonUniqueManyToOneFrom from : fromList) {
            WhiteNonUniqueManyToOneTo to = from.getWhiteNonUniqueManyToOneToAsNonUniqueManyToOne().get();
            log(from.getFromName(), from.getNonUniqueCode(), to.getToName());
        }
    }

    protected void registerData() {
        registerFrom("from1-1", "NU1", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 1, 31), 1);
        registerFrom("from2-1", "NU1", LocalDate.of(2019, 2, 1), LocalDate.of(2019, 2, 28), 1);
        registerFrom("from3-1", "NU1", LocalDate.of(2019, 3, 1), LocalDate.of(2019, 3, 31), 1);
        registerFrom("from4-1", "NU1", LocalDate.of(2019, 4, 1), LocalDate.of(2019, 4, 30), 1);
        registerFrom("from5-1", "NU1", LocalDate.of(2019, 5, 1), LocalDate.of(2019, 5, 31), 1);
        registerFrom("from6-2", "NU2", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 3, 31), 1);
        registerFrom("from7-2", "NU2", LocalDate.of(2019, 4, 1), LocalDate.of(2019, 4, 30), 1);
        registerTo("to1-1", "NU1", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 3, 31));
        registerTo("to2-1", "NU1", LocalDate.of(2019, 4, 1), LocalDate.of(2019, 4, 30));
        registerTo("to3-1", "NU1", LocalDate.of(2019, 5, 1), LocalDate.of(2019, 5, 31));
        registerTo("to4-2", "NU2", LocalDate.of(2019, 1, 1), LocalDate.of(2019, 3, 31));
        registerTo("to5-2", "NU2", LocalDate.of(2019, 4, 1), LocalDate.of(2019, 4, 30));
    }

    protected void registerFrom(String fromName, String nonUniqueCode, LocalDate beginDate, LocalDate endDate, Integer point) {
        WhiteNonUniqueManyToOneFrom from = new WhiteNonUniqueManyToOneFrom();
        from.setFromName(fromName);
        from.setNonUniqueCode(nonUniqueCode);
        from.setBeginDate(beginDate);
        from.setEndDate(endDate);
        from.setManyPoint(point);
        fromBhv.insert(from);
    }

    protected void registerTo(String toName, String nonUniqueCode, LocalDate beginDate, LocalDate endDate) {
        WhiteNonUniqueManyToOneTo to = new WhiteNonUniqueManyToOneTo();
        to.setToName(toName);
        to.setNonUniqueCode(nonUniqueCode);
        to.setBeginDate(beginDate);
        to.setEndDate(endDate);
        toBhv.insert(to);
    }
}