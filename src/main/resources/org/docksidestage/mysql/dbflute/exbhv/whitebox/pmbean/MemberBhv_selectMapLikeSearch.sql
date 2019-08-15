/*
 [df:title]
 Map LikeSearch Select
 
 [df:description]
 The parameter bean has Map type.
*/
-- selectMapLikeSearch.sql

-- !df:pmb!
-- !!Map<String, Object> conditionMap:like!!

select mb.MEMBER_ID
     , mb.MEMBER_NAME
  from `MEMBER` mb
 /*BEGIN*/where
   /*IF pmb.conditionMap.memberId != null*/mb.MEMBER_ID = /*pmb.conditionMap.memberId*/3/*END*/
   /*IF pmb.conditionMap.memberName != null*/and mb.MEMBER_NAME like /*pmb.conditionMap.memberName*/'S%'/*END*/
 /*END*/
 order by mb.MEMBER_ID asc
