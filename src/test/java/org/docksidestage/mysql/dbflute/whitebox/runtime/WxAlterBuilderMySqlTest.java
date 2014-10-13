package org.docksidestage.mysql.dbflute.whitebox.runtime;

import org.dbflute.dbmeta.alter.AlterGeneratorMySql;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.dbflute.utflute.core.PlainTestCase;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberDbm;

/**
 * @author jflute
 */
public class WxAlterBuilderMySqlTest extends PlainTestCase {

    public void test_buildColumnNameChange() throws Exception {
        // ## Arrange ##
        AlterGeneratorMySql builder = new AlterGeneratorMySql();

        // ## Act ##
        ColumnInfo memberAccount = MemberDbm.getInstance().columnMemberAccount();
        String alter = builder.generateColumnRename("TOMBER_ACCOUNT", memberAccount);

        // ## Assert ##
        log(alter);
    }
}
