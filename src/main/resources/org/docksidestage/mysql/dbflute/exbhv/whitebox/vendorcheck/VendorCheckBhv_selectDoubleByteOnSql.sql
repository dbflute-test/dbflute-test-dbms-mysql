/*
 [df:title]
 Double Byte on SQL Select
 
 [df:description]
 The SQL has double type characters.
*/
-- #df:entity#

select mb.MEMBER_ID
     , mb.MEMBER_NAME || '　' as MEMBER_NAME_WITH_SPACE
     , memberStatus.MEMBER_STATUS_NAME
/*END*/
  from `MEMBER` mb
    left outer join MEMBER_STATUS memberStatus
      on mb.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/where
   /*IF pmb.memberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and mb.MEMBER_NAME like /*pmb.memberName*/'S%'/*END*/
   /*END*/
 /*END*/
 order by mb.MEMBER_ID asc
