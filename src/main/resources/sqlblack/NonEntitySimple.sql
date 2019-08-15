/*
 [df:title]
 Non Entity OutsideSql (Simple)
 
 [df:description]
 simple file name
*/
select mb.MEMBER_ID
     , mb.MEMBER_NAME
  from `MEMBER` mb
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
 /*BEGIN*/where
   /*IF pmb.memberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and mb.MEMBER_NAME like /*pmb.memberName*/'S'/*END*/
 /*END*/
 order by mb.MEMBER_ID asc
