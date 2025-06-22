
/*
explain
select pur.PURCHASE_ID, mb.MEMBER_NAME, mb.BIRTHDATE
  from PURCHASE pur
    inner join MEMBER mb on pur.MEMBER_ID = mb.MEMBER_ID
 where mb.MEMBER_NAME like 'S%'
 order by pur.PURCHASE_PRICE
+----+-------------+-------+------------+-------+------------------------------------------------------------+--------------------------------------+---------+------------------------+------+----------+--------------------------------------------------------+
| id | select_type | table | partitions | type  | possible_keys                                              | key                                  | key_len | ref                    | rows | filtered | Extra                                                  |
+----+-------------+-------+------------+-------+------------------------------------------------------------+--------------------------------------+---------+------------------------+------+----------+--------------------------------------------------------+
|  1 | SIMPLE      | mb    | NULL       | range | PRIMARY,IX_MEMBER_MEMBER_NAME                              | IX_MEMBER_MEMBER_NAME                | 722     | NULL                   |    4 |   100.00 | Using index condition; Using temporary; Using filesort |
|  1 | SIMPLE      | pur   | NULL       | ref   | UQ_PURCHASE,MEMBER_ID,IX_PURCHASE_MEMBER_ID_PURCHASE_PRICE | IX_PURCHASE_MEMBER_ID_PURCHASE_PRICE | 4       | maihamadb.mb.MEMBER_ID |    5 |   100.00 | Using index                                            |
+----+-------------+-------+------------+-------+------------------------------------------------------------+--------------------------------------+---------+------------------------+------+----------+--------------------------------------------------------+
2 rows in set, 1 warning (0.01 sec)
*/
create index IX_PURCHASE_MEMBER_ID_PURCHASE_PRICE ON PURCHASE(MEMBER_ID, PURCHASE_PRICE);
