/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.exentity;

import java.sql.Timestamp;

import org.docksidestage.mysql.dbflute.bsentity.BsSummaryWithdrawal;

/**
 * The entity of summary_withdrawal.
 * <p>
 * You can implement your original methods here.
 * This class remains when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 * @author jflute
 */
public class SummaryWithdrawal extends BsSummaryWithdrawal {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                             for test: Non-Specified
    //                                                             =======================
    public String xznocheckGetMemberStatusCode() {
        return _memberStatusCode;
    }

    public Timestamp xznocheckGetWithdrawalDatetime() {
        return _withdrawalDatetime;
    }
}
