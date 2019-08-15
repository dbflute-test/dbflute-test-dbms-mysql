package org.docksidestage.mysql.dbflute.whitebox;

import java.sql.SQLException;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.exception.SQLFailureException;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.7C (2012/08/06 Monday)
 */
public class WxCBMyselfDerivedMySqlTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                              (Specify)MyselfDerived
    //                                                              ======================
    // -----------------------------------------------------
    //                                               Ranking
    //                                               -------
    public void test_SpecifyMyselfDerived_ranking_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberServiceAsOne();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, Member.ALIAS_loginCount, op -> op.plus(1));
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousPoint = null;
        Integer previousRank = null;
        boolean existsSame = false;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer servicePointCount = member.getMemberServiceAsOne().get().getServicePointCount();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + servicePointCount + ", " + pointRank);
            if (previousPoint != null && previousPoint < servicePointCount) {
                fail();
            }
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            if (previousRank != null && previousRank == pointRank) {
                assertEquals(servicePointCount, previousPoint);
                existsSame = true;
            }
            previousPoint = servicePointCount;
            previousRank = pointRank;
        }
        assertTrue(existsSame);
    }

    public void test_SpecifyMyselfDerived_ranking_derived() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.specify().columnPurchasePrice();
            }
        }, Member.ALIAS_highestPurchasePrice, op -> op.coalesce(0));
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                            public void query(PurchaseCB subCB) {
                                subCB.specify().columnPurchasePrice();
                            }
                        }, null, op -> op.coalesce(0));
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.inviteDerivedToDreamCruise(Member.ALIAS_highestPurchasePrice));
                    }
                });
            }
        }, Member.ALIAS_loginCount, op -> op.plus(1));
        cb.query().addSpecifiedDerivedOrderBy_Desc(Member.ALIAS_highestPurchasePrice);

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousPrice = null;
        Integer previousRank = null;
        boolean existsSame = false;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer highestPurchasePrice = member.getHighestPurchasePrice();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + highestPurchasePrice + ", " + pointRank);
            if (previousPrice != null && previousPrice < highestPurchasePrice) {
                fail();
            }
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            if (previousRank != null && previousRank == pointRank) {
                assertEquals(highestPurchasePrice, previousPrice);
                existsSame = true;
            }
            previousPrice = highestPurchasePrice;
            previousRank = pointRank;
        }
        assertTrue(existsSame);
    }

    // -----------------------------------------------------
    //                                                 Union
    //                                                 -----
    public void test_SpecifyMyselfDerived_union() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberServiceAsOne();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.query().setMemberStatusCode_Equal_Formalized();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
                subCB.union(new UnionQuery<MemberCB>() {
                    public void query(MemberCB unionCB) {
                        unionCB.query().setMemberStatusCode_Equal_Provisional();
                        unionCB.columnQuery(new SpecifyQuery<MemberCB>() {
                            public void specify(MemberCB cb) {
                                cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                            }
                        }).greaterThan(new SpecifyQuery<MemberCB>() {
                            public void specify(MemberCB cb) {
                                cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                            }
                        });
                    }
                });
            }
        }, Member.ALIAS_loginCount, op -> op.plus(1));
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        int majorVersion = getDatabaseMajorVersion();
        if (majorVersion < 8) { // e.g. 5.7
            assertException(SQLFailureException.class, () -> memberBhv.selectList(cb)).handle(cause -> {
                log(cause.getMessage());
            });
        } else { // since 8.0
            ListResultBean<Member> memberList = memberBhv.selectList(cb);
            assertHasAnyElement(memberList);
            for (Member member : memberList) {
                log(member.getMemberName(), member.getLoginCount());
            }
        }
    }

    // ===================================================================================
    //                                                                (Query)MyselfDerived
    //                                                                ====================
    // -----------------------------------------------------
    //                                               Ranking
    //                                               -------
    public void test_QueryMyselfDerived_ranking_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        final MemberCB dreamCruiseCB = cb.dreamCruiseCB();
        cb.specify().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, Member.ALIAS_loginCount, op -> op.plus(1));
        cb.query().myselfDerived().count(new SubQuery<MemberCB>() {
            public void query(MemberCB subCB) {
                subCB.specify().columnMemberId();
                subCB.columnQuery(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.specify().specifyMemberServiceAsOne().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberCB>() {
                    public void specify(MemberCB cb) {
                        cb.overTheWaves(dreamCruiseCB.specify().specifyMemberServiceAsOne().columnServicePointCount());
                    }
                });
            }
        }, op -> op.plus(1)).lessEqual(3);
        cb.query().queryMemberServiceAsOne().addOrderBy_ServicePointCount_Desc();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        Integer previousRank = null;
        for (Member member : memberList) {
            Integer memberId = member.getMemberId();
            Integer pointRank = member.getLoginCount();
            log(memberId + ", " + pointRank);
            if (previousRank != null && previousRank > pointRank) {
                fail();
            }
            assertFalse(member.getMemberServiceAsOne().isPresent());
            assertTrue(pointRank <= 3);
            previousRank = pointRank;
        }
        assertEquals(3, memberList.size());
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected int getDatabaseMajorVersion() {
        int majorVersion;
        try {
            majorVersion = getDataSource().getConnection().getMetaData().getDatabaseMajorVersion();
        } catch (SQLException e) {
            throw new IllegalStateException("Failed to get major version", e);
        }
        return majorVersion;
    }
}
