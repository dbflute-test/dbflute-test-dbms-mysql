/*
 [df:title]
 IfComment Wrong Expression Select
 
 [df:description]
 The SQL is wrong. The IF comment has invalid expression.
*/
-- selectIfCommentWrongExpression.sql

select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , (select sum(purchase.PURCHASE_PRICE)
          from PURCHASE purchase
         where purchase.MEMBER_ID = mb.MEMBER_ID
           and purchase.PAYMENT_COMPLETE_FLG = 0
       ) as UNPAID_PRICE_SUMMARY
     , memberStatus.MEMBER_STATUS_NAME
  from `MEMBER` mb
    left outer join MEMBER_STATUS memberStatus
      on mb.MEMBER_STATUS_CODE = memberStatus.MEMBER_STATUS_CODE
 /*BEGIN*/where
   /*IF pmb.wrongMemberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.memberName != null*/and mb.MEMBER_NAME like /*pmb.memberName*/'ス' || '%'/*END*/
   /*IF pmb.memberStatusCode != null*/and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'FML'/*END*/
   /*IF pmb.unpaidMemberOnly*/
   and exists (select 'yes'
                 from PURCHASE purchase
                where purchase.MEMBER_ID = mb.MEMBER_ID
                  and purchase.PAYMENT_COMPLETE_FLG = 0
       )
   /*END*/
 /*END*/
 order by UNPAID_PRICE_SUMMARY desc, mb.MEMBER_ID asc
