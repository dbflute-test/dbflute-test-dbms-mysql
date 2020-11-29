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

import org.dbflute.Entity;
import org.dbflute.hook.CommonColumnAutoSetupper;

/**
 * The basic implementation of the auto set-upper of common column.
 * @author DBFlute(AutoGenerator)
 */
public class ImmuImplementedCommonColumnAutoSetupper implements CommonColumnAutoSetupper {

    // =====================================================================================
    //                                                                            Definition
    //                                                                            ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ImmuImplementedCommonColumnAutoSetupper.class);

    // =====================================================================================
    //                                                                             Attribute
    //                                                                             =========
    // =====================================================================================
    //                                                                                Set up
    //                                                                                ======
    /** {@inheritDoc} */
    public void handleCommonColumnOfInsertIfNeeds(Entity targetEntity) {
        final ImmuEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "INSERT");
        }
        doHandleCommonColumnOfInsertIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfInsertIfNeeds(ImmuEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime registerDatetime = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setRegisterDatetime(registerDatetime);
        final String registerUser = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setRegisterUser(registerUser);
        final java.time.LocalDateTime updateDatetime = entity.getRegisterDatetime();
        entity.setUpdateDatetime(updateDatetime);
        final String updateUser = entity.getRegisterUser();
        entity.setUpdateUser(updateUser);
    }

    /** {@inheritDoc} */
    public void handleCommonColumnOfUpdateIfNeeds(Entity targetEntity) {
        final ImmuEntityDefinedCommonColumn entity = askIfEntitySetup(targetEntity);
        if (entity == null) {
            return;
        }
        if (isInternalDebugEnabled()) {
            logSettingUp(entity, "UPDATE");
        }
        doHandleCommonColumnOfUpdateIfNeeds(entity);
    }

    protected void doHandleCommonColumnOfUpdateIfNeeds(ImmuEntityDefinedCommonColumn entity) {
        final java.time.LocalDateTime updateDatetime = org.dbflute.hook.AccessContext.getAccessLocalDateTimeOnThread();
        entity.setUpdateDatetime(updateDatetime);
        final String updateUser = org.dbflute.hook.AccessContext.getAccessUserOnThread();
        entity.setUpdateUser(updateUser);
    }

    // =====================================================================================
    //                                                                         Assist Helper
    //                                                                         =============
    protected ImmuEntityDefinedCommonColumn askIfEntitySetup(Entity targetEntity) {
        if (!hasCommonColumn(targetEntity)) {
            return null;
        }
        return downcastEntity(targetEntity);
    }

    protected boolean hasCommonColumn(Entity targetEntity) {
        return targetEntity instanceof ImmuEntityDefinedCommonColumn;
    }

    protected ImmuEntityDefinedCommonColumn downcastEntity(Entity targetEntity) {
        return (ImmuEntityDefinedCommonColumn)targetEntity;
    }

    // =====================================================================================
    //                                                                               Logging
    //                                                                               =======
    protected boolean isInternalDebugEnabled() {
        return ImmuDBFluteConfig.getInstance().isInternalDebug() && _log.isDebugEnabled();
    }

    protected void logSettingUp(ImmuEntityDefinedCommonColumn entity, String keyword) {
        _log.debug("...Setting up column columns of " + entity.asTableDbName() + " before " + keyword);
    }
}
