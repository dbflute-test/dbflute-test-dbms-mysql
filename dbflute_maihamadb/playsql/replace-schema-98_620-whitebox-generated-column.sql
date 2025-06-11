
-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of generated column (virtual)
-- = = = = = = = = = =/
create table WHITE_GENERATED_COLUMN_BASE (
    COLUMN_BASE_ID BIGINT AUTO_INCREMENT NOT NULL,
    COLUMN_BASE_NAME VARCHAR(200) NOT NULL,
    COLUMN_BASE_NUMBER_FIRST INTEGER NOT NULL,
    COLUMN_BASE_NUMBER_SECOND INTEGER NOT NULL,
    COLUMN_BASE_DATETIME DATETIME NOT NULL,
    COLUMN_BASE_VIRTUAL_DATE_CAST DATE generated always as (cast(COLUMN_BASE_DATETIME as date)) virtual NOT NULL,
    COLUMN_BASE_VIRTUAL_DATE_FORMAT DATE generated always as (date_format(COLUMN_BASE_DATETIME, '%Y-%m-%d')) virtual NOT NULL,
    PRIMARY KEY (COLUMN_BASE_ID)
);

create index IX_WHITE_GENERATED_COLUMN_BASE_DATETIME
    on `WHITE_GENERATED_COLUMN_BASE`(COLUMN_BASE_DATETIME);

-- actually function index (that has physical data)
create index IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_CAST
    on `WHITE_GENERATED_COLUMN_BASE`(COLUMN_BASE_VIRTUAL_DATE_CAST);

create index IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_FORMAT
    on `WHITE_GENERATED_COLUMN_BASE`(COLUMN_BASE_VIRTUAL_DATE_FORMAT);




/*

// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// confirm precondition of normal index
// _/_/_/_/_/_/_/_/_/_/

explain
select *
  from WHITE_GENERATED_COLUMN_BASE base
 where base.COLUMN_BASE_DATETIME = '2025-06-10 23:19:48'
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                           | key                                     | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_GENERATED_COLUMN_BASE_DATETIME | IX_WHITE_GENERATED_COLUMN_BASE_DATETIME | 5       | const |    1 |   100.00 | NULL  |
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.01 sec)

explain
select *
  from WHITE_GENERATED_COLUMN_BASE base
 where base.COLUMN_BASE_DATETIME = '2025-06-10'
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                           | key                                     | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_GENERATED_COLUMN_BASE_DATETIME | IX_WHITE_GENERATED_COLUMN_BASE_DATETIME | 5       | const |    1 |   100.00 | NULL  |
+----+-------------+-------+------------+------+-----------------------------------------+-----------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)



// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// using indexed column in where clause
// _/_/_/_/_/_/_/_/_/_/

explain
select *
  from WHITE_GENERATED_COLUMN_BASE base
 where cast(base.COLUMN_BASE_DATETIME as date) = '2025-06-10'
+----+-------------+-------+------------+------+--------------------------------------------------+--------------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                    | key                                              | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+--------------------------------------------------+--------------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_CAST | IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_CAST | 3       | const |    3 |   100.00 | NULL  |
+----+-------------+-------+------------+------+--------------------------------------------------+--------------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)

explain
select *
  from WHITE_GENERATED_COLUMN_BASE base
 where date_format(COLUMN_BASE_DATETIME, '%Y-%m-%d') = '2025-06-10'
+----+-------------+-------+------------+------+----------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                                      | key                                                | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+----------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_FORMAT | IX_WHITE_GENERATED_COLUMN_BASE_VIRTUAL_DATE_FORMAT | 3       | const |    3 |   100.00 | NULL  |
+----+-------------+-------+------------+------+----------------------------------------------------+----------------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)



// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// using indexed column in order by and select clause
// _/_/_/_/_/_/_/_/_/_/

explain
select cast(base.COLUMN_BASE_DATETIME as date) as BASE_DATE
  from WHITE_GENERATED_COLUMN_BASE base
 order by BASE_DATE asc
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra          |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
|  1 | SIMPLE      | base  | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    5 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)

explain
select date_format(COLUMN_BASE_DATETIME, '%Y-%m-%d') as BASE_DATE
  from WHITE_GENERATED_COLUMN_BASE base
 order by BASE_DATE asc
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra          |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
|  1 | SIMPLE      | base  | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    5 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)

explain
select base.COLUMN_BASE_DATETIME
  from WHITE_GENERATED_COLUMN_BASE base
 order by base.COLUMN_BASE_DATETIME
+----+-------------+-------+------------+-------+---------------+-----------------------------------------+---------+------+------+----------+-------------+
| id | select_type | table | partitions | type  | possible_keys | key                                     | key_len | ref  | rows | filtered | Extra       |
+----+-------------+-------+------------+-------+---------------+-----------------------------------------+---------+------+------+----------+-------------+
|  1 | SIMPLE      | base  | NULL       | index | NULL          | IX_WHITE_GENERATED_COLUMN_BASE_DATETIME | 5       | NULL |    5 |   100.00 | Using index |
+----+-------------+-------+------------+-------+---------------+-----------------------------------------+---------+------+------+----------+-------------+
1 row in set, 1 warning (0.00 sec)

*/
