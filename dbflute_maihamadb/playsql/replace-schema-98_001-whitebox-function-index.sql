
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
explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where base.INDEX_BASE_DATETIME = '2025-06-10 23:19:48'

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where base.INDEX_BASE_DATETIME = '2025-06-10'

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where cast(base.INDEX_BASE_DATETIME as date) = '2025-06-10'

explain
select *
  from WHITE_FUNCTION_INDEX_BASE base
 where date_format(INDEX_BASE_DATETIME, '%Y-%m-%d') = '2025-06-10'

explain
select cast(base.INDEX_BASE_DATETIME as date) as BASE_DATE
  from WHITE_FUNCTION_INDEX_BASE base
 order by BASE_DATE asc
*/
