package org.docksidestage.mysql.dbflute.whitebox.dicontainer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.sql.DataSource;

import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteInitializer;
import org.docksidestage.mysql.dbflute.cbean.MemberCB;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.unit.UnitContainerTestCase;
import org.seasar.extension.jdbc.SqlLog;
import org.seasar.extension.jdbc.SqlLogRegistry;
import org.seasar.extension.jdbc.SqlLogRegistryLocator;
import org.seasar.extension.jdbc.impl.SqlLogRegistryImpl;

/**
 * @author jflute
 * @since 0.9.5 (2009/04/08 Wednesday)
 */
public class WxS2ContainerBasicTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                  DBFluteInitializer
    //                                                                  ==================
    public void test_DBFluteInitializer_initializing() {
        // ## Arrange ##
        final Set<String> markSet = new HashSet<String>();
        final DBFluteConfig config = DBFluteConfig.getInstance();
        config.unlock();

        // ## Act ##
        new DBFluteInitializer() {
            @Override
            protected void loadCoolClasses() {
                markSet.add("loadCoolClasses");
                super.loadCoolClasses();
            }
        };

        // ## Assert ##
        assertTrue(config.isLocked());
        assertTrue(markSet.contains("loadCoolClasses"));
    }

    // ===================================================================================
    //                                                                       SqlLogRegistr
    //                                                                       =============
    public void test_SqlLogRegistry_HowToUse() {
        { // Confirm default setting at first
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
        }
        { // Initialize
            SqlLogRegistryLocator.setInstance(new SqlLogRegistryImpl());
        }
        { // Nothing before executing SQL
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNull(lastSqlLog);
        }
        { // Execute SQL
            final MemberCB cb = new MemberCB();
            cb.query().setMemberName_LikeSearch("Sto", op -> op.likePrefix());
            memberBhv.selectList(cb);
        }
        { // Get sqlLog after executing SQL
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNull(lastSqlLog);
        }
        {// Execute SQL again
            final MemberCB cb = new MemberCB();
            cb.query().setMemberId_GreaterEqual(123);
            cb.query().addOrderBy_Birthdate_Desc();
            cb.paging(3, 2);
            memberBhv.selectList(cb);
        }
        { // Get sqlLog again
            final SqlLogRegistry sqlLogRegistry = SqlLogRegistryLocator.getInstance();
            assertNotNull(sqlLogRegistry);
            final SqlLog lastSqlLog = sqlLogRegistry.getLast();
            assertNull(lastSqlLog);
        }
    }

    // ===================================================================================
    //                                                                          DataSource
    //                                                                          ==========
    public void test_DataSource_Connection_always_close() throws SQLException {
        Connection conn = null;
        DataSource dataSource = getDataSource();

        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from `MEMBER`");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("update `MEMBER` set MEMBER_NAME = ? where MEMBER_ID = 3");
            ps.setString(1, "aaa");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
        conn = dataSource.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from `MEMBER`");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
    }

    public void test_DataSource_same_Connection() throws SQLException {
        Connection conn = null;
        DataSource dataSource = getDataSource();

        conn = dataSource.getConnection();
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("select * from `MEMBER`");
            ps.execute();
            ps.close();
            ps = conn.prepareStatement("update `MEMBER` set MEMBER_NAME = ? where MEMBER_ID = 3");
            ps.setString(1, "aaa");
            ps.execute();
            ps.close();
            ps = conn.prepareStatement("select * from `MEMBER`");
            ps.execute();
            ps.close();
        } finally {
            conn.close();
        }
    }
}
