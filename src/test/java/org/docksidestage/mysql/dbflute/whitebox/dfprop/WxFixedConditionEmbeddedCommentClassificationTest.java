package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5L (2014/09/17 Wednesday)
 */
public class WxFixedConditionEmbeddedCommentClassificationTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    public void test_VariantRelation_SetupSelect_basic() throws Exception {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.setupSelect_MemberLoginAsEmbeddedCommentClassificationTest();

        // ## Act ##
        ListResultBean<Member> memberList = memberBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        assertContains(sql, ".MOBILE_LOGIN_FLG = 1");
        assertContains(sql, ".LOGIN_MEMBER_STATUS_CODE in ('FML', 'PRV')");
        assertContains(sql, ".LOGIN_MEMBER_STATUS_CODE in ('WDL')");
        assertContains(sql, "and dfrel_");
        assertContains(sql, "or dfrel_");
        assertContains(sql, "or dfrel_");
    }
}
