package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SubQuery;
import org.dbflute.exception.ConditionInvokingFailureException;
import org.dbflute.util.Srl;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqManyOneOneDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteSuppressJoinSqOneDbm;
import org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqManyCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqManyOneOneCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteSuppressJoinSqOneCB;
import org.docksidestage.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqManyNss;
import org.docksidestage.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqManyOneNss;
import org.docksidestage.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqNss;
import org.docksidestage.mysql.dbflute.cbean.nss.WhiteSuppressJoinSqOneNss;
import org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteSuppressJoinSqManyOneBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSq;
import org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSqMany;
import org.docksidestage.mysql.dbflute.exentity.WhiteSuppressJoinSqManyOne;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5G (2014/05/27 Tuesday)
 */
public class WxSuppressJoinSubQueryTest extends UnitContainerTestCase {

    private WhiteSuppressJoinSqBhv whiteSuppressJoinSqBhv;
    private WhiteSuppressJoinSqManyBhv whiteSuppressJoinSqManyBhv;
    private WhiteSuppressJoinSqManyOneBhv whiteSuppressJoinSqManyOneBhv;

    // ===================================================================================
    //                                                                                Join
    //                                                                                ====
    public void test_suppressJoin_ManyToOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqManyCB cb = new WhiteSuppressJoinSqManyCB();
        WhiteSuppressJoinSqManyDbm dbm = WhiteSuppressJoinSqManyDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSq().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqManyNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }

        // ## Act ##
        ListResultBean<WhiteSuppressJoinSqMany> ls = whiteSuppressJoinSqManyBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressJoin_ManyToOneToOne() throws Exception {
        // ## Arrange ##
        WhiteSuppressJoinSqManyOneCB cb = new WhiteSuppressJoinSqManyOneCB();
        WhiteSuppressJoinSqManyOneDbm dbm = WhiteSuppressJoinSqManyOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqManyOneOne().getForeignPropertyName();

        // ## Act ##
        cb.invokeSetupSelect(foreignPropertyName);
        checkNss(WhiteSuppressJoinSqManyOneNss.class, foreignPropertyName);
        ListResultBean<WhiteSuppressJoinSqManyOne> ls = whiteSuppressJoinSqManyOneBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    public void test_suppressJoin_OneToOne_asOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
        WhiteSuppressJoinSqDbm dbm = WhiteSuppressJoinSqDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqOneAsOne().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    public void test_suppressJoin_OneToOne_fkroot() {
        // ## Arrange ##
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
        WhiteSuppressJoinSqOneDbm dbm = WhiteSuppressJoinSqOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSq().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqOneNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    public void test_suppressJoin_OneToOneToOne() {
        // ## Arrange ##
        WhiteSuppressJoinSqOneCB cb = new WhiteSuppressJoinSqOneCB();
        WhiteSuppressJoinSqOneDbm dbm = WhiteSuppressJoinSqOneDbm.getInstance();
        String foreignPropertyName = dbm.foreignWhiteSuppressJoinSqOneAddi().getForeignPropertyName();

        // ## Act ##
        try {
            cb.invokeSetupSelect(foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (ConditionInvokingFailureException e) {
            log(e.getMessage());
        }
        // ## Act ##
        try {
            checkNss(WhiteSuppressJoinSqOneNss.class, foreignPropertyName);
            // ## Assert ##
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    protected void checkNss(Class<?> nssType, String foreignPropertyName) throws NoSuchMethodException {
        nssType.getMethod("with" + Srl.initCap(foreignPropertyName), (Class[]) null);
    }

    // ===================================================================================
    //                                                                            SubQuery
    //                                                                            ========
    public void test_suppressSubQuery_OneToMany() {
        // ## Arrange ##
        WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
        String referrerPropertyName = WhiteSuppressJoinSqDbm.getInstance().referrerWhiteSuppressJoinSqManyList()
                .getReferrerPropertyName();

        // ## Act ##
        try {
            // ## Assert ##
            checkExists(cb.query().getClass(), referrerPropertyName);
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }

        // ## Act ##
        ListResultBean<WhiteSuppressJoinSq> ls = whiteSuppressJoinSqBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertHasZeroElement(ls);
    }

    // exists for as-one is unsupported as default
    //public void test_suppressSubQuery_OneToOne_noSuppress() {
    //    // ## Arrange ##
    //    WhiteSuppressJoinSqCB cb = new WhiteSuppressJoinSqCB();
    //    cb.query().existsWhiteSuppressJoinSqOneAsOne(new SubQuery<WhiteSuppressJoinSqOneCB>() {
    //        public void query(WhiteSuppressJoinSqOneCB subCB) {
    //        }
    //    });
    //
    //    // ## Act ##
    //    ListResultBean<WhiteSuppressJoinSq> ls = whiteSuppressJoinSqBhv.selectList(cb); // expect no exception
    //
    //    // ## Assert ##
    //    assertHasZeroElement(ls);
    //}

    public void test_suppressSubQuery_ManyToOneToOne() throws Exception {
        // ## Arrange ##
        WhiteSuppressJoinSqManyOneOneCB cb = new WhiteSuppressJoinSqManyOneOneCB();
        WhiteSuppressJoinSqManyOneOneDbm dbm = WhiteSuppressJoinSqManyOneOneDbm.getInstance();
        String referrerPropertyName = dbm.referrerWhiteSuppressJoinSqManyOneList().getReferrerPropertyName();

        // ## Act ##
        try {
            // ## Assert ##
            checkExists(cb.query().getClass(), referrerPropertyName);
            fail();
        } catch (NoSuchMethodException e) {
            log(e.getMessage());
        }
    }

    protected void checkExists(Class<?> cqType, String referrerPropertyName) throws NoSuchMethodException {
        cqType.getMethod("exists" + Srl.initCap(referrerPropertyName), new Class[] { SubQuery.class });
    }
}