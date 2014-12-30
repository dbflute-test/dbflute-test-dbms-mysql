package org.docksidestage.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.cbean.scoping.UnionQuery;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/30 Thursday)
 */
public class WxBhvQueryUpdateMySQLTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private PurchasePaymentBhv purchasePaymentBhv;

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    public void test_queryUpdate_basic() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate()");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        int updatedCount = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        assertNotSame(0, updatedCount);
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate()");
        actualCB.query().setMemberStatusCode_Equal_Provisional();
        actualCB.query().setFormalizedDatetime_IsNull();
        actualCB.query().setUpdateUser_Equal(getAccessContext().getAccessUser()); // common column updated
        int count = memberBhv.selectCount(actualCB);
        assertEquals(count, updatedCount);
    }

    public void test_queryUpdate_OuterJoin() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
        cb.query().queryMemberStatus().setDisplayOrder_GreaterEqual(2);
        ListResultBean<Member> beforeList = memberBhv.selectList(cb);

        // ## Act ##
        memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate");
        ListResultBean<Member> actualList = memberBhv.selectList(actualCB);
        assertEquals(beforeList.size(), actualList.size());
        assertHasAnyElement(actualList);
        for (Member actual : actualList) {
            assertEquals("queryUpdate", actual.getMemberName());
            assertTrue(actual.isMemberStatusCodeProvisional());
            assertNull(actual.getFormalizedDatetime());
        }
    }

    public void test_queryUpdate_Union() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Formalized();
            }
        });

        // ## Act ##
        try {
            memberBhv.queryUpdate(member, cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(ln() + e.getMessage());
        }
    }

    public void test_queryUpdate_ExistsReferrer() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberName("queryUpdate()");
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });

        // ## Act ##
        int updatedCount = memberBhv.queryUpdate(member, cb);

        // ## Assert ##
        MemberCB actualCB = new MemberCB();
        actualCB.query().setMemberName_Equal("queryUpdate()");
        actualCB.query().setMemberStatusCode_Equal_Provisional();
        actualCB.query().setFormalizedDatetime_IsNull();
        actualCB.query().setUpdateUser_Equal(getAccessContext().getAccessUser());
        actualCB.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });
        assertEquals(memberBhv.selectCount(actualCB), updatedCount);
    }

    public void test_queryUpdate_VersionNo_resolvedAliasWhenJoined() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().queryMemberStatus().setDisplayOrder_GreaterEqual(2);

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            int updatedCount = memberBhv.queryUpdate(member, cb);

            // ## Assert ##
            assertNotSame(0, updatedCount);
            String sql = infoList.get(1).getDisplaySql();
            assertTrue(sql.contains(", dfloc.VERSION_NO = dfloc.VERSION_NO + 1"));
            MemberCB actualCB = new MemberCB();
            actualCB.query().setMemberStatusCode_Equal_Provisional();
            actualCB.query().setFormalizedDatetime_IsNull();
            actualCB.query().setUpdateUser_Equal(getAccessContext().getAccessUser()); // common column
            ListResultBean<Member> actualList = memberBhv.selectList(actualCB);
            assertEquals(actualList.size(), updatedCount);
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryUpdate_SelfCalculation_resolvedAliasWhenJoined() {
        // ## Arrange ##
        Purchase purchase = new Purchase();
        purchase.setPaymentCompleteFlg_True();

        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });
            // ## Act ##
            int updatedCount = purchaseBhv.varyingQueryUpdate(purchase, cb -> {
                cb.query().queryMember().setMemberStatusCode_Equal_Provisional();
            }, op -> op.self(colCB -> {
                colCB.specify().columnPurchasePrice();
            }).multiply(10));

            // ## Assert ##
            assertNotSame(0, updatedCount);
            String sql = infoList.get(1).getDisplaySql();
            assertTrue(sql.contains("set dfloc.PURCHASE_PRICE = ((dfloc.PURCHASE_PRICE - 13) * 10 + 13)"));
            assertTrue(sql.contains(", dfloc.VERSION_NO = dfloc.VERSION_NO + 1"));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryUpdate_CheckCountBeforeQueryUpdate_existing() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // default true in this project
            //cb.enableCheckCountBeforeQueryUpdate();
            int updated = memberBhv.queryUpdate(member, cb);

            // ## Assert ##
            assertNotSame(0, updated);
            assertHasPluralElement(infoList);
            String firstSql = infoList.get(0).getDisplaySql();
            assertTrue(firstSql.contains("select count(*)"));
            assertFalse(firstSql.contains("update "));
            String secondSql = infoList.get(1).getDisplaySql();
            assertFalse(secondSql.contains("select count(*)"));
            assertTrue(secondSql.contains("update "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryUpdate_CheckCountBeforeQueryUpdate_skipped() {
        // ## Arrange ##
        Member member = new Member();
        member.setMemberStatusCode_Provisional();
        member.setFormalizedDatetime(null);

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_Equal(99999);

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // default true in this project
            //cb.enableCheckCountBeforeQueryUpdate();
            int deleted = memberBhv.queryUpdate(member, cb);

            // ## Assert ##
            assertEquals(0, deleted);
            assertHasOnlyOneElement(infoList);
            String sql = infoList.get(0).getDisplaySql();
            assertTrue(sql.contains("select count(*)"));
            assertFalse(sql.contains("update "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                        Query Delete
    //                                                                        ============
    public void test_queryDelete_basic() {
        // ## Arrange ##
        deleteMemberReferrer(); // for Test

        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        int deletedCount = memberBhv.queryDelete(cb);

        // ## Assert ##
        assertNotSame(0, deletedCount);
        assertEquals(0, memberBhv.selectCount(cb));
    }

    public void test_queryDelete_outerJoin() {
        // ## Arrange ##
        purchasePaymentBhv.varyingQueryDelete(cb -> {}, op -> op.allowNonQueryDelete());

        // ## Act ##
        purchaseBhv.queryDelete(cb -> {
            cb.query().queryMember().setMemberStatusCode_Equal_Formalized();
        }); // supported since 1.0.4C

        // ## Assert ##
        assertEquals(0, purchaseBhv.selectCount(cb -> {
            cb.query().queryMember().setMemberStatusCode_Equal_Formalized();
        }));
    }

    public void test_queryDelete_Union() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.union(new UnionQuery<MemberCB>() {
            public void query(MemberCB unionCB) {
                unionCB.query().setMemberStatusCode_Equal_Formalized();
            }
        });

        // ## Act ##
        try {
            memberBhv.queryDelete(cb);

            // ## Assert ##
            fail();
        } catch (IllegalConditionBeanOperationException e) {
            // OK
            log(ln() + e.getMessage());
        }
    }

    public void test_queryDelete_ExistsReferrer() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            cb.disableQueryUpdateCountPreCheck();
            int deleted = memberBhv.queryDelete(cb);

            // ## Assert ##
            assertEquals(0, deleted);
            String sql = infoList.get(0).getDisplaySql();
            assertTrue(sql.contains("delete dfloc from MEMBER"));
            assertTrue(sql.contains("where exists (select"));
            assertFalse(sql.contains(" join "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryDelete_NotExistsReferrer() {
        // ## Arrange ##
        deleteMemberReferrer();
        int countAll = memberBhv.selectCount(new MemberCB());
        MemberCB cb = new MemberCB();
        cb.query().notExistsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
            }
        });

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            cb.disableQueryUpdateCountPreCheck();
            int deleted = memberBhv.queryDelete(cb);

            // ## Assert ##
            assertEquals(countAll, deleted);
            String sql = infoList.get(0).getDisplaySql();
            assertTrue(sql.contains("delete dfloc from MEMBER"));
            assertTrue(sql.contains("where not exists (select"));
            assertFalse(sql.contains(" join "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryDelete_InScopeRelation() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().existsPurchase(new SubQuery<PurchaseCB>() {
            public void query(PurchaseCB subCB) {
                subCB.useInScopeSubQuery();
                subCB.query().setPurchasePrice_GreaterEqual(2000);
            }
        });

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            cb.disableQueryUpdateCountPreCheck();
            int deleted = memberBhv.queryDelete(cb);

            // ## Assert ##
            assertEquals(0, deleted);
            String sql = infoList.get(0).getDisplaySql();
            assertTrue(sql.contains("delete dfloc from MEMBER"));
            assertTrue(sql.contains("where dfloc.MEMBER_ID in (select"));
            assertFalse(sql.contains(" join "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryDelete_CheckCountBeforeQueryUpdate_existing() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // default true in this project
            //cb.enableCheckCountBeforeQueryUpdate();
            int deleted = memberBhv.queryDelete(cb);

            // ## Assert ##
            assertNotSame(0, deleted);
            assertHasPluralElement(infoList);
            String firstSql = infoList.get(0).getDisplaySql();
            assertTrue(firstSql.contains("select count(*)"));
            assertFalse(firstSql.contains("delete from "));
            String secondSql = infoList.get(1).getDisplaySql();
            assertFalse(secondSql.contains("select count(*)"));
            assertTrue(secondSql.contains("delete from "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    public void test_queryDelete_CheckCountBeforeQueryUpdate_skipped() {
        // ## Arrange ##
        deleteMemberReferrer();
        MemberCB cb = new MemberCB();
        cb.query().setMemberStatusCode_Equal_Formalized();
        cb.query().setMemberId_Equal(99999);

        // ## Act ##
        try {
            final List<SqlLogInfo> infoList = new ArrayList<SqlLogInfo>();
            CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
                public void handle(SqlLogInfo info) {
                    infoList.add(info);
                }
            });

            // default true in this project
            //cb.enableCheckCountBeforeQueryUpdate();
            int deleted = memberBhv.queryDelete(cb);

            // ## Assert ##
            assertEquals(0, deleted);
            assertHasOnlyOneElement(infoList);
            String sql = infoList.get(0).getDisplaySql();
            assertTrue(sql.contains("select count(*)"));
            assertFalse(sql.contains("delete from "));
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }
}
