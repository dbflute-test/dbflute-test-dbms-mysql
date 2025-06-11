
-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of function index
-- = = = = = = = = = =/
create table WHITE_FUNCTION_INDEX_BASE (
    INDEX_BASE_ID BIGINT AUTO_INCREMENT NOT NULL,
    INDEX_BASE_NAME VARCHAR(200) NOT NULL,
    INDEX_BASE_NUMBER_FIRST INTEGER NOT NULL,
    INDEX_BASE_NUMBER_SECOND INTEGER NOT NULL,
    INDEX_BASE_DATETIME DATETIME NOT NULL,
    PRIMARY KEY (INDEX_BASE_ID)
);

create index IX_WHITE_FUNCTION_INDEX_BASE_FUNC_NUMBER
    on `WHITE_FUNCTION_INDEX_BASE`((INDEX_BASE_NUMBER_FIRST + INDEX_BASE_NUMBER_SECOND));
create index IX_WHITE_FUNCTION_INDEX_BASE_DATETIME
    on `WHITE_FUNCTION_INDEX_BASE`(INDEX_BASE_DATETIME);

-- unfortunately failed
-- -> Expression of functional index 'IX_WHITE_FUNCTION_INDEX_BASE_FUNC_DATE_FORMAT' contains a disallowed function.
-- create index IX_WHITE_FUNCTION_INDEX_BASE_FUNC_DATE_FORMAT
--     on `WHITE_FUNCTION_INDEX_BASE`((dateformat(INDEX_BASE_DATETIME, '%Y-%m-%d')));

create index IX_WHITE_FUNCTION_INDEX_BASE_FUNC_DATE_CAST
    on `WHITE_FUNCTION_INDEX_BASE`((cast(INDEX_BASE_DATETIME as date)));

/*

// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// confirm precondition of normal index
// _/_/_/_/_/_/_/_/_/_/

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where base.INDEX_BASE_DATETIME = '2025-06-10 23:19:48'
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                         | key                                   | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_FUNCTION_INDEX_BASE_DATETIME | IX_WHITE_FUNCTION_INDEX_BASE_DATETIME | 5       | const |    1 |   100.00 | NULL  |
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where base.INDEX_BASE_DATETIME = '2025-06-10'
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                         | key                                   | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_FUNCTION_INDEX_BASE_DATETIME | IX_WHITE_FUNCTION_INDEX_BASE_DATETIME | 5       | const |    1 |   100.00 | NULL  |
+----+-------------+-------+------------+------+---------------------------------------+---------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.00 sec)



// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// using indexed column in where clause
// _/_/_/_/_/_/_/_/_/_/

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where cast(base.INDEX_BASE_DATETIME as date) = '2025-06-10'
+----+-------------+-------+------------+------+---------------------------------------------+---------------------------------------------+---------+-------+------+----------+-------+
| id | select_type | table | partitions | type | possible_keys                               | key                                         | key_len | ref   | rows | filtered | Extra |
+----+-------------+-------+------------+------+---------------------------------------------+---------------------------------------------+---------+-------+------+----------+-------+
|  1 | SIMPLE      | base  | NULL       | ref  | IX_WHITE_FUNCTION_INDEX_BASE_FUNC_DATE_CAST | IX_WHITE_FUNCTION_INDEX_BASE_FUNC_DATE_CAST | 4       | const |    3 |   100.00 | NULL  |
+----+-------------+-------+------------+------+---------------------------------------------+---------------------------------------------+---------+-------+------+----------+-------+
1 row in set, 1 warning (0.01 sec)

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where date_format(INDEX_BASE_DATETIME, '%Y-%m-%d') = '2025-06-10'
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+
|  1 | SIMPLE      | base  | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    5 |   100.00 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+
1 row in set, 1 warning (0.00 sec)




// _/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
// using indexed column in order by and select clause
// _/_/_/_/_/_/_/_/_/_/

explain
select cast(base.INDEX_BASE_DATETIME as date) as BASE_DATE
  from WHITE_FUNCTION_INDEX_BASE base
 order by BASE_DATE asc
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra          |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
|  1 | SIMPLE      | base  | NULL       | ALL  | NULL          | NULL | NULL    | NULL |    5 |   100.00 | Using filesort |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+----------------+
1 row in set, 1 warning (0.00 sec)

explain
select base.INDEX_BASE_DATETIME
  from WHITE_FUNCTION_INDEX_BASE base
 order by base.INDEX_BASE_DATETIME
+----+-------------+-------+------------+-------+---------------+---------------------------------------+---------+------+------+----------+-------------+
| id | select_type | table | partitions | type  | possible_keys | key                                   | key_len | ref  | rows | filtered | Extra       |
+----+-------------+-------+------------+-------+---------------+---------------------------------------+---------+------+------+----------+-------------+
|  1 | SIMPLE      | base  | NULL       | index | NULL          | IX_WHITE_FUNCTION_INDEX_BASE_DATETIME | 5       | NULL |    5 |   100.00 | Using index |
+----+-------------+-------+------------+-------+---------------+---------------------------------------+---------+------+------+----------+-------------+
1 row in set, 1 warning (0.00 sec)

*/
