/*
 [df:title]
 Example for group-by on MySQL-5.7
 
 [df:description]
 This SQL is an example for group-by of outsideSql.
 DBFlute functions are not related to group-by, purely SQL example.
*/
-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select mb.MEMBER_ID -- // grouping item
     , mb.MEMBER_NAME -- // non grouping item (1:1 data) is allowed on MySQL-5.7
     , cast(concat(substring(pur.PURCHASE_DATETIME, 1, 7), '-01') as date) as PURCHASE_MONTH -- // grouping item, depends on DBMS
     , avg(pur.PURCHASE_PRICE) as PURCHASE_PRICE_AVG -- // aggregation item
     , max(pur.PURCHASE_PRICE) as PURCHASE_PRICE_MAX -- // me too
     -- non grouping, cannot execute one-to-many data on MySQL-5.7 (without sql_mode)
     --  ERROR: which is not functionally dependent on columns in GROUP BY clause
     --         this is incompatible with sql_mode=only_full_group_by
     -- , pur.PURCHASE_COUNT
     -- also you can use any_value() as random choise for one-to-many item
     , any_value(pur.PURCHASE_COUNT) as PURCHASE_COUNT_ANY
     , serv.SERVICE_POINT_COUNT -- // non grouping item (relationship 1:1 data) is allowed on MySQL-5.7
  from PURCHASE pur
    left outer join MEMBER mb
      on pur.MEMBER_ID = mb.MEMBER_ID
    left outer join MEMBER_SERVICE serv
      on mb.MEMBER_ID = serv.MEMBER_ID
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   mb.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberNamePrefix != null*/
   and mb.MEMBER_NAME like /*pmb.memberNamePrefix*/'S%'
   /*END*/
   /*IF pmb.purchaseDatetimeFrom != null*/
   and pur.PURCHASE_DATETIME >= /*pmb.purchaseDatetimeFrom*/'1997-02-01 12:34:56' -- // for month search
   /*END*/
   /*IF pmb.monthFromBad != null*/
   and cast(concat(substring(pur.PURCHASE_DATETIME, 1, 7), '-01') as date) >= /*pmb.monthFromBad*/'1997-01-01' -- // very osoi
   /*END*/
 /*END*/

 -- using alias of select clause for group-by is allowed on MySQL-5.7
 group by mb.MEMBER_ID, PURCHASE_MONTH

 /*BEGIN*/
 -- using alias of select clause for having is allowed on MySQL-5.7
 having
    /*IF pmb.monthToHaving != null*/
    PURCHASE_MONTH <= /*pmb.monthToHaving*/'1997-02-01' -- grouping item, containing the to-month
   /*END*/
    /*IF pmb.priceMaxFrom != null*/
    and PURCHASE_PRICE_MAX >= /*pmb.priceMaxFrom*/100 -- aggregation item
   /*END*/
 /*END*/

 order by mb.MEMBER_ID asc, PURCHASE_MONTH asc -- basic grammer here