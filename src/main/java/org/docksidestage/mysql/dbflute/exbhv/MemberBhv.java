/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exbhv;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dbflute.bhv.core.BehaviorCommand;
import org.dbflute.bhv.core.command.BatchUpdateNonstrictCommand;
import org.dbflute.bhv.core.command.SelectListCBCommand;
import org.dbflute.bhv.core.execution.SelectCBExecution;
import org.dbflute.hook.SqlLogInfo.SqlLogDisplaySqlBuilder;
import org.dbflute.s2dao.jdbc.TnResultSetHandler;
import org.dbflute.s2dao.metadata.TnPropertyType;
import org.dbflute.s2dao.sqlcommand.TnBatchUpdateDynamicCommand;
import org.dbflute.s2dao.sqlhandler.TnBasicParameterHandler;
import org.dbflute.s2dao.sqlhandler.TnBasicSelectHandler;
import org.dbflute.s2dao.sqlhandler.TnBatchUpdateHandler;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursor;
import org.docksidestage.mysql.dbflute.exbhv.cursor.PurchaseSummaryMemberCursorHandler;
import org.docksidestage.mysql.dbflute.exbhv.pmbean.PurchaseSummaryMemberPmb;
import org.docksidestage.mysql.dbflute.exentity.Member;

/**
 * The behavior of member. <br>
 * You can implement your original methods here. <br>
 * This class is NOT overridden when re-generating. <br>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class MemberBhv extends org.docksidestage.mysql.dbflute.bsbhv.BsMemberBhv {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** Log instance for sub class. */
    private static final Log _log = LogFactory.getLog(MemberBhv.class);

    // ===================================================================================
    //                                                                          CSV Output
    //                                                                          ==========
    /**
     * 会員の購入数の集計CSVを作成する。<br>
     * 大量件数になる可能性があるため、カーソルフェッチで実現している。<br>
     * 「現場ソリューション DBFlute」における「大量件数」の例題。<br>
     * @param pmb The parameter bean of Purchase Summary Member. (NotNull)
     */
    public void makeCsvPurchaseSummaryMember(PurchaseSummaryMemberPmb pmb) {
        final PurchaseSummaryMemberCursorHandler handler = new PurchaseSummaryMemberCursorHandler() {
            public Object fetchCursor(PurchaseSummaryMemberCursor cursor) throws SQLException {
                while (cursor.next()) {
                    final Integer memberId = cursor.getMemberId();
                    final String memberName = cursor.getMemberName();
                    final LocalDate birthdate = cursor.getBirthdate();
                    final LocalDateTime formalizedDatetime = cursor.getFormalizedDatetime();
                    final Long purchaseSummary = cursor.getPurchaseSummary();

                    // ここではただログに出力するだけ
                    // (本当はCSVファイルへの出力)
                    final String c = ", ";
                    _log.debug(memberId + c + memberName + c + birthdate + c + formalizedDatetime + c + purchaseSummary);

                } // ResultSetのCloseはFrameworkが行うので必要なし
                return null;// ここで処理が完結してるので戻り値は不要
            }
        };
        outsideSql().selectCursor(pmb, handler);
    }

    // ===================================================================================
    //                                                                       Internal Info
    //                                                                       =============
    protected ConcurrentHashMap<String, Object> _loggingMarkMap = new ConcurrentHashMap<String, Object>();
    protected ConcurrentHashMap<String, Integer> _fetchSizeMap = new ConcurrentHashMap<String, Integer>();
    protected ConcurrentHashMap<String, Class<?>> _rowDataClassMap = new ConcurrentHashMap<String, Class<?>>();
    protected Integer _latestFetchSize = null;

    public boolean contains_doLogSql() {
        return _loggingMarkMap.containsKey("doLogSql");
    }

    public boolean contains_buildDisplaySql() {
        return _loggingMarkMap.containsKey("buildDisplaySql");
    }

    public boolean contains_createSqlLogDisplaySqlBuilder() {
        return _loggingMarkMap.containsKey("createSqlLogDisplaySqlBuilder");
    }

    public ConcurrentHashMap<String, Integer> getFetchSizeMap() {
        return _fetchSizeMap;
    }

    public ConcurrentHashMap<String, Class<?>> getRowDataClassMap() {
        return _rowDataClassMap;
    }

    @Override
    protected <RESULT> RESULT invoke(BehaviorCommand<RESULT> behaviorCommand) {
        _loggingMarkMap.clear();
        return super.invoke(behaviorCommand);
    }

    @Override
    protected <RESULT extends Member> SelectListCBCommand<RESULT> newSelectListCBCommand() {
        return new SelectListCBCommand<RESULT>() {
            @Override
            protected SelectCBExecution newSelectCBExecution(Map<String, Class<?>> argNameTypeMap, TnResultSetHandler handler) {
                return new SelectCBExecution(_dataSource, _statementFactory, argNameTypeMap, handler) {
                    @Override
                    protected TnBasicParameterHandler newBasicParameterHandler(String executedSql) {
                        return new TnBasicSelectHandler(_dataSource, executedSql, _resultSetHandler, _statementFactory) {
                            @Override
                            protected void doLogSql(Object[] args, Class<?>[] argTypes, boolean logEnabled, boolean sqlFireHook,
                                    boolean hasSqlLog, boolean hasSqlResult) {
                                _loggingMarkMap.put("doLogSql", logEnabled + ", " + sqlFireHook + ", " + hasSqlLog + ", " + hasSqlResult);
                                super.doLogSql(args, argTypes, logEnabled, sqlFireHook, hasSqlLog, hasSqlResult);
                            };

                            @Override
                            protected String buildDisplaySql(String sql, Object[] args) {
                                _loggingMarkMap.put("buildDisplaySql", args);
                                return super.buildDisplaySql(sql, args);
                            }

                            @Override
                            protected SqlLogDisplaySqlBuilder createSqlLogDisplaySqlBuilder(String alreadyBuiltDisplaySql) {
                                _loggingMarkMap.put("createSqlLogDisplaySqlBuilder", new Object());
                                return super.createSqlLogDisplaySqlBuilder(alreadyBuiltDisplaySql);
                            }

                            @Override
                            protected PreparedStatement prepareStatement(Connection conn) {
                                PreparedStatement ps = super.prepareStatement(conn);
                                try {
                                    _fetchSizeMap.put("selectList", ps.getFetchSize());
                                } catch (SQLException e) {
                                    throw new IllegalStateException(e);
                                }
                                return ps;
                            }

                            @Override
                            protected ResultSet executeQuery(PreparedStatement ps) throws SQLException {
                                ResultSet rs = super.executeQuery(ps);
                                com.mysql.cj.protocol.ResultsetRows rowData =
                                        extractRowDataOnResutSet((com.mysql.cj.jdbc.result.ResultSetImpl) rs);
                                _rowDataClassMap.put("selectList", rowData.getClass());
                                return rs;
                            }
                        };
                    }
                };
            }
        };
    }

    @Override
    protected BatchUpdateNonstrictCommand newBatchUpdateNonstrictCommand() {
        return new BatchUpdateNonstrictCommand() {
            @Override
            protected TnBatchUpdateDynamicCommand newBatchUpdateDynamicCommand() {
                return new TnBatchUpdateDynamicCommand(_dataSource, _statementFactory) {
                    @Override
                    protected TnBatchUpdateHandler newBatchUpdateHandler(TnPropertyType[] boundPropTypes, String sql) {
                        return new TnBatchUpdateHandler(_dataSource, _statementFactory, sql, _beanMetaData, boundPropTypes) {
                            @Override
                            protected void doLogSql(Object[] args, Class<?>[] argTypes, boolean logEnabled, boolean sqlFireHook,
                                    boolean hasSqlLog, boolean hasSqlResult) {
                                _loggingMarkMap.put("doLogSql", logEnabled + ", " + sqlFireHook + ", " + hasSqlLog + ", " + hasSqlResult);
                                super.doLogSql(args, argTypes, logEnabled, sqlFireHook, hasSqlLog, hasSqlResult);
                            };

                            @Override
                            protected String buildDisplaySql(String sql, Object[] args) {
                                _loggingMarkMap.put("buildDisplaySql", args);
                                return super.buildDisplaySql(sql, args);
                            }

                            @Override
                            protected SqlLogDisplaySqlBuilder createSqlLogDisplaySqlBuilder(String alreadyBuiltDisplaySql) {
                                _loggingMarkMap.put("createSqlLogDisplaySqlBuilder", new Object());
                                return super.createSqlLogDisplaySqlBuilder(alreadyBuiltDisplaySql);
                            }
                        };
                    }
                };
            }
        };
    }

    // ===================================================================================
    //                                                                   Reflection Helper
    //                                                                   =================
    protected com.mysql.cj.protocol.ResultsetRows extractRowDataOnResutSet(com.mysql.cj.jdbc.result.ResultSetImpl rsImpl) {
        Field rowDataField = DfReflectionUtil.getWholeField(com.mysql.cj.jdbc.result.ResultSetImpl.class, "rowData");
        return (com.mysql.cj.protocol.ResultsetRows) DfReflectionUtil.getValueForcedly(rowDataField, rsImpl);
    }

    protected List<?> extractRowsOnRowData(com.mysql.cj.protocol.ResultsetRows rowData) {
        Field rowsField = DfReflectionUtil.getWholeField(com.mysql.cj.protocol.a.result.ResultsetRowsStatic.class, "rows");
        return (List<?>) DfReflectionUtil.getValueForcedly(rowsField, rowData);
    }
}
