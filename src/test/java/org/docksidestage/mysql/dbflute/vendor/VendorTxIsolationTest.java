/*
 * Copyright 2015-2021 the original author or authors.
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
package org.docksidestage.mysql.dbflute.vendor;

import javax.annotation.Resource;

import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.transaction.TransactionResource;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since DBFlute-1.2.5 (2021/11/17 Wednesday)
 */
public class VendorTxIsolationTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private MemberBhv memberBhv;

    // ===================================================================================
    //                                                                      Table Snapshot
    //                                                                      ==============
    public void test_RepeatableRead_tableSnapshot() {
        Member beforeFirst = memberBhv.selectByPK(1).get();
        Member beforeNinth = memberBhv.selectByPK(9).get();
        log(beforeFirst);
        log(beforeNinth);
        assertNotSame("sea", beforeNinth.getMemberName());
        try {
            cannonball(car -> {
                adjustTransactionIsolationLevel_RepeatableRead();

                car.projectA(dragon -> {
                    Member member = memberBhv.selectByPK(1).get();
                    log(member.getMemberName());
                }, 1);
                car.projectA(dragon -> {
                    TransactionResource resource = xgetTestCaseTransactionResource();
                    Member member = new Member();
                    member.setMemberId(9);
                    member.setMemberName("sea");
                    memberBhv.updateNonstrict(member);
                    commitTransaction(resource);
                }, 2);

                car.projectA(dragon -> {
                    // table snapshot so old data selected
                    Member member = memberBhv.selectByPK(9).get();
                    log(member.getMemberName());
                    log("first ninth: {}", member.getMemberName());
                    assertEquals(beforeNinth.getMemberName(), member.getMemberName());
                }, 1);
                car.projectA(dragon -> {
                    // no snapshot so new data selected
                    Member member = memberBhv.selectByPK(9).get();
                    log("third ninth: {}", member.getMemberName());
                    assertEquals("sea", member.getMemberName());
                }, 3);
            }, new CannonballOption().threadCount(3));
        } finally { // rollback
            performNewTransaction(() -> {
                Member member = memberBhv.selectByPK(9).get();
                member.setMemberName(beforeNinth.getMemberName());
                memberBhv.updateNonstrict(member);
                return true; // commit
            });
        }
    }
}
