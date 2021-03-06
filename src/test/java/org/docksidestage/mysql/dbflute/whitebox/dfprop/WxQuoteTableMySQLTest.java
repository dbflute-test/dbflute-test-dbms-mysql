package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.dbmeta.name.TableSqlName;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.VendorCheckDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteQuotedDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.WhiteQuotedRefDbm;
import org.docksidestage.mysql.dbflute.cbean.WhiteQuotedCB;
import org.docksidestage.mysql.dbflute.cbean.WhiteQuotedRefCB;
import org.docksidestage.mysql.dbflute.exbhv.WhiteQuotedBhv;
import org.docksidestage.mysql.dbflute.exbhv.WhiteQuotedRefBhv;
import org.docksidestage.mysql.dbflute.exentity.WhiteQuoted;
import org.docksidestage.mysql.dbflute.exentity.WhiteQuotedRef;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 0.9.5.4 (2009/08/31 Monday)
 */
public class WxQuoteTableMySQLTest extends UnitContainerTestCase {

    private WhiteQuotedBhv whiteQuotedBhv;
    private WhiteQuotedRefBhv whiteQuotedRefBhv;

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_Quote_DBMeta() throws Exception {
        {
            // ## Arrange ##
            TableSqlName tableSqlName = WhiteQuotedDbm.getInstance().getTableSqlName();

            // ## Act & Assert ##
            assertTrue(tableSqlName.toString().startsWith("`"));
            assertTrue(tableSqlName.toString().endsWith("`"));
            String correspondingDbName = tableSqlName.getCorrespondingDbName();
            log(correspondingDbName);
            assertEquals(WhiteQuotedDbm.getInstance().getTableDbName(), correspondingDbName);
        }
        {
            // ## Arrange ##
            TableSqlName tableSqlName = WhiteQuotedRefDbm.getInstance().getTableSqlName();

            // ## Act & Assert ##
            assertTrue(tableSqlName.toString().startsWith("`"));
            assertTrue(tableSqlName.toString().endsWith("`"));
            String correspondingDbName = tableSqlName.getCorrespondingDbName();
            log(correspondingDbName);
            assertEquals(WhiteQuotedRefDbm.getInstance().getTableDbName(), correspondingDbName);
        }
    }

    public void test_Quote_not_DBMeta() throws Exception {
        // ## Arrange ##
        TableSqlName tableSqlName = VendorCheckDbm.getInstance().getTableSqlName();

        // ## Act & Assert ##
        assertFalse(tableSqlName.toString().startsWith("\""));
        assertFalse(tableSqlName.toString().endsWith("\""));
    }

    // ===================================================================================
    //                                                                       ConditionBean
    //                                                                       =============
    public void test_Quote_CB_basic() throws Exception {
        // ## Arrange ##
        WhiteQuotedCB cb = new WhiteQuotedCB();

        // ## Act ##
        ListResultBean<WhiteQuoted> quotedList = whiteQuotedBhv.selectList(cb); // expect no exception

        // ## Assert ##
        assertNotSame(0, quotedList.size());
        for (WhiteQuoted quoted : quotedList) {
            assertNotNull(quoted.getSelect());
            assertNotNull(quoted.getFrom());
        }
        String sql = cb.toDisplaySql();
        WhiteQuotedDbm dbm = WhiteQuotedDbm.getInstance();
        assertTrue(sql.contains(dbm.getTableSqlName().toString()));
        assertTrue(sql.contains(dbm.columnSelect().getColumnSqlName().toString()));
        assertTrue(sql.contains(dbm.columnFrom().getColumnSqlName().toString()));
    }

    public void test_Quote_CB_SpecifyColumn() throws Exception {
        // ## Arrange ##
        WhiteQuotedCB cb = new WhiteQuotedCB();
        cb.specify().columnSelect();

        // ## Act ##
        ListResultBean<WhiteQuoted> quotedList = whiteQuotedBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, quotedList.size());
        for (WhiteQuoted quoted : quotedList) {
            assertNotNull(quoted.getSelect());
            assertNull(quoted.xznocheckGetFrom());
            assertNonSpecifiedAccess(() -> quoted.getFrom());
        }
    }

    public void test_Quote_CB_with_relation() throws Exception {
        // ## Arrange ##
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
        cb.setupSelect_WhiteQuoted();
        cb.query().queryWhiteQuoted().existsWhiteQuotedRef(subCB -> {});

        // ## Act ##
        ListResultBean<WhiteQuotedRef> refList = whiteQuotedRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        for (WhiteQuotedRef ref : refList) {
            assertNotNull(ref.getWhiteQuoted());
        }
        String sql = cb.toDisplaySql();
        String mainSqlName = WhiteQuotedDbm.getInstance().getTableSqlName().toString();
        String refSqlName = WhiteQuotedRefDbm.getInstance().getTableSqlName().toString();
        assertTrue(sql.contains(mainSqlName));
        assertTrue(sql.contains(refSqlName));
        String mainDbName = WhiteQuotedDbm.getInstance().getTableDbName().toString();
        String refDbName = WhiteQuotedRefDbm.getInstance().getTableDbName().toString();
        assertFalse(sql.contains(" " + mainDbName));
        assertFalse(sql.contains(" " + refDbName));
    }

    public void test_Quote_ColumnQuery() throws Exception {
        // ## Arrange ##
        int countAll = whiteQuotedRefBhv.selectCount(new WhiteQuotedRefCB());
        WhiteQuotedRefCB cb = new WhiteQuotedRefCB();
        cb.columnQuery(new SpecifyQuery<WhiteQuotedRefCB>() {
            public void specify(WhiteQuotedRefCB cb) {
                cb.specify().columnOrder();
            }
        }).equal(new SpecifyQuery<WhiteQuotedRefCB>() {
            public void specify(WhiteQuotedRefCB cb) {
                cb.specify().columnOrder();
            }
        });

        // ## Act ##
        ListResultBean<WhiteQuotedRef> refList = whiteQuotedRefBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, refList.size());
        assertEquals(countAll, refList.size());
        String sql = cb.toDisplaySql();
        assertTrue(sql.contains("dfloc.`ORDER` = dfloc.`ORDER`"));
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    public void test_Quote_update() throws Exception {
        // ## Assert ##
        WhiteQuotedCB cb = new WhiteQuotedCB();
        cb.fetchFirst(1);
        WhiteQuoted quoted = whiteQuotedBhv.selectEntityWithDeletedCheck(cb);
        quoted.setFrom("updated");

        // ## Act ##
        whiteQuotedBhv.update(quoted);

        // ## Assert ##
        whiteQuotedBhv.selectByPK(quoted.getSelect()).alwaysPresent(actual -> {
            assertEquals(quoted.getFrom(), actual.getFrom());
        });
    }

    // ===================================================================================
    //                                                                       ReplaceSchema
    //                                                                       =============
    public void test_Quote_ReplaceSchema_LoadData() throws Exception {
        // ## Arrange ##
        WhiteQuotedCB cb = new WhiteQuotedCB();

        // ## Act ##
        ListResultBean<WhiteQuoted> quotedList = whiteQuotedBhv.selectList(cb);

        // ## Assert ##
        assertNotSame(0, quotedList.size());
        boolean existsTsv = false;
        boolean existsXls = false;
        for (WhiteQuoted quoted : quotedList) {
            if (quoted.getFrom().equals("foo from tsv")) {
                existsTsv = true;
            } else if (quoted.getFrom().equals("foo from xls")) {
                existsXls = true;
            }
        }
        assertTrue(existsTsv);
        assertTrue(existsXls);
    }
}
