package org.docksidestage.mysql.dbflute.whitebox;

import java.util.ArrayList;
import java.util.List;

import org.dbflute.bhv.core.BehaviorCommandMeta;
import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.hook.CallbackContext;
import org.dbflute.hook.SqlLogHandler;
import org.dbflute.hook.SqlLogInfo;
import org.dbflute.hook.SqlStringFilter;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SimpleMemberPmb;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SpInOutParameterPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.customize.SimpleMember;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.9.6 (2012/07/06 Friday)
 */
public class WxSqlStringFilterProcedureTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                          After Care
    //                                                                          ==========
    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        clearBehaviorCommandHook();
    }

    protected void clearBehaviorCommandHook() {
        CallbackContext.clearSqlStringFilterOnThread();
        assertFalse(CallbackContext.isExistCallbackContextOnThread());
        assertFalse(CallbackContext.isExistBehaviorCommandHookOnThread());
        assertFalse(CallbackContext.isExistSqlFireHookOnThread());
        assertFalse(CallbackContext.isExistSqlLogHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlResultHandlerOnThread());
        assertFalse(CallbackContext.isExistSqlStringFilterOnThread());
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_ConditionBean_selectList() {
        // ## Arrange ##
        final List<String> markList = new ArrayList<String>();
        CallbackContext.setSqlStringFilterOnThread(new SqlStringFilter() {
            public String filterSelectCB(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterSelectCB");
                return "/*foo*/" + ln() + executedSql;
            }

            public String filterEntityUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterEntityUpdate");
                return null;
            }

            public String filterQueryUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterQueryUpdate");
                return null;
            }

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterOutsideSql");
                return null;
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                return null;
            }
        });
        final List<SqlLogInfo> sqlLogInfoList = newArrayList();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlLogInfoList.add(info);
            }
        });

        try {
            {
                // ## Act ##
                MemberCB cb = new MemberCB();
                cb.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
                ListResultBean<Member> memberList = memberBhv.selectList(cb);

                // ## Assert ##
                assertFalse(memberList.isEmpty());
                assertEquals(1, markList.size());
                assertEquals("filterSelectCB", markList.get(0));
                assertEquals(1, sqlLogInfoList.size());
                assertTrue(sqlLogInfoList.get(0).getDisplaySql().startsWith("/*foo*/"));
            }
            {
                // ## Act ##
                MemberCB cb = new MemberCB();
                cb.query().setMemberId_Equal(3);
                memberBhv.selectEntityWithDeletedCheck(cb);

                // ## Assert ##
                assertEquals(2, markList.size());
                assertEquals("filterSelectCB", markList.get(1));
                assertEquals(2, sqlLogInfoList.size());
                assertTrue(sqlLogInfoList.get(1).getDisplaySql().startsWith("/*foo*/"));
            }
            {
                // ## Act ##
                MemberCB cb = new MemberCB();
                cb.paging(4, 2);
                ListResultBean<Member> memberList = memberBhv.selectPage(cb);

                // ## Assert ##
                assertFalse(memberList.isEmpty());
                assertEquals(4, markList.size());
                assertEquals("filterSelectCB", markList.get(2));
                assertEquals(4, sqlLogInfoList.size());
                assertTrue(sqlLogInfoList.get(3).getDisplaySql().startsWith("/*foo*/"));
            }
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                           Procedure
    //                                                                           =========
    public void test_Procedure_selectList() {
        // ## Arrange ##
        final List<String> markList = new ArrayList<String>();
        CallbackContext.setSqlStringFilterOnThread(new SqlStringFilter() {
            public String filterSelectCB(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterSelectCB");
                return null;
            }

            public String filterEntityUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterEntityUpdate");
                return null;
            }

            public String filterQueryUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterQueryUpdate");
                return null;
            }

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterOutsideSql");
                return null;
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterProcedure");
                return executedSql + ln() + "/*foo*/";
            }
        });
        final List<SqlLogInfo> sqlLogInfoList = newArrayList();
        CallbackContext.setSqlLogHandlerOnThread(new SqlLogHandler() {
            public void handle(SqlLogInfo info) {
                sqlLogInfoList.add(info);
            }
        });

        try {
            {
                // ## Act ##
                SpInOutParameterPmb pmb = new SpInOutParameterPmb();
                pmb.setVInVarchar("foo");
                pmb.setVInoutVarchar("bar");
                memberBhv.outsideSql().call(pmb);

                // ## Assert ##
                assertEquals("bar", pmb.getVOutVarchar());
                assertEquals("foo", pmb.getVInoutVarchar());
                assertEquals("filterProcedure", markList.get(0));
                assertEquals(1, sqlLogInfoList.size());
                assertTrue(sqlLogInfoList.get(0).getDisplaySql().endsWith("/*foo*/"));
            }
        } finally {
            CallbackContext.clearSqlLogHandlerOnThread();
        }
    }

    // ===================================================================================
    //                                                                           No Filter
    //                                                                           =========
    public void test_NoFilter() {
        // ## Arrange ##
        final List<String> markList = new ArrayList<String>();
        CallbackContext.setSqlStringFilterOnThread(new SqlStringFilter() {
            public String filterSelectCB(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterSelectCB");
                return null;
            }

            public String filterEntityUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterEntityUpdate");
                return null;
            }

            public String filterQueryUpdate(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterQueryUpdate");
                return null;
            }

            public String filterOutsideSql(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterOutsideSql");
                return null;
            }

            public String filterProcedure(BehaviorCommandMeta meta, String executedSql) {
                markList.add("filterProcedure");
                return null;
            }
        });

        // ## Act & Assert ##
        {
            MemberCB cb = new MemberCB();
            cb.query().setMemberName_LikeSearch("S", op -> op.likePrefix());
            assertFalse(memberBhv.selectList(cb).isEmpty());
            assertEquals(1, markList.size());
            assertEquals("filterSelectCB", markList.get(0));
        }
        {
            Member member = new Member();
            member.setMemberId(3);
            member.setMemberName("filterEntity");
            memberBhv.updateNonstrict(member);
            assertEquals("filterEntity", memberBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(3)).getMemberName());
            assertEquals(3, markList.size());
            assertEquals("filterEntityUpdate", markList.get(1));
        }
        {
            Member member = new Member();
            member.setMemberName("filterQuery");
            MemberCB cb = new MemberCB();
            cb.query().setMemberId_Equal(3);
            cb.disableQueryUpdateCountPreCheck();
            memberBhv.queryUpdate(member, cb);
            assertEquals("filterQuery", memberBhv.selectByPK(3).get().getMemberName());
            assertEquals(5, markList.size());
            assertEquals("filterQueryUpdate", markList.get(3));
        }
        {
            SimpleMemberPmb pmb = new SimpleMemberPmb();
            pmb.setMemberId(3);
            SimpleMember member = memberBhv.outsideSql().selectEntity(pmb).get();
            assertEquals("filterQuery", member.getMemberName());
            assertEquals(6, markList.size());
            assertEquals("filterOutsideSql", markList.get(5));
        }
        {
            SpInOutParameterPmb pmb = new SpInOutParameterPmb();
            pmb.setVInVarchar("foo");
            pmb.setVInoutVarchar("bar");
            memberBhv.outsideSql().call(pmb);
            assertEquals("bar", pmb.getVOutVarchar());
            assertEquals("foo", pmb.getVInoutVarchar());
            assertEquals(7, markList.size());
            assertEquals("filterProcedure", markList.get(6));
        }
    }
}
