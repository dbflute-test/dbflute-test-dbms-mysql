/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package org.docksidestage.mysql.dbflute.cbean.cq;


import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.docksidestage.mysql.dbflute.cbean.cq.bs.BsMemberAddressCQ;

/**
 * The condition-query of member_address.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class MemberAddressCQ extends BsMemberAddressCQ {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor.
     * @param childQuery Child query as abstract class. (Nullable: If null, this is base instance.)
     * @param sqlClause SQL clause instance. (NotNull)
     * @param aliasName My alias name. (NotNull)
     * @param nestLevel Nest level.
     */
    public MemberAddressCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(childQuery, sqlClause, aliasName, nestLevel);
    }
	
    // ===================================================================================
    //                                                                      Arrange Method
    //                                                                      ==============
	// You can make original arrange query methods here.
	// public void arranegeXxx() {
	//     ...
	// }
}
