package org.docksidestage.mysql.dbflute.whitebox;

import java.util.List;

import org.dbflute.cbean.scoping.SpecifyQuery;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5L (2014/09/14 Sunday)
 */
public class WxCBColumnQueryBitOperandTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                         Bit Operand
    //                                                                         ===========
    public void test_bitAnd_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnMemberId();
            }
        }).bitAnd(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnVersionNo();
            }
        });

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        // result size is unknown
        for (Member member : memberList) {
            log(member.getMemberName());
        }
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("where dfloc.MEMBER_ID & dfloc.VERSION_NO"));
    }

    public void test_bitAnd_forcedly() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnMemberId();
            }
        }).bitAnd(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnVersionNo();
            }
        }).left().multiply(0).plus(5).right().multiply(0).plus(4);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("where (dfloc.MEMBER_ID * 0) + 5 & (dfloc.VERSION_NO * 0) + 4"));
    }

    public void test_bitOr_basic() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnMemberId();
            }
        }).bitOr(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnVersionNo();
            }
        });

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("where dfloc.MEMBER_ID | dfloc.VERSION_NO"));
    }

    public void test_bitAnd_mysticRhythms() {
        // ## Arrange ##
        MemberCB cb = new MemberCB();
        cb.columnQuery(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.specify().columnMemberId();
            }
        }).bitAnd(new SpecifyQuery<MemberCB>() {
            public void specify(MemberCB cb) {
                cb.mysticRhythms(4);
            }
        }).left().multiply(0).plus(5);

        // ## Act ##
        List<Member> memberList = memberBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(memberList);
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("where (dfloc.MEMBER_ID * 0) + 5 & 4"));
    }
}
