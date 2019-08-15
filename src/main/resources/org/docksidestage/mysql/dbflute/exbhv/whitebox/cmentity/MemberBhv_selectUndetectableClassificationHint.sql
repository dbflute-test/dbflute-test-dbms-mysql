/*
 [df:title]
 using Classification Hint
 
 [df:description]
 hint of customize-entity for undetectable classification
 (in this project, detectable by classification resource style)
*/
-- #df:entity#

select base.*
  from (select mb.MEMBER_ID
             , mb.MEMBER_STATUS_CODE
          from `MEMBER` mb
         union
        select mb.MEMBER_ID
             , stat.MEMBER_STATUS_CODE
          from `MEMBER` mb
            left outer join MEMBER_STATUS stat on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
       ) base
