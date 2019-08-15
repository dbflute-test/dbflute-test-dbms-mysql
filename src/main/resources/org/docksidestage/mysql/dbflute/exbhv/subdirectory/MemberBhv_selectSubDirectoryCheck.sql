/*
 [df:title]
 SubDirectory Check Select
 
 [df:description]
 This SQL is simple select. only for sub directory
*/
select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , memberStatus.MEMBER_STATUS_NAME
  from `MEMBER` mb
    left outer join MEMBER_STATUS memberStatus
      on mb.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/where
   /*IF pmb.memberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and mb.MEMBER_NAME like /*pmb.memberName*/'S%'/*END*/
 /*END*/
 order by mb.MEMBER_ID asc
