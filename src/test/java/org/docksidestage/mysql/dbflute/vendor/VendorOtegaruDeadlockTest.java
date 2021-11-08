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

import org.dbflute.exception.EntityAlreadyDeletedException;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.docksidestage.mysql.dbflute.allcommon.DBFluteConfig;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.MemberLoginBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since DBFlute-1.2.5 (2021/11/08 Monday at roppongi japanese)
 */
public class VendorOtegaruDeadlockTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    @Resource
    private MemberBhv memberBhv;
    @Resource
    private MemberLoginBhv loginBhv;

    private Boolean originalQueryUpdateCountPreCheck;

    // ===================================================================================
    //                                                                          Initialize
    //                                                                          ==========
    @Override
    public void setUp() throws Exception {
        super.setUp();
        originalQueryUpdateCountPreCheck = DBFluteConfig.getInstance().isQueryUpdateCountPreCheck();
        DBFluteConfig.getInstance().unlock();
        DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(false);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        if (originalQueryUpdateCountPreCheck != null) {
            DBFluteConfig.getInstance().unlock();
            DBFluteConfig.getInstance().setQueryUpdateCountPreCheck(originalQueryUpdateCountPreCheck);
        }
    }

    // ===================================================================================
    //                                                                        Delete Empty
    //                                                                        ============
    public void test_queryDeleteEmpty_insert_byManyThread() { // standard pattern
        Member source = memberBhv.selectByPK(3).get();
        cannonball(car -> {
            adjustTransactionIsolationLevel_RepeatableRead();
            int entryNumber = car.getEntryNumber();

            // empty delete (update, for update) locks new record
            // (if it deletes existing records, second waits)
            memberBhv.queryDelete(cb -> {
                cb.query().setMemberId_Equal(99999);
            });
            car.restart();

            Member inserted = source.clone();
            inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
            memberBhv.insert(inserted); // deadlock here
        }, new CannonballOption().threadCount(5).expectExceptionAny("Deadlock found"));
    }

    public void test_queryDeleteEmpty_insert_byTwoThread() { // standard pattern
        Member source = memberBhv.selectByPK(3).get();
        cannonball(car -> {
            adjustTransactionIsolationLevel_RepeatableRead();
            int entryNumber = car.getEntryNumber();
            int memberId = 99999;

            car.projectA(dragon -> {
                memberBhv.queryDelete(cb -> {
                    cb.query().setMemberId_Equal(memberId);
                });
            }, 1);
            car.projectA(dragon -> {
                memberBhv.queryDelete(cb -> {
                    cb.query().setMemberId_Equal(memberId); // same key
                });
            }, 2);

            car.projectA(dragon -> {
                Member inserted = source.clone();
                inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
                memberBhv.insert(inserted);
            }, 1);
            car.projectA(dragon -> {
                Member inserted = source.clone();
                inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
                memberBhv.insert(inserted); // deadlock here
            }, 2);
        }, new CannonballOption().threadCount(2).expectExceptionAny("Deadlock found"));
    }

    // ===================================================================================
    //                                                                        Update Empty
    //                                                                        ============
    // -----------------------------------------------------
    //                                                 by PK
    //                                                 -----
    public void test_insertOrUpdateNonstrict_updateEmptyByPK_insert() {
        cannonball(car -> {
            adjustTransactionIsolationLevel_RepeatableRead();
            Member memberFirst = memberBhv.selectByPK(1).get();
            memberFirst.setMemberId(99991);
            memberFirst.setMemberAccount("first");
            Member memberSecond = memberBhv.selectByPK(2).get();
            memberSecond.setMemberId(99992);
            memberSecond.setMemberAccount("second");

            // needs to cross processes for deadlock
            car.projectA(dragon -> {
                try {
                    memberBhv.updateNonstrict(memberFirst);
                } catch (EntityAlreadyDeletedException continued) {
                    log(continued.getMessage());
                }
            }, 1);
            car.projectA(dragon -> {
                try {
                    memberBhv.updateNonstrict(memberSecond);
                } catch (EntityAlreadyDeletedException continued) {
                    log(continued.getMessage());
                }
            }, 2);
            car.projectA(dragon -> {
                memberBhv.insert(memberFirst);
            }, 1);
            car.projectA(dragon -> {
                memberBhv.insert(memberSecond); // deadlock here
            }, 2);
        }, new CannonballOption().threadCount(2).expectExceptionAny("Deadlock found"));
    }

    // -----------------------------------------------------
    //                                             Unique By
    //                                             ---------
    public void test_insertOrUpdateNonstrict_updateEmptyUniqueBy_insert() {
        cannonball(car -> {
            adjustTransactionIsolationLevel_RepeatableRead();
            Member memberFirst = memberBhv.selectByPK(1).get();
            memberFirst.setMemberId(null);
            memberFirst.uniqueBy("first");
            Member memberSecond = memberBhv.selectByPK(2).get();
            memberSecond.setMemberId(null);
            memberSecond.uniqueBy("first"); // deadlock if same key

            // needs to cross processes for deadlock
            car.projectA(dragon -> {
                try {
                    memberBhv.updateNonstrict(memberFirst);
                } catch (EntityAlreadyDeletedException continued) {
                    log(continued.getMessage());
                }
            }, 1);
            car.projectA(dragon -> {
                try {
                    memberBhv.updateNonstrict(memberSecond);
                } catch (EntityAlreadyDeletedException continued) {
                    log(continued.getMessage());
                }
            }, 2);
            car.projectA(dragon -> {
                memberBhv.insert(memberFirst);
            }, 1);
            car.projectA(dragon -> {
                memberBhv.insert(memberSecond); // deadlock here
            }, 2);
        }, new CannonballOption().threadCount(2).expectExceptionAny("Deadlock found"));
    }

    // ===================================================================================
    //                                                          Solution by Read Committed
    //                                                          ==========================
    public void test_queryDeleteEmpty_insert_solutionByReadCommitted() { // standard pattern
        Member source = memberBhv.selectByPK(3).get();
        cannonball(car -> {
            adjustTransactionIsolationLevel_ReadCommitted();
            int entryNumber = car.getEntryNumber();

            // empty delete (update, for update) locks new record
            // (if it deletes existing records, second waits)
            memberBhv.queryDelete(cb -> {
                cb.query().setMemberId_Equal(99999);
            });
            car.restart();

            Member inserted = source.clone();
            inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
            memberBhv.insert(inserted);
        }, new CannonballOption().threadCount(5));
    }

    // ===================================================================================
    //                                                                Solution by PreCheck
    //                                                                ====================
    public void test_queryDeleteEmpty_insert_solutionByPreCheck() { // standard pattern
        Member source = memberBhv.selectByPK(3).get();
        cannonball(car -> {
            adjustTransactionIsolationLevel_RepeatableRead();
            int entryNumber = car.getEntryNumber();

            // empty delete (update, for update) locks new record
            // (if it deletes existing records, second waits)
            memberBhv.queryDelete(cb -> {
                cb.enableQueryUpdateCountPreCheck();
                cb.query().setMemberId_Equal(99999);
            });
            car.restart();

            Member inserted = source.clone();
            inserted.setMemberAccount(entryNumber + ":" + inserted.getMemberId());
            memberBhv.insert(inserted);
        }, new CannonballOption().threadCount(5));
    }
}
