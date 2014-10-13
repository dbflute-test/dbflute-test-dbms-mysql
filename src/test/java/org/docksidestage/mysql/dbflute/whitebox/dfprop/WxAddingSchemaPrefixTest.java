package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberDbm;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.SpNoParameterPmb;

/**
 * @author jflute
 * @since 0.9.6.8 (2010/04/18 Sunday)
 */
public class WxAddingSchemaPrefixTest extends PlainTestCase {

    public void test_table() {
        assertFalse(MemberDbm.getInstance().getTableSqlName().toString().contains("."));
    }

    public void test_procedure() {
        assertFalse(new SpNoParameterPmb().getProcedureName().contains("."));
    }
}