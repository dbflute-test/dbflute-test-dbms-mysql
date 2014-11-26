package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.cbean.scoping.SubQuery;
import org.docksidestage.mysql.dbflute.cbean.MemberLoginCB;
import org.docksidestage.mysql.dbflute.cbean.MemberServiceCB;
import org.docksidestage.mysql.dbflute.cbean.PurchaseCB;
import org.docksidestage.mysql.dbflute.cbean.ServiceRankCB;
import org.docksidestage.mysql.dbflute.exentity.ServiceRank;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxCBNestedReferrerFormatTest extends UnitContainerTestCase {

    public void test_NestedReferrer_onParade() throws Exception {
        // ## Arrange ##
        ServiceRankCB cb = new ServiceRankCB();
        cb.specify().derivedMemberService().count(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().columnMemberServiceId();
            }
        }, ServiceRank.ALIAS_memberCount);
        cb.specify().derivedMemberService().sum(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_maxPurchasePrice);
        cb.specify().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedPurchase().avg(new SubQuery<PurchaseCB>() {
                    public void query(PurchaseCB subCB) {
                        subCB.specify().columnPurchasePrice();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_avgPurchasePrice);
        cb.specify().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().columnServicePointCount();
            }
        }, ServiceRank.ALIAS_sumPointCount);
        cb.specify().derivedMemberService().count(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.specify().specifyMember().derivedMemberLogin().count(new SubQuery<MemberLoginCB>() {

                    public void query(MemberLoginCB subCB) {
                        subCB.specify().columnMemberLoginId();
                    }
                }, null);
            }
        }, ServiceRank.ALIAS_loginCount);
        cb.columnQuery(new SpecifyQuery<ServiceRankCB>() {
            public void specify(ServiceRankCB cb) {
                cb.specify().columnDisplayOrder();
            }
        }).greaterThan(new SpecifyQuery<ServiceRankCB>() {
            public void specify(ServiceRankCB cb) {
                cb.specify().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
                    public void query(MemberServiceCB subCB) {
                        subCB.specify().columnServicePointCount();
                        subCB.query().setUpdateUser_Equal("ColumnQueryUser");
                    }
                }, null, op -> op.coalesce(123).round(8));
            }
        });
        cb.query().existsMemberService(new SubQuery<MemberServiceCB>() {
            public void query(MemberServiceCB subCB) {
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().columnServicePointCount();
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
                            public void query(MemberServiceCB subCB) {
                                subCB.specify().columnServicePointCount();
                                subCB.query().setUpdateUser_Equal("ColumnQueryUser");
                            }
                        }, null, op -> op.coalesce(123));
                    }
                });
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
                            public void query(MemberServiceCB subCB) {
                                subCB.specify().columnServicePointCount();
                                subCB.query().setUpdateUser_Equal("@ServicePointCount");
                            }
                        }, null, op -> op.coalesce(789));
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().columnServicePointCount();
                    }
                });
                subCB.columnQuery(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyMember().derivedPurchase().max(new SubQuery<PurchaseCB>() {
                            public void query(PurchaseCB subCB) {
                                subCB.specify().columnPurchasePrice();
                            }
                        }, null);
                    }
                }).greaterThan(new SpecifyQuery<MemberServiceCB>() {
                    public void specify(MemberServiceCB cb) {
                        cb.specify().specifyServiceRank().derivedMemberService().avg(new SubQuery<MemberServiceCB>() {
                            public void query(MemberServiceCB subCB) {
                                subCB.specify().columnServicePointCount();
                            }
                        }, null, op -> op.coalesce(456));
                    }
                }).plus(999);
            }
        });

        // ## Act ##
        String displaySql = cb.toDisplaySql();

        // ## Assert ##
        log(ln() + displaySql);
        assertTrue(displaySql.contains("= 'ColumnQueryUser'"));
        assertTrue(displaySql.contains(", 123"));
    }
}
