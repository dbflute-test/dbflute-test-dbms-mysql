/*
 * Copyright 2004-2013 the Seasar Foundation and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.docksidestage.mysql.dbflute.immuhama.allcommon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.dbflute.dbway.DBDef;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ImmuDBCurrent {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ImmuDBCurrent.class);

    /** Singleton instance. */
    private static final ImmuDBCurrent _instance = new ImmuDBCurrent();

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final String _projectName = "immuhamadb";
    protected final String _projectPrefix = "Immu";
    protected final String _generationGapBasePrefix = "Bs";

    protected DBDef _currentDBDef;
    {
        _currentDBDef = DBDef.of("mysql").orElse(DBDef.Unknown);
    }

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Only for singleton.
     */
    private ImmuDBCurrent() {
    }

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    /**
     * Get the saved singleton instance.
     * @return always same instance. (NotNull)
     */
    public static ImmuDBCurrent getInstance() {
        return _instance;
    }

    // ===================================================================================
    //                                                                        Project Name
    //                                                                        ============
    /**
     * Get project name of the database (DBFlute client).
     * @return The name string, lower case in many cases. e.g. maihamadb (NotNull)
     */
    public String projectName() {
        return _projectName;
    }

    /**
     * Get project prefix of the database, used as class name. (normally empty)
     * Normally empty string, only when prejextPrefix is set in basicInfoMap.dfprop.
     * @return The prefix string, camel case in many cases. e.g. Resola (ResolaStationCB) (NotNull, EmptyAllowed)
     */
    public String projectPrefix() {
        return _projectPrefix;
    }

    /**
     * Get base prefix of the database for generation gap. (normally 'Bs')
     * @return The prefix string, camel case in many cases. e.g. Bs (BsMemberCB) (NotNull, EmptyAllowed)
     */
    public String generationGapBasePrefix() {
        return _generationGapBasePrefix;
    }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public void initializeCurrentDBDef(DBDef currentDBDef) {
        if (_log.isInfoEnabled()) {
            _log.info("...Setting currentDBDef: " + currentDBDef);
        }
        if (currentDBDef == null) {
            String msg = "The argument 'currentDBDef' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        _currentDBDef = currentDBDef;
    }

    /**
     * Get current DB definition saved in this object.
     * @return The object of DB definition. (NotNull)
     */
    public DBDef currentDBDef() {
        return _currentDBDef;
    }

    /**
     * Is the current DB specified DB?
     * @param currentDBDef The DB definition of current DB. (NullAllowed: if null, returns false)
     * @return The determination, true or false.
     */
    public boolean isCurrentDBDef(DBDef currentDBDef) {
        return _currentDBDef.equals(currentDBDef);
    }
}
