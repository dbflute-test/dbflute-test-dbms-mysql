package org.docksidestage.mysql.dbflute.thematic;

import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.util.DfReflectionUtil;
import org.dbflute.util.DfReflectionUtil.ReflectionFailureException;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.NextSchemaProductDbm;
import org.docksidestage.mysql.dbflute.exbhv.NextSchemaProductBhv;
import org.docksidestage.mysql.dbflute.exentity.NextSchemaProduct;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class AdditionalSchemaTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private NextSchemaProductBhv nextSchemaProductBhv;

    // ===================================================================================
    //                                                                               Basic
    //                                                                               =====
    public void test_insert_select() throws Exception {
        // ## Arrange ##
        NextSchemaProduct nextSchemaProduct = new NextSchemaProduct();
        nextSchemaProduct.setProductName("TEST");

        // because of isSuppressCommonColumn = true in additionalSchemaMap
        nextSchemaProduct.setRegisterDatetime(getAccessContext().getAccessLocalDateTime());
        nextSchemaProduct.setRegisterUser(getAccessContext().getAccessUser());
        nextSchemaProduct.setRegisterProcess(getAccessContext().getAccessProcess());
        nextSchemaProduct.setUpdateDatetime(getAccessContext().getAccessLocalDateTime());
        nextSchemaProduct.setUpdateUser(getAccessContext().getAccessUser());
        nextSchemaProduct.setUpdateProcess(getAccessContext().getAccessProcess());

        // ## Act ##
        nextSchemaProductBhv.insert(nextSchemaProduct);

        // ## Assert ##
        NextSchemaProduct actual = nextSchemaProductBhv.selectEntityWithDeletedCheck(cb -> {
            cb.query().setProductId_Equal(nextSchemaProduct.getProductId());
            cb.query().setProductName_Equal("TEST");
        });
        assertEquals("TEST", actual.getProductName());
    }

    // ===================================================================================
    //                                                                              DBMeta
    //                                                                              ======
    public void test_DBMeta_tableSqlName_with_schema() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act & Assert ##
        log("name=" + dbm.getTableSqlName());
        assertNotNull(dbm.getTableSqlName());
        assertTrue(dbm.getTableSqlName().toString().contains("."));
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains(".")); // compare
        assertEquals("newurayasudb." + dbm.getTableDbName().toUpperCase(), dbm.getTableSqlName().toString());
    }

    public void test_DBMeta_columnExcept() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act ##
        try {
            ColumnInfo columnInfo = dbm.findColumnInfo("COLUMN_EXCEPT_TEST");

            // ## Assert ##
            fail(columnInfo.toString());
        } catch (RuntimeException e) {
            // OK
            log(e.getMessage());
        }
    }

    public void test_DBMeta_commonColumn_suppressed() throws Exception {
        // ## Arrange ##
        NextSchemaProductDbm dbm = NextSchemaProductDbm.getInstance();

        // ## Act & Assert ##
        assertFalse(dbm.hasCommonColumn()); // because isSuppressCommonColumn = true
    }

    // ===================================================================================
    //                                                                           Procedure
    //                                                                           =========
    public void test_Procedure_suppressed() throws Exception {
        // ## Arrange ##
        String name = "com.example.dbflute.mysql.dbflute.exbhv.pmbean.SpNextNoParameterPmb";

        // ## Act ##
        try {
            Class<?> clazz = DfReflectionUtil.forName(name);

            // ## Assert ##
            fail("found = " + clazz);
        } catch (ReflectionFailureException e) {
            // OK
            log(e.getMessage());
        }
    }
}
