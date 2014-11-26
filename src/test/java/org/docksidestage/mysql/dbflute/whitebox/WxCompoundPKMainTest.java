package org.docksidestage.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.bhv.referrer.ConditionBeanSetupper;
import org.dbflute.bhv.referrer.EntityListSetupper;
import org.dbflute.bhv.referrer.LoadReferrerOption;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.util.Srl;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefManyCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundPkRefNestCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundReferredNormallyCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteCompoundReferredPrimaryCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefManyBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundPkRefNestBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundReferredNormallyBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteCompoundReferredPrimaryBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPk;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRef;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRefMany;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundPkRefNest;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundReferredNormally;
import org.docksidestage.mysql.dbflute.exentity.WhiteCompoundReferredPrimary;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.7.6 (2010/11/10 Tuesday)
 */
public class WxCompoundPKMainTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteCompoundPkBhv whiteCompoundPkBhv;
    private WhiteCompoundPkRefBhv whiteCompoundPkRefBhv;
    private WhiteCompoundPkRefNestBhv whiteCompoundPkRefNestBhv;
    private WhiteCompoundPkRefManyBhv whiteCompoundPkRefManyBhv;
    private WhiteCompoundReferredNormallyBhv whiteCompoundReferredNormallyBhv;
    private WhiteCompoundReferredPrimaryBhv whiteCompoundReferredPrimaryBhv;

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

    // -----------------------------------------------------
    //                                        ExistsReferrer
    //                                        --------------
    public void test_CompoundPK_ExistsReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRef(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.query().setRefSecondId_GreaterThan(1);
            }
        });
        cb.query().notExistsWhiteCompoundPkRefManyToPK(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
                subCB.query().setMultipleFirstId_Equal(99999999);
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main);
        }
        String sql = cb.toDisplaySql();
        assertTrue(Srl.containsAll(sql, "exists", //
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID > 1"));
        assertTrue(Srl.containsAll(sql, "not exists", //
                "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_MANY_CODE = 'TPK'", //
                "  and sub1loc.MULTIPLE_FIRST_ID = 99999999"));
    }

    public void test_CompoundPK_ExistsReferrer_fixedCondition() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRefManyToPK(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(mainList); // no data for now
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "exists", //
                "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_MANY_CODE = 'TPK'"));
    }

    public void test_CompoundPK_ExistsReferrer_union() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRef(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.query().setRefSecondId_GreaterThan(1);
                subCB.union(new UnionQuery<WhiteCompoundPkRefCB>() {
                    public void query(WhiteCompoundPkRefCB unionCB) {
                        unionCB.query().setRefFirstId_LessEqual(99999);
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteCompoundPk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "union", "exists", //
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID > 1", //
                "  and sub1loc.REF_FIRST_ID <= 99999"));
        assertEquals(2, Srl.count(cb.toDisplaySql(), "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID"));
        assertEquals(2, Srl.count(cb.toDisplaySql(), "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID"));
    }

    public void test_CompoundPK_ExistsReferrer_union_fixedCondition() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().existsWhiteCompoundPkRefManyToPK(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
                subCB.union(new UnionQuery<WhiteCompoundPkRefManyCB>() {
                    public void query(WhiteCompoundPkRefManyCB unionCB) {
                    }
                });
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(mainList); // no data for now
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "union", "exists", //
                "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_MANY_CODE = 'TPK'"));
        assertEquals(2, Srl.count(cb.toDisplaySql(), "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID"));
        assertEquals(2, Srl.count(cb.toDisplaySql(), "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID"));
        assertEquals(2, Srl.count(cb.toDisplaySql(), "  and sub1loc.REF_MANY_CODE = 'TPK'"));
    }

    public void test_CompoundPK_ExistsReferrer_collaboration() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.specify().derivedWhiteCompoundPkRef().max(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.specify().columnRefFirstId();
                subCB.query().setRefSecondId_GreaterThan(3);
            }
        }, WhiteCompoundPk.ALIAS_maxId, op -> op.coalesce(0));
        cb.query().derivedWhiteCompoundPkRef().min(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.specify().columnRefFirstId();
                subCB.query().setRefSecondId_GreaterThan(2);
            }
        }, op -> op.coalesce(0)).greaterEqual(0);
        cb.query().existsWhiteCompoundPkRef(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.query().setRefSecondId_GreaterThan(1);
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteCompoundPk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "max(", "min(", "exists", //
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID > 3", //
                "  and sub1loc.REF_SECOND_ID > 2", //
                "  and sub1loc.REF_SECOND_ID > 1", //
                " >= 0"));
    }

    public void test_CompoundPK_NotExistsReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().notExistsWhiteCompoundPkRef(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.query().setRefSecondId_LessThan(0);
            }
        });

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        for (WhiteCompoundPk main : mainList) {
            log(main);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "not exists", //
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", //
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID < 0"));
    }

    // -----------------------------------------------------
    //                              (Specify)DerivedReferrer
    //                              ------------------------
    public void test_CompoundPK_SpecifyDerivedReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.specify().derivedWhiteCompoundPkRef().max(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.specify().columnRefFirstId();
                subCB.query().setRefSecondId_GreaterThan(1);
            }
        }, WhiteCompoundPk.ALIAS_maxId);

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId(), main.getPkSecondId(), main.getMaxId());
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "max(", // 
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID > 1"));
    }

    public void test_CompoundPK_SpecifyDerivedReferrer_fixedCondition() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.specify().derivedWhiteCompoundPkRefManyToPK().max(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
                subCB.specify().columnRefManyName();
            }
        }, WhiteCompoundPk.ALIAS_maxId);

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId(), main.getPkSecondId(), main.getMaxId());
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "max(", // 
                "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_MANY_CODE = 'TPK'"));
    }

    public void test_CompoundPK_SpecifyDerivedReferrer_union() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.specify().derivedWhiteCompoundPkRef().max(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.specify().columnRefFirstId();
                subCB.query().setRefSecondId_GreaterThan(1);
                subCB.union(new UnionQuery<WhiteCompoundPkRefCB>() {
                    public void query(WhiteCompoundPkRefCB unionCB) {
                        unionCB.query().setRefFirstId_LessEqual(99999);
                    }
                });
            }
        }, WhiteCompoundPk.ALIAS_maxId, op -> op.coalesce(0));

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId(), main.getPkSecondId(), main.getMaxId());
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "coalesce(", "max(", // 
                "where sub1main.REF_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1main.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "where sub1loc.REF_SECOND_ID > 1", //
                "where sub1loc.REF_FIRST_ID <= 99999"));
    }

    public void test_CompoundPK_SpecifyDerivedReferrer_union_fixedCondition() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.specify().derivedWhiteCompoundPkRefManyToPK().count(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
                subCB.specify().columnMultipleFirstId();
                subCB.union(new UnionQuery<WhiteCompoundPkRefManyCB>() {
                    public void query(WhiteCompoundPkRefManyCB unionCB) {
                    }
                });
            }
        }, WhiteCompoundPk.ALIAS_maxId);

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId(), main.getPkSecondId(), main.getMaxId());
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "count(", // 
                "where sub1main.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1main.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1main.REF_MANY_CODE = 'TPK'"));
    }

    public void test_CompoundPK_SpecifyDerivedReferrer_referredNormally() {
        // ## Arrange ##
        WhiteCompoundReferredNormallyCB cb = new WhiteCompoundReferredNormallyCB();
        cb.specify().derivedWhiteCompoundPk().max(new SubQuery<WhiteCompoundPkCB>() {
            public void query(WhiteCompoundPkCB subCB) {
                subCB.specify().columnPkFirstId();
            }
        }, WhiteCompoundReferredNormally.ALIAS_maxFirstId); // expect generated

        // ## Act ##
        ListResultBean<WhiteCompoundReferredNormally> normallyList = whiteCompoundReferredNormallyBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(normallyList);
    }

    public void test_CompoundPK_SpecifyDerivedReferrer_referredPrimary() {
        // ## Arrange ##
        WhiteCompoundReferredPrimaryCB cb = new WhiteCompoundReferredPrimaryCB();
        cb.specify().derivedWhiteCompoundPk().max(new SubQuery<WhiteCompoundPkCB>() {
            public void query(WhiteCompoundPkCB subCB) {
                subCB.specify().columnPkFirstId();
            }
        }, WhiteCompoundReferredPrimary.ALIAS_maxFirstId); // expect generated

        // ## Act ##
        ListResultBean<WhiteCompoundReferredPrimary> primaryList = whiteCompoundReferredPrimaryBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(primaryList);
    }

    // -----------------------------------------------------
    //                                (Query)DerivedReferrer
    //                                ----------------------
    public void test_CompoundPK_QueryDerivedReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().derivedWhiteCompoundPkRef().max(new SubQuery<WhiteCompoundPkRefCB>() {
            public void query(WhiteCompoundPkRefCB subCB) {
                subCB.specify().columnRefFirstId();
                subCB.query().setRefSecondId_GreaterThan(1);
            }
        }).greaterEqual(0);

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId(), main.getPkSecondId(), main.getMaxId());
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "max(", // 
                "where sub1loc.REF_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1loc.REF_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_SECOND_ID > 1", //
                " >= 0"));
    }

    public void test_CompoundPK_QueryDerivedReferrer_fixedCondition() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();
        cb.query().derivedWhiteCompoundPkRefManyToPK().max(new SubQuery<WhiteCompoundPkRefManyCB>() {
            public void query(WhiteCompoundPkRefManyCB subCB) {
                subCB.specify().columnRefManyName();
            }
        }, op -> op.coalesce(0)).greaterEqual(0);

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(mainList);
        for (WhiteCompoundPk compoundPk : mainList) {
            log(compoundPk);
        }
        assertTrue(Srl.containsAll(cb.toDisplaySql(), "max(", // 
                "where sub1loc.REF_MANY_FIRST_ID = dfloc.PK_FIRST_ID", // 
                "  and sub1loc.REF_MANY_SECOND_ID = dfloc.PK_SECOND_ID", //
                "  and sub1loc.REF_MANY_CODE = 'TPK'", //
                " >= 0"));
    }

    // -----------------------------------------------------
    //                                           QueryUpdate
    //                                           -----------
    // implemented at WxBhvQueryUpdateCompoundPKTest

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    public void test_CompoundPK_LoadReferrer_basic() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        whiteCompoundPkBhv.loadWhiteCompoundPkRef(mainList, new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
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
                    assertEquals(main.getPkFirstId(), ref.getRefFirstId());
                    assertEquals(main.getPkSecondId(), ref.getRefSecondId());
                }
            }
        }
        log(logSb);
        assertTrue(exists);
    }

    public void test_UqReference_LoadReferrer_multiple() {
        // ## Arrange ##
        registerTestData();
        WhiteCompoundPkCB cb = new WhiteCompoundPkCB();

        // ## Act ##
        ListResultBean<WhiteCompoundPk> mainList = whiteCompoundPkBhv.selectList(cb);
        LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef> option = new LoadReferrerOption<WhiteCompoundPkRefCB, WhiteCompoundPkRef>();
        option.setConditionBeanSetupper(new ConditionBeanSetupper<WhiteCompoundPkRefCB>() {
            public void setup(WhiteCompoundPkRefCB cb) {
            }
        });
        option.setEntityListSetupper(new EntityListSetupper<WhiteCompoundPkRef>() {
            public void setup(List<WhiteCompoundPkRef> entityList) {
                whiteCompoundPkRefBhv.loadWhiteCompoundPkRefNestByFooMultipleId(entityList,
                        new ConditionBeanSetupper<WhiteCompoundPkRefNestCB>() {
                            public void setup(WhiteCompoundPkRefNestCB cb) {
                            }
                        });
            }
        });
        whiteCompoundPkBhv.loadWhiteCompoundPkRef(mainList, option);

        // ## Assert ##
        assertNotSame(0, mainList.size());
        boolean exists = false;
        for (WhiteCompoundPk main : mainList) {
            log(main.getPkFirstId() + ", " + main.getPkSecondId());
            List<WhiteCompoundPkRef> refList = main.getWhiteCompoundPkRefList();
            if (!refList.isEmpty()) {
                for (WhiteCompoundPkRef ref : refList) {
                    log("  " + ref.getMultipleFirstId() + ", " + ref.getMultipleSecondId());
                    assertEquals(main.getPkFirstId(), ref.getRefFirstId());
                    assertEquals(main.getPkSecondId(), ref.getRefSecondId());
                    List<WhiteCompoundPkRefNest> fooMultipleIdList = ref.getWhiteCompoundPkRefNestByFooMultipleIdList();
                    List<WhiteCompoundPkRefNest> quxMultipleIdList = ref.getWhiteCompoundPkRefNestByQuxMultipleIdList();
                    assertTrue(quxMultipleIdList.isEmpty());
                    for (WhiteCompoundPkRefNest nest : fooMultipleIdList) {
                        exists = true;
                        log("    " + nest);
                        assertEquals(ref.getMultipleFirstId(), nest.getFooMultipleId());
                        assertEquals(ref.getMultipleSecondId(), nest.getBarMultipleId());
                    }
                }
            }
        }
        assertTrue(exists);
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
        main.setPkName(pkName);
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
