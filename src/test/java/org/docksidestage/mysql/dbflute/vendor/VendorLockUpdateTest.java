package org.docksidestage.mysql.dbflute.vendor;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.exception.EntityAlreadyUpdatedException;
import org.dbflute.utflute.core.cannonball.CannonballCar;
import org.dbflute.utflute.core.cannonball.CannonballDragon;
import org.dbflute.utflute.core.cannonball.CannonballOption;
import org.dbflute.utflute.core.cannonball.CannonballProjectA;
import org.dbflute.utflute.core.cannonball.CannonballRun;
import org.dbflute.util.DfCollectionUtil;
import org.docksidestage.mysql.dbflute.exbhv.MemberBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchaseBhv;
import org.docksidestage.mysql.dbflute.exbhv.PurchasePaymentBhv;
import org.docksidestage.mysql.dbflute.exentity.Member;
import org.docksidestage.mysql.dbflute.exentity.Purchase;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.0.5B (2014/02/18 Tuesday)
 */
public class VendorLockUpdateTest extends UnitContainerTestCase {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    private MemberBhv memberBhv;
    private PurchaseBhv purchaseBhv;
    private PurchasePaymentBhv purchasePaymentBhv;

    // ===================================================================================
    //                                                                            Settings
    //                                                                            ========
    @Override
    protected boolean isSuppressTestCaseTransaction() {
        return true;
    }

    // ===================================================================================
    //                                                                              Update
    //                                                                              ======
    // -----------------------------------------------------
    //                                       Formal Deadlock
    //                                       ---------------
    public void test_update_FormalDeadlock_basic() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectNormallyDone();
                        updateFoo();
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectNormallyDone();
                        updateBar();
                    }
                }, 2);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.expectOvertime();
                        updateBar();
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        updateFoo();
                    }
                }, 2);
            }

            protected void updateFoo() {
                Member member = new Member();
                member.setMemberId(3);
                member.setMemberStatusCode_Formalized();
                memberBhv.updateNonstrict(member);
            }

            protected void updateBar() {
                Member member = new Member();
                member.setMemberId(7);
                member.setMemberStatusCode_Formalized();
                memberBhv.updateNonstrict(member);
            }
        }, new CannonballOption().threadCount(2).expectExceptionAny("Deadlock"));
    }

    // -----------------------------------------------------
    //                                        UniqueKey Wait
    //                                        --------------
    public void test_update_UniqueKeyWait_basic() throws Exception {
        final String memberAccount = "update_UniqueKeyWait";
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberName("lock1");
                        member.setMemberAccount(memberAccount);
                        member.setMemberStatusCode_Formalized();
                        memberBhv.insert(member);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.releaseIfOvertime(500);
                        dragon.expectOvertime(); // update waits for index lock
                        Member member = new Member();
                        member.setMemberId(3);
                        member.setMemberAccount(memberAccount);
                        member.setMemberStatusCode_Formalized();
                        memberBhv.updateNonstrict(member);
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    public void test_update_UniqueKeyWait_compoundKey() throws Exception {
        final LocalDateTime purchaseDatetime = toLocalDateTime("2014/04/30 12:34:56");
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Purchase purchase = new Purchase();
                        purchase.setMemberId(13); // same as purchaseId is 3
                        purchase.setProductId(3); // me too
                        purchase.setPurchaseDatetime(purchaseDatetime);
                        purchase.setPaymentCompleteFlg_True();
                        purchase.setPurchasePrice(3);
                        purchase.setPurchaseCount(1);
                        purchaseBhv.insert(purchase);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        dragon.releaseIfOvertime(500);
                        dragon.expectOvertime(); // update waits for index lock
                        Purchase purchase = new Purchase();
                        purchase.setPurchaseId(3L);
                        purchase.setPurchaseDatetime(purchaseDatetime);
                        purchaseBhv.updateNonstrict(purchase);
                    }
                }, 2);
            }
        }, new CannonballOption().threadCount(2));
    }

    // -----------------------------------------------------
    //                                  AfterInsert Deadlock
    //                                  --------------------
    public void test_update_AfterInsertDeadlock_basic() {
        final int memberId = 3;
        final Member before = memberBhv.selectByPK(memberId).get();
        final Long versionNo = before.getVersionNo();
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                int entryNumber = car.getEntryNumber();
                Purchase purchase = new Purchase();
                purchase.setMemberId(3);
                purchase.setProductId(3);
                long currentMillis = currentUtilDate().getTime();
                long keyMillis = currentMillis - (entryNumber * 10000000);
                purchase.setPurchaseDatetime(toLocalDateTime(new Timestamp(keyMillis)));
                purchase.setPurchaseCount(1234);
                purchase.setPurchasePrice(1234);
                purchase.setPaymentCompleteFlg_True();
                purchaseBhv.insert(purchase);

                car.restart();

                // deadlock if update is executed after insert
                // (updateNonstrict() too)
                // ShareLock and ExclusiveLock are points
                Member member = new Member();
                member.setMemberId(memberId);
                member.setVersionNo(versionNo);
                memberBhv.update(member);
                markSet.add("success: " + entryNumber);
            }
        }, new CannonballOption().commitTx().expectExceptionAny("Deadlock found"));
        log(markSet);
    }

    public void test_update_AfterInsertDeadlock_simply() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Purchase purchase = purchaseBhv.selectByPK(3L).get();
                purchase.setMemberId(1);
                purchase.setProductId(1);
                long threadId = car.getThreadId();
                long currentMillis = currentUtilDate().getTime();
                long keyMillis = currentMillis - (threadId * 10000000);
                purchase.setPurchaseDatetime(toLocalDateTime(new Timestamp(keyMillis)));
                purchaseBhv.insert(purchase);

                car.restart();

                Member member = new Member();
                member.setMemberId(1);
                member.setBirthdate(currentLocalDate());
                memberBhv.updateNonstrict(member);
            }
        }, new CannonballOption().threadCount(3).repeatCount(1).expectExceptionAny("Deadlock found"));
    }

    // -----------------------------------------------------
    //                              BeforeInsert NonDeadlock
    //                              ------------------------
    public void test_update_BeforeInsertNonDeadlock_basic() throws Exception {
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                Member member = new Member();
                member.setMemberId(1);
                member.setBirthdate(currentLocalDate());
                memberBhv.updateNonstrict(member);

                Purchase purchase = new Purchase();
                purchase.setMemberId(1);
                purchase.setProductId(1);
                int entryNumber = car.getEntryNumber();
                long currentMillis = currentUtilDate().getTime();
                long keyMillis = currentMillis - (entryNumber * 10000000);
                purchase.setPurchaseDatetime(toLocalDateTime(new Timestamp(keyMillis)));
                purchase.setPurchaseCount(1234);
                purchase.setPurchasePrice(1234);
                purchase.setPaymentCompleteFlg_True();
                purchaseBhv.insert(purchase);
            }
        }, new CannonballOption().threadCount(3)); // no deadlock
    }

    // -----------------------------------------------------
    //                      RepeatableRead but ReadCommitted
    //                      --------------------------------
    public void test_update_RepeatableRead_but_ReadCommitted() { // uses original transactions
        final int memberId = 3;
        final Member before = memberBhv.selectByPK(memberId).get();
        final Long versionNo = before.getVersionNo();
        log("before: " + versionNo);
        final Set<String> markSet = DfCollectionUtil.newHashSet();
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                log(versionNo);
                car.restart();
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setVersionNo(versionNo);
                        memberBhv.update(member);
                    }
                }, 1);
                car.projectA(new CannonballProjectA() {
                    public void plan(CannonballDragon dragon) {
                        Member before = memberBhv.selectByPK(memberId).get();
                        assertEquals(versionNo, before.getVersionNo()); // repeatable read
                        Member member = new Member();
                        member.setMemberId(memberId);
                        member.setVersionNo(versionNo);
                        memberBhv.update(member); // treated as read committed
                    }
                }, 2);
                markSet.add("success: " + car.getEntryNumber());
            }
        }, new CannonballOption().commitTx().threadCount(2).expectExceptionAny(EntityAlreadyUpdatedException.class));
        log(markSet);
    }

    // ===================================================================================
    //                                                                              Delete
    //                                                                              ======
    public void test_delete_nonDeadlock() throws Exception {
        ListResultBean<Purchase> purchaseList = purchaseBhv.selectList(cb -> {
            cb.query().setMemberId_Equal(3);
        });
        List<Long> purchaseIdList = purchaseBhv.extractPurchaseIdList(purchaseList);
        assertTrue(purchaseIdList.size() > 2);
        final Stack<Long> stack = new Stack<Long>();
        stack.addAll(purchaseIdList);
        cannonball(new CannonballRun() {
            public void drive(CannonballCar car) {
                purchasePaymentBhv.varyingQueryDelete(qcb -> {}, op -> op.allowNonQueryDelete());
                Purchase purchase = new Purchase();
                purchase.setPurchaseId(stack.pop());
                purchaseBhv.deleteNonstrict(purchase);

                Member member = new Member();
                member.setMemberId(3);
                member.setBirthdate(currentLocalDate());
                memberBhv.updateNonstrict(member);
            }
        }, new CannonballOption().threadCount(3)); // no deadlock
    }

    // ===================================================================================
    //                                                                          For Update
    //                                                                          ==========
    public void test_forUpdate_existingValue() throws Exception {
        cannonball(car -> {
            car.projectA(dragon -> {
                dragon.expectNormallyDone();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(3);
                    cb.lockForUpdate();
                });
            }, 1);
            car.projectA(dragon -> {
                dragon.expectOvertime();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(3);
                    cb.lockForUpdate();
                });
            }, 2);
        }, new CannonballOption().threadCount(2));
    }

    public void test_forUpdate_notExistingValue() throws Exception {
        cannonball(car -> {
            car.projectA(dragon -> {
                dragon.expectNormallyDone();
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(99999);
                    cb.lockForUpdate();
                });
            }, 1);
            car.projectA(dragon -> {
                dragon.expectNormallyDone(); /* no wait */
                memberBhv.selectEntity(cb -> {
                    cb.query().setMemberId_Equal(99999);
                    cb.lockForUpdate();
                });
            }, 2);
        }, new CannonballOption().threadCount(2));
    }

    // ===================================================================================
    //                                                                                Memo
    //                                                                                ====
    // /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
    /*
    -- InnoDBエンジンのステータス
    show engine innodb status;

    -- MySQLのプロセスの一覧
    show processlist;

    -- 現在実行中のトランザクションを検索
    select * from information_schema.INNODB_TRX;

    -- ロック競合を起こしているトランザクションの情報を検索
    select * from information_schema.INNODB_LOCKS;

    -- どのトランザクションがどのトランザクションを待たせているのか検索
    select * from information_schema.INNODB_LOCK_WAITS;

    -- ロック競合のひとまとめ検索
    select concat(t_bk.trx_mysql_thread_id
                , ' / ', waits.blocking_trx_id
                , ' / ', waits.blocking_lock_id) as blocking_id
         , concat(t_rq.trx_mysql_thread_id
                , ' / ', waits.requesting_trx_id
                , ' / ', waits.requested_lock_id) as requesting_id
         , l_bk.lock_table as lock_table, l_bk.lock_index as lock_index
         , concat(l_bk.lock_mode, ' blocks ', l_rq.lock_mode) as lock_mode
         , concat(p_bk.HOST, ' blocks ', p_rq.HOST) as host
         , concat(p_bk.COMMAND, '(', p_bk.TIME, ')'
                , ' blocks ', p_rq.COMMAND, '(', p_rq.TIME, ')') as command_and_seconds
         , p_bk.INFO as blocking_info, p_rq.INFO as requesting_info
      from information_schema.INNODB_LOCK_WAITS waits
         , information_schema.INNODB_LOCKS l_bk, information_schema.INNODB_LOCKS l_rq
         , information_schema.INNODB_TRX t_bk, information_schema.INNODB_TRX t_rq
         , information_schema.PROCESSLIST p_bk, information_schema.PROCESSLIST p_rq
     where waits.blocking_lock_id = l_bk.lock_id
       and waits.requested_lock_id = l_rq.lock_id
       and waits.blocking_trx_id = t_bk.trx_id
       and waits.requesting_trx_id = t_rq.trx_id
       and t_bk.trx_mysql_thread_id = p_bk.ID
       and t_rq.trx_mysql_thread_id = p_rq.ID
     order by requesting_id, blocking_id
    ;
    */
    // = = = = = = = = = =/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- InnoDBエンジンのステータス
    // show engine innodb status;
    // ...
    // ...
    // ------------
    // TRANSACTIONS
    // ------------
    // Trx id counter 652050
    // Purge done for trx's n:o < 652048 undo n:o < 0 state: running but idle
    // History list length 1490
    // LIST OF TRANSACTIONS FOR EACH SESSION:
    // ---TRANSACTION 0, not started
    // MySQL thread id 63, OS thread handle 0x12065d000, query id 4799 localhost root init
    // show engine innodb status
    // ---TRANSACTION 652049, ACTIVE 2 sec inserting
    // mysql tables in use 1, locked 1
    // LOCK WAIT 3 lock struct(s), heap size 376, 1 row lock(s), undo log entries 1
    // MySQL thread id 74, OS thread handle 0x120723000, query id 4798 localhost 127.0.0.1 exampledb update
    // insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
    //  values (7, 1, '2014-04-03 00:14:22.672', 9, (123 + 13), 1, '2014-04-03 00:14:22.255', 'pool-1-thread-2', '2014-04-03 00:14:22.255', 'pool-1-thread-2', 0)
    // ------- TRX HAS BEEN WAITING 2 SEC FOR THIS LOCK TO BE GRANTED:
    // RECORD LOCKS space id 18920 page no 3 n bits 128 index "PRIMARY" of table "exampledb"."member" trx id 652049 lock mode S locks rec but not gap waiting
    // Record lock, heap no 58 PHYSICAL RECORD: n_fields 13; compact format; info bits 0
    //  0: len 4; hex 80000007; asc     ;;
    //  1: len 6; hex 00000009f310; asc       ;;
    //  2: len 7; hex 22000001f20c88; asc "      ;;
    //  3: len 5; hex 6c6f636b31; asc lock1;;
    //  4: len 6; hex 4f6732303030; asc Og2000;;
    //  5: len 3; hex 464d4c; asc FML;;
    //  6: len 5; hex 9975cf11de; asc  u   ;;
    //  7: SQL NULL;
    //  8: len 5; hex 9992836d2a; asc    m*;;
    //  9: len 3; hex 666f6f; asc foo;;
    //  10: len 5; hex 9992860396; asc      ;;
    //  11: len 30; hex 323036444634454139413030443136443545423744393838313531434436; asc 206DF4EA9A00D16D5EB7D988151CD6; (total 32 bytes);
    //  12: len 8; hex 8000000000000001; asc         ;;
    // 
    // ------------------
    // ---TRANSACTION 652048, ACTIVE 2 sec
    // 2 lock struct(s), heap size 376, 1 row lock(s), undo log entries 1
    // MySQL thread id 73, OS thread handle 0x120519000, query id 4787 localhost 127.0.0.1 exampledb cleaning up
    // ...
    // ...
    // - - - - - - - - - -/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- MySQLのプロセスの一覧
    // show processlist;
    // +----+-----------+-----------------+-----------+---------+------+--------+------------------------------------------------------------------------------------------------------+
    // | Id | User      | Host            | db        | Command | Time | State  | Info                                                                                                 |
    // +----+-----------+-----------------+-----------+---------+------+--------+------------------------------------------------------------------------------------------------------+
    // | 63 | root      | localhost       | exampledb | Query   |    0 | init   | show processlist                                                                                     |
    // | 73 | exampledb | localhost:60029 | exampledb | Sleep   |    2 |        | NULL                                                                                                 |
    // | 74 | exampledb | localhost:60030 | exampledb | Query   |    2 | update | insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYM |
    // +----+-----------+-----------------+-----------+---------+------+--------+------------------------------------------------------------------------------------------------------+
    // - - - - - - - - - -/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- 現在実行中のトランザクションを検索
    // select * from information_schema.INNODB_TRX;
    // +--------+-----------+---------------------+-----------------------+---------------------+------------+---------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------+-------------------+-------------------+------------------+-----------------------+-----------------+-------------------+-------------------------+---------------------+-------------------+------------------------+----------------------------+---------------------------+---------------------------+------------------+----------------------------+
    // | trx_id | trx_state | trx_started         | trx_requested_lock_id | trx_wait_started    | trx_weight | trx_mysql_thread_id | trx_query                                                                                                                                                                                                                                                                                                                                                    | trx_operation_state | trx_tables_in_use | trx_tables_locked | trx_lock_structs | trx_lock_memory_bytes | trx_rows_locked | trx_rows_modified | trx_concurrency_tickets | trx_isolation_level | trx_unique_checks | trx_foreign_key_checks | trx_last_foreign_key_error | trx_adaptive_hash_latched | trx_adaptive_hash_timeout | trx_is_read_only | trx_autocommit_non_locking |
    // +--------+-----------+---------------------+-----------------------+---------------------+------------+---------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------+-------------------+-------------------+------------------+-----------------------+-----------------+-------------------+-------------------------+---------------------+-------------------+------------------------+----------------------------+---------------------------+---------------------------+------------------+----------------------------+
    // | 652049 | LOCK WAIT | 2014-04-03 00:14:22 | 652049:18920:3:58     | 2014-04-03 00:14:22 |          4 |                  74 | insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO) values (7, 1, '2014-04-03 00:14:22.672', 9, (123 + 13), 1, '2014-04-03 00:14:22.255', 'pool-1-thread-2', '2014-04-03 00:14:22.255', 'pool-1-thread-2', 0)  | inserting           |                 1 |                 1 |                3 |                   376 |               1 |                 1 |                       0 | REPEATABLE READ     |                 1 |                      1 | NULL                       |                         0 |                     10000 |                0 |                          0 |
    // | 652048 | RUNNING   | 2014-04-03 00:14:22 | NULL                  | NULL                |          3 |                  73 | NULL                                                                                                                                                                                                                                                                                                                                                         | NULL                |                 0 |                 0 |                2 |                   376 |               1 |                 1 |                       0 | REPEATABLE READ     |                 1 |                      1 | NULL                       |                         0 |                     10000 |                0 |                          0 |
    // +--------+-----------+---------------------+-----------------------+---------------------+------------+---------------------+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+---------------------+-------------------+-------------------+------------------+-----------------------+-----------------+-------------------+-------------------------+---------------------+-------------------+------------------------+----------------------------+---------------------------+---------------------------+------------------+----------------------------+
    // - - - - - - - - - -/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- ロック競合を起こしているトランザクションの情報を検索
    // select * from information_schema.INNODB_LOCKS;
    // +-------------------+-------------+-----------+-----------+----------------------+------------+------------+-----------+----------+-----------+
    // | lock_id           | lock_trx_id | lock_mode | lock_type | lock_table           | lock_index | lock_space | lock_page | lock_rec | lock_data |
    // +-------------------+-------------+-----------+-----------+----------------------+------------+------------+-----------+----------+-----------+
    // | 652049:18920:3:58 | 652049      | S         | RECORD    | "exampledb"."member" | PRIMARY    |      18920 |         3 |       58 | 7         |
    // | 652048:18920:3:58 | 652048      | X         | RECORD    | "exampledb"."member" | PRIMARY    |      18920 |         3 |       58 | 7         |
    // +-------------------+-------------+-----------+-----------+----------------------+------------+------------+-----------+----------+-----------+
    // - - - - - - - - - -/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- どのトランザクションがどのトランザクションを待たせているのか検索
    // select * from information_schema.INNODB_LOCK_WAITS;
    // +-------------------+-------------------+-----------------+-------------------+
    // | requesting_trx_id | requested_lock_id | blocking_trx_id | blocking_lock_id  |
    // +-------------------+-------------------+-----------------+-------------------+
    // | 652049            | 652049:18920:3:58 | 652048          | 652048:18920:3:58 |
    // +-------------------+-------------------+-----------------+-------------------+
    // - - - - - - - - - -/

    // /- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    // -- ロック競合のひとまとめ検索
    // select concat(t_bk.trx_mysql_thread_id
    //             , ' / ', waits.blocking_trx_id
    //             , ' / ', waits.blocking_lock_id) as blocking_id
    //      , concat(t_rq.trx_mysql_thread_id
    //             , ' / ', waits.requesting_trx_id
    //             , ' / ', waits.requested_lock_id) as requesting_id
    //      , l_bk.lock_table as lock_table, l_bk.lock_index as lock_index
    //      , concat(l_bk.lock_mode, ' blocks ', l_rq.lock_mode) as lock_mode
    //      , concat(p_bk.HOST, ' blocks ', p_rq.HOST) as host
    //      , concat(p_bk.COMMAND, '(', p_bk.TIME, ')'
    //             , ' blocks ', p_rq.COMMAND, '(', p_rq.TIME, ')') as command_and_seconds
    //      , p_bk.INFO as blocking_info, p_rq.INFO as requesting_info
    //   from information_schema.INNODB_LOCK_WAITS waits
    //      , information_schema.INNODB_LOCKS l_bk, information_schema.INNODB_LOCKS l_rq
    //      , information_schema.INNODB_TRX t_bk, information_schema.INNODB_TRX t_rq
    //      , information_schema.PROCESSLIST p_bk, information_schema.PROCESSLIST p_rq
    //  where waits.blocking_lock_id = l_bk.lock_id
    //    and waits.requested_lock_id = l_rq.lock_id
    //    and waits.blocking_trx_id = t_bk.trx_id
    //    and waits.requesting_trx_id = t_rq.trx_id
    //    and t_bk.trx_mysql_thread_id = p_bk.ID
    //    and t_rq.trx_mysql_thread_id = p_rq.ID
    //  order by requesting_id, blocking_id
    // ;
    // +---------------------------------+---------------------------------+----------------------+------------+------------+----------------------------------------+--------------------------+---------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
    // | blocking_id                     | requesting_id                   | lock_table           | lock_index | lock_mode  | host                                   | command_and_seconds      | blocking_info | requesting_info                                                                                                                                                                                                                                                                                                                                             |
    // +---------------------------------+---------------------------------+----------------------+------------+------------+----------------------------------------+--------------------------+---------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
    // | 73 / 652048 / 652048:18920:3:58 | 74 / 652049 / 652049:18920:3:58 | "exampledb"."member" | PRIMARY    | X blocks S | localhost:60029 blocks localhost:60030 | Sleep(2) blocks Query(2) | NULL          | insert into PURCHASE (MEMBER_ID, PRODUCT_ID, PURCHASE_DATETIME, PURCHASE_COUNT, PURCHASE_PRICE, PAYMENT_COMPLETE_FLG, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO) values (7, 1, '2014-04-03 00:14:22.672', 9, (123 + 13), 1, '2014-04-03 00:14:22.255', 'pool-1-thread-2', '2014-04-03 00:14:22.255', 'pool-1-thread-2', 0) |
    // +---------------------------------+---------------------------------+----------------------+------------+------------+----------------------------------------+--------------------------+---------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
    // - - - - - - - - - -/
}
