package org.docksidestage.mysql.dbflute.whitebox;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.NonSetupSelectRelationAccessException;
import org.docksidestage.mysql.dbflute.cbean.WhiteStilettoAliasRefCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteStilettoAliasBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteStilettoAliasRefBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteStilettoAlias;
import org.docksidestage.mysql.dbflute.exentity.WhiteStilettoAliasRef;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5J (2014/07/23 Wednesday)
 */
public class WxStilettoAliasTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private WhiteStilettoAliasBhv whiteStilettoAliasBhv;
    private WhiteStilettoAliasRefBhv whiteStilettoAliasRefBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_basic() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
        cb.setupSelect_WhiteStilettoAlias();
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<WhiteStilettoAliasRef> refList = whiteStilettoAliasRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        int number = 1;
        for (WhiteStilettoAliasRef ref : refList) {
            WhiteStilettoAlias alias = ref.getWhiteStilettoAlias().get();
            log(ref, alias);
            assertEquals("1-" + number + ":foo0", ref.getFoo0());
            assertEquals("1-" + number + ":foo1", ref.getFoo1());
            assertEquals("1-" + number + ":foo2", ref.getFoo2());
            assertEquals("1-" + number + ":foo3", ref.getFoo3());
            assertEquals("1-" + number + ":foo4", ref.getFoo4());
            assertEquals("1-" + number + ":bar0", ref.getBar0());
            assertEquals("1-" + number + ":c21", ref.getC21());
            assertEquals("1-" + number + ":c22", ref.getC22());
            assertEquals("1-" + number + ":c23", ref.getC23());
            assertEquals("1:foo", alias.getFoo());
            assertEquals("1:foo0", alias.getFoo0());
            assertEquals("1:foo1", alias.getFoo1());
            assertEquals("1:foo2", alias.getFoo2());
            assertEquals("1:foo3", alias.getFoo3());
            assertEquals("1:foo4", alias.getFoo4());
            assertEquals("1:bar", alias.getBar()); // as c20 duplicate
            assertEquals("1:qux", alias.getQux()); // as df21 duplicate and duplicate
            ++number;
        }
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("as c20"));
        assertTrue(sql.contains("as df21"));
    }

    public void test_SpecifyColumn_exceptLocalDuplicate() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
        cb.specify().columnFoo1();
        cb.setupSelect_WhiteStilettoAlias();
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<WhiteStilettoAliasRef> refList = whiteStilettoAliasRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        int number = 1;
        for (WhiteStilettoAliasRef ref : refList) {
            WhiteStilettoAlias alias = ref.getWhiteStilettoAlias().get();
            log(ref, alias);
            assertEquals(null, ref.xznocheckGetFoo0());
            assertEquals("1-" + number + ":foo1", ref.getFoo1());
            assertEquals(null, ref.xznocheckGetFoo2());
            assertNonSpecifiedAccess(() -> ref.getFoo2());
            assertEquals(null, ref.xznocheckGetFoo3());
            assertEquals(null, ref.xznocheckGetFoo4());
            assertEquals(null, ref.xznocheckGetBar0());
            assertEquals(null, ref.xznocheckGetC21());
            assertEquals(null, ref.xznocheckGetC22());
            assertEquals(null, ref.xznocheckGetC23());
            assertNonSpecifiedAccess(() -> ref.getC23());
            assertEquals("1:foo", alias.getFoo());
            assertEquals("1:foo0", alias.getFoo0());
            assertEquals("1:foo1", alias.getFoo1());
            assertEquals("1:foo2", alias.getFoo2());
            assertEquals("1:foo3", alias.getFoo3());
            assertEquals("1:foo4", alias.getFoo4());
            assertEquals("1:bar", alias.getBar());
            assertEquals("1:qux", alias.getQux());
            ++number;
        }
    }

    public void test_SpecifyColumn_exceptRelationDuplicate() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
        cb.setupSelect_WhiteStilettoAlias();
        cb.specify().specifyWhiteStilettoAlias().columnFoo1();
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<WhiteStilettoAliasRef> refList = whiteStilettoAliasRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        int number = 1;
        for (WhiteStilettoAliasRef ref : refList) {
            WhiteStilettoAlias alias = ref.getWhiteStilettoAlias().get();
            log(ref, alias);
            assertEquals("1-" + number + ":foo0", ref.getFoo0());
            assertEquals("1-" + number + ":foo1", ref.getFoo1());
            assertEquals("1-" + number + ":foo2", ref.getFoo2());
            assertEquals("1-" + number + ":foo3", ref.getFoo3());
            assertEquals("1-" + number + ":foo4", ref.getFoo4());
            assertEquals("1-" + number + ":bar0", ref.getBar0());
            assertEquals("1-" + number + ":c21", ref.getC21());
            assertEquals("1-" + number + ":c22", ref.getC22());
            assertEquals("1-" + number + ":c23", ref.getC23());
            assertEquals(null, alias.xznocheckGetFoo());
            assertEquals(null, alias.xznocheckGetFoo0());
            assertEquals("1:foo1", alias.getFoo1());
            assertEquals(null, alias.xznocheckGetFoo2());
            assertEquals(null, alias.xznocheckGetFoo3());
            assertEquals(null, alias.xznocheckGetFoo4());
            assertEquals(null, alias.xznocheckGetBar());
            assertEquals(null, alias.xznocheckGetQux());
            assertNonSpecifiedAccess(() -> alias.getFoo());
            assertNonSpecifiedAccess(() -> alias.getBar());
            assertNonSpecifiedAccess(() -> alias.getQux());
            ++number;
        }
    }

    public void test_simple_ref() throws Exception {
        // ## Arrange ##
        registerTestData();

        WhiteStilettoAliasRefCB cb = new WhiteStilettoAliasRefCB();
        cb.addOrderBy_PK_Asc();

        // ## Act ##
        ListResultBean<WhiteStilettoAliasRef> refList = whiteStilettoAliasRefBhv.selectList(cb);

        // ## Assert ##
        assertHasAnyElement(refList);
        int number = 1;
        for (WhiteStilettoAliasRef ref : refList) {
            assertException(NonSetupSelectRelationAccessException.class, () -> ref.getWhiteStilettoAlias().get());
            log(ref);
            assertEquals("1-" + number + ":foo0", ref.getFoo0());
            assertEquals("1-" + number + ":foo1", ref.getFoo1());
            assertEquals("1-" + number + ":foo2", ref.getFoo2());
            assertEquals("1-" + number + ":foo3", ref.getFoo3());
            assertEquals("1-" + number + ":foo4", ref.getFoo4());
            assertEquals("1-" + number + ":bar0", ref.getBar0());
            assertEquals("1-" + number + ":c21", ref.getC21());
            assertEquals("1-" + number + ":c22", ref.getC22());
            assertEquals("1-" + number + ":c23", ref.getC23());
            ++number;
        }
    }

    // ===================================================================================
    //                                                                         Test Helper
    //                                                                         ===========
    protected void registerTestData() {
        {
            WhiteStilettoAlias alias = new WhiteStilettoAlias();
            alias.setStilettoAliasId(1);
            alias.setFoo("1:foo");
            alias.setFoo0("1:foo0");
            alias.setFoo1("1:foo1");
            alias.setFoo2("1:foo2");
            alias.setFoo3("1:foo3");
            alias.setFoo4("1:foo4");
            alias.setBar("1:bar");
            alias.setQux("1:qux");
            whiteStilettoAliasBhv.insert(alias);

            {
                WhiteStilettoAliasRef ref = new WhiteStilettoAliasRef();
                ref.setRefId(1);
                ref.setFoo0("1-1:foo0");
                ref.setFoo1("1-1:foo1");
                ref.setFoo2("1-1:foo2");
                ref.setFoo3("1-1:foo3");
                ref.setFoo4("1-1:foo4");
                ref.setBar0("1-1:bar0");
                ref.setQux0("1-1:qux0");
                ref.setC21("1-1:c21");
                ref.setC22("1-1:c22");
                ref.setC23("1-1:c23");
                ref.setStilettoAliasId(1);
                whiteStilettoAliasRefBhv.insert(ref);
            }
            {
                WhiteStilettoAliasRef ref = new WhiteStilettoAliasRef();
                ref.setRefId(2);
                ref.setFoo0("1-2:foo0");
                ref.setFoo1("1-2:foo1");
                ref.setFoo2("1-2:foo2");
                ref.setFoo3("1-2:foo3");
                ref.setFoo4("1-2:foo4");
                ref.setBar0("1-2:bar0");
                ref.setQux0("1-2:qux0");
                ref.setC21("1-2:c21");
                ref.setC22("1-2:c22");
                ref.setC23("1-2:c23");
                ref.setStilettoAliasId(1);
                whiteStilettoAliasRefBhv.insert(ref);
            }
        }
    }
}
