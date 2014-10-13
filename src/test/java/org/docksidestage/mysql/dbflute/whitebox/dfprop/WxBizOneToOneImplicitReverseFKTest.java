package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.util.Date;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.DBMetaNotFoundException;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkRefDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteImplicitReverseFkSuppressDbm;
import org.docksidestage.mysql.dbflute.cbean.MemberAddressCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteImplicitReverseFkCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteImplicitReverseFkSuppressCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteSelfReferenceCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberAddressBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteImplicitReverseFkBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteImplicitReverseFkSuppressBhv;
import org.docksidestage.mysql.dbflute.exentity.MemberAddress;
import org.docksidestage.mysql.dbflute.exentity.WhiteImplicitReverseFk;
import org.docksidestage.mysql.dbflute.exentity.WhiteImplicitReverseFkSuppress;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class WxBizOneToOneImplicitReverseFKTest extends UnitContainerTestCase {

    private MemberAddressBhv memberAddressBhv;
    private WhiteImplicitReverseFkBhv whiteImplicitReverseFkBhv;
    private WhiteImplicitReverseFkSuppressBhv whiteImplicitReverseFkSuppressBhv;

    // ===================================================================================
    //                                                                  Implicit ReverseFK
    //                                                                  ==================
    public void test_BizOneToOne_implicitReverseFK_alreadyExists() {
        // ## Arrange ##
        MemberAddressCB cb = new MemberAddressCB();
        cb.setupSelect_Member();

        // ## Act ##
        ListResultBean<MemberAddress> addressList = memberAddressBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(addressList);
        for (MemberAddress address : addressList) {
            log(address);
            assertNotNull(address.getMember());
        }
    }

    public void test_BizOneToOne_implicitReverseFK_specify() {
        // ## Arrange ##
        Date targetDate = currentDate();
        WhiteImplicitReverseFkCB cb = new WhiteImplicitReverseFkCB();
        cb.setupSelect_WhiteImplicitReverseFkRefWithImplicitReverseFK(targetDate);
        cb.setupSelect_WhiteImplicitReverseFkSuppressSuppressImplicitReverseFK(targetDate);
        cb.specify().specifyWhiteImplicitReverseFkRefWithImplicitReverseFK().columnValidBeginDate();
        cb.specify().specifyWhiteImplicitReverseFkSuppressSuppressImplicitReverseFK().columnValidBeginDate();
        // implicit reverse FK is unsupported as default
        //cb.specify().derivedWhiteImplicitReverseFkRefList().max(new SubQuery<WhiteImplicitReverseFkRefCB>() {
        //    public void query(WhiteImplicitReverseFkRefCB subCB) {
        //        subCB.specify().columnValidBeginDate();
        //    }
        //}, WhiteImplicitReverseFk.ALIAS_maxBeginDate);
        //cb.query().existsWhiteImplicitReverseFkRefList(new SubQuery<WhiteImplicitReverseFkRefCB>() {
        //    public void query(WhiteImplicitReverseFkRefCB subCB) {
        //    }
        //});

        // ## Act ##
        ListResultBean<WhiteImplicitReverseFk> fkList = whiteImplicitReverseFkBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(fkList);
        // implicit reverse FK is unsupported as default
        //assertContainsAll(cb.toDisplaySql(), ") as MAX_BEGIN_DATE", "exists");
    }

    // implicit reverse FK is unsupported as default
    //public void test_BizOneToOne_implicitReverseFK_with() {
    //    // ## Arrange ##
    //    WhiteImplicitReverseFkRefCB cb = new WhiteImplicitReverseFkRefCB();
    //    cb.setupSelect_WhiteImplicitReverseFk();
    //
    //    // ## Act ##
    //    ListResultBean<WhiteImplicitReverseFkRef> fkList = whiteImplicitReverseFkRefBhv.selectList(cb);
    //
    //    // ## Assert ##
    //    assertHasZeroElement(fkList);
    //}

    public void test_BizOneToOne_implicitReverseFK_suppress() {
        // ## Arrange ##
        WhiteImplicitReverseFkSuppressCB cb = new WhiteImplicitReverseFkSuppressCB();

        // ## Act ##
        ListResultBean<WhiteImplicitReverseFkSuppress> fkList = whiteImplicitReverseFkSuppressBhv.selectList(cb);

        // ## Assert ##
        assertHasZeroElement(fkList);
        assert_isSuppressImplicitReverseFK_noFK();
    }

    protected void assert_isSuppressImplicitReverseFK_noFK() {
        // ## Arrange ##
        WhiteImplicitReverseFkSuppressDbm dbm = WhiteImplicitReverseFkSuppressDbm.getInstance();
        try {
            // ## Act ##
            dbm.findForeignInfo(WhiteImplicitReverseFkRefDbm.getInstance().getTablePropertyName());

            // ## Assert ##
            fail();
        } catch (DBMetaNotFoundException e) {
            log(e.getMessage());
        }
    }

    public void test_BizOneToOne_implicitReverseFK_reverseAsOne() {
        // ## Arrange ##
        WhiteSelfReferenceCB cb = new WhiteSelfReferenceCB();
        cb.setupSelect_WhiteSelfReferenceRefOneAsOne();
        // implicit reverse FK is unsupported as default
        //cb.setupSelect_WhiteSelfReferenceRefOneByParentId();

        // ## Act & Assert ##
        log(ln() + cb.toDisplaySql()); // expect no exception
        assert_isSuppressImplicitReverseFK_noFK();
    }
}