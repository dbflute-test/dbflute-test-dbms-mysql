package org.docksidestage.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefManyCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefManyBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefNestBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPk;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRef;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRefMany;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRefNest;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesday)
 */
public class WxCBCompoundPKBasicTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteCompoundPkBhv whiteCompoundPkBhv;
    private WhiteCompoundPkRefBhv whiteCompoundPkRefBhv;
    private WhiteCompoundPkRefNestBhv whiteCompoundPkRefNestBhv;
    private WhiteCompoundPkRefManyBhv whiteCompoundPkRefManyBhv;

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    // -----------------------------------------------------
    //                                           SetupSelect
    //                                           -----------
    public void test_CompoundPK_SetupSelect_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.setupSelect_WhiteCompoundPkRefManyAsMax();
        cb.setupSelect_WhiteCompoundPkRefManyAsMin();
        cb.setupSelect_WhiteCompoundReferredNormally();
        cb.setupSelect_WhiteCompoundReferredPrimary();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> pkList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(pkList);
        for (WhiteCompoundPk pk : pkList) {
            log(pk);
        }
    }

    public void test_CompoundPK_SetupSelect_CompoundToCompound() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkRefCB cb = new WhiteCompoundPkRefCB();
        cb.setupSelect_WhiteCompoundPk();

        // ## Act ##
        ListResultBean<WhiteCompoundPkRef> refList = whiteCompoundPkRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        StringBuilder logSb = new StringBuilder();
        for (WhiteCompoundPkRef ref : refList) {
            logSb.append(ln() + ref.toStringWithRelation());
            WhiteCompoundPk main = ref.getWhiteCompoundPk().get();
            assertNotNull(main);
            assertEquals(ref.getRefFirstId(), main.getPkFirstId());
            assertEquals(ref.getRefSecondId(), main.getPkSecondId());
        }
        log(logSb);
    }

    public void test_CompoundPK_SetupSelect_BizManyToOneToCompound() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkRefManyCB cb = new WhiteCompoundPkRefManyCB();
        cb.setupSelect_WhiteCompoundPkToPK();

        // ## Act ##
        ListResultBean<WhiteCompoundPkRefMany> manyList = whiteCompoundPkRefManyBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(manyList); // no data for now
    }

    // ===================================================================================
    //                                                                      Specify Column
    //                                                                      ==============
    public void test_CompoundPK_SpecifyColumn_LoadReferrer_autoResolved() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        whiteCompoundPkBhv.loadWhiteCompoundPkRef(mainList, new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
                cb.specify().columnRefFirstId();
            }
        });

        // ## Assert ##
        assertNotSame(0, mainList.size());
        StringBuilder logSb = new StringBuilder();
        boolean exists = false;
        for (WhiteCompoundPk main : mainList) {
            logSb.append(ln() + main.toStringWithRelation());
            List<WhiteCompoundPkRef> refList = main.getWhiteCompoundPkRefList();
            if (!refList.isEmpty()) {
                exists = true;
                for (WhiteCompoundPkRef ref : refList) {
                    assertNotNull(ref.getRefFirstId());
                    assertNotNull(ref.getRefSecondId()); // auto-resolved
                }
            }
        }
        log(logSb);
        assertTrue(exists);
    }

    // ===================================================================================
    //                                                                    Scalar Condition
    //                                                                    ================
    public void test_CompoundPK_ScalarCondition_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.setupSelect_WhiteCompoundPkRefManyAsMax();
        cb.setupSelect_WhiteCompoundPkRefManyAsMin();
        cb.setupSelect_WhiteCompoundReferredNormally();
        cb.setupSelect_WhiteCompoundReferredPrimary();
        cb.query().scalar_Equal().max(new SubQuery<WhiteCompoundPkCB>() {
            public void query(WhiteCompoundPkCB subCB) {
                subCB.specify().columnPkSecondId();
                subCB.query().setPkFirstId_IsNotNull();
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> pkList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(pkList);
        for (WhiteCompoundPk pk : pkList) {
            log(pk);
        }
    }

    public void test_CompoundPK_ScalarCondition_partitionBy() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.setupSelect_WhiteCompoundPkRefManyAsMax();
        cb.setupSelect_WhiteCompoundPkRefManyAsMin();
        cb.setupSelect_WhiteCompoundReferredNormally();
        cb.setupSelect_WhiteCompoundReferredPrimary();
        cb.query().scalar_Equal().max(new SubQuery<WhiteCompoundPkCB>() {
            public void query(WhiteCompoundPkCB subCB) {
                subCB.specify().columnPkSecondId();
            }
        }).partitionBy(new SpecifyQuery<WhiteCompoundPkCB>() {
            public void specify(WhiteCompoundPkCB cb) {
                cb.specify().columnReferredId();
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> pkList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(pkList);
        for (WhiteCompoundPk pk : pkList) {
            log(pk);
        }
    }

    // ===================================================================================
    //                                                                         QueryUpdate
    //                                                                         ===========
    // -----------------------------------------------------
    //                                           QueryUpdate
    //                                           -----------
    // implemented at WxBhvQueryUpdateCompoundPKTest

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    private List<WhiteCompoundPk> registerTestData() {
        List<WhiteCompoundPk> mainList = new ArrayList<WhiteCompoundPk>();
        mainList.add(xregisterWhiteCompoundPk(1, 1, "FOO"));
        mainList.add(xregisterWhiteCompoundPk(1, 2, "BAR"));
        mainList.add(xregisterWhiteCompoundPk(2, 1, "QUX"));
        mainList.add(xregisterWhiteCompoundPk(3, 1, "QUUX"));

        // 1 to 0...*
        xregisterWhiteCompoundPkRef(1, 1, 1, 1);
        xregisterWhiteCompoundPkRef(1, 2, 1, 1);
        xregisterWhiteCompoundPkRef(1, 3, 1, 2);
        xregisterWhiteCompoundPkRef(2, 1, 2, 1);
        xregisterWhiteCompoundPkRef(2, 2, 2, 1);
        xregisterWhiteCompoundPkRef(3, 1, 2, 1);

        // 1 to 0...*
        xregisterWhiteCompoundPkRefNest(1, 1, 1, 1);
        xregisterWhiteCompoundPkRefNest(2, 1, 1, 2);
        xregisterWhiteCompoundPkRefNest(3, 3, 1, 3);
        xregisterWhiteCompoundPkRefNest(4, 2, 2, 1);
        return mainList;
    }

    private WhiteCompoundPk xregisterWhiteCompoundPk(int first, int second, String pkName) {
        WhiteCompoundPk main = new WhiteCompoundPk();
        main.setPkFirstId(first);
        main.setPkSecondId(second);
        main.setCompoundPkName(pkName);
        main.setReferredId(first * second);
        whiteCompoundPkBhv.insert(main);
        return main;
    }

    private WhiteCompoundPkRef xregisterWhiteCompoundPkRef(int mulFirst, int mulSecond, int refFirst, int refSecond) {
        WhiteCompoundPkRef ref = new WhiteCompoundPkRef();
        ref.setMultipleFirstId(mulFirst);
        ref.setMultipleSecondId(mulSecond);
        ref.setRefFirstId(refFirst);
        ref.setRefSecondId(refSecond);
        ref.setRefName(mulFirst + ":" + mulSecond);
        whiteCompoundPkRefBhv.insert(ref);
        return ref;
    }

    private WhiteCompoundPkRefNest xregisterWhiteCompoundPkRefNest(int id, int foo, int bar, int qux) {
        WhiteCompoundPkRefNest nest = new WhiteCompoundPkRefNest();
        nest.setCompoundPkRefNestId(id);
        nest.setFooMultipleId(foo);
        nest.setBarMultipleId(bar);
        nest.setQuxMultipleId(qux);
        nest.setNestName(id + ":" + foo + ":" + bar + ":" + qux);
        whiteCompoundPkRefNestBhv.insert(nest);
        return nest;
    }
}
