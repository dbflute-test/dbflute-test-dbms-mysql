/*
 [df:title]
 CommonColumn Member Select
 
 [df:description]
 This SQL selects common columns.
*/
-- #CommonColumnMember#

select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , mb.REGISTER_DATETIME
     , mb.REGISTER_USER
     , mb.UPDATE_DATETIME
     , mb.UPDATE_USER
  from `MEMBER` mb
 order by mb.MEMBER_ID asc
