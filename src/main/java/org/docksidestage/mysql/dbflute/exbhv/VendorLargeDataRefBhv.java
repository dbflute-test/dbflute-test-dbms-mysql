/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exbhv;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dbflute.bhv.core.BehaviorCommand;
import org.dbflute.bhv.core.command.SelectEntityCBCommand;
import org.dbflute.bhv.core.command.SelectListCBCommand;
import org.dbflute.bhv.core.execution.SelectCBExecution;
import org.dbflute.hook.SqlLogInfo.SqlLogDisplaySqlBuilder;
import org.dbflute.s2dao.jdbc.TnResultSetHandler;
import org.dbflute.s2dao.sqlhandler.TnBasicParameterHandler;
import org.dbflute.s2dao.sqlhandler.TnBasicSelectHandler;
import org.dbflute.util.DfReflectionUtil;
import org.docksidestage.mysql.dbflute.bsbhv.BsVendorLargeDataRefBhv;
import org.docksidestage.mysql.dbflute.exentity.VendorLargeDataRef;

/**
 * The behavior of vendor_large_data_ref.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class VendorLargeDataRefBhv extends BsVendorLargeDataRefBhv {

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
    protected <RESULT extends VendorLargeDataRef> SelectEntityCBCommand<RESULT> newSelectEntityCBCommand() {
        return new SelectEntityCBCommand<RESULT>() {
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
                                    _fetchSizeMap.put("selectEntity", ps.getFetchSize());
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
                                _rowDataClassMap.put("selectEntity", rowData.getClass());
                                return rs;
                            }
                        };
                    }
                };
            }
        };
    }

    @Override
    protected <RESULT extends VendorLargeDataRef> SelectListCBCommand<RESULT> newSelectListCBCommand() {
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
