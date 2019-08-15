/*
 [df:title]
 Option Member Select
 
 [df:description]
 This SQL has many option.
*/
-- #df:entity#

-- !df:pmb!
-- !!Integer memberId!!
-- !!String memberName:likePrefix!!
-- !!String memberAccount:like!!
-- !!Date fromFormalizedDate:fromDate!!
-- !!Date toFormalizedDate:toDate!!
-- !!String memberStatusCode:cls(MemberStatus)!!
-- !!Integer displayOrder:ref(MemberStatus)!!
-- !!Date birthdate:fromDate | ref(Member)!!
-- !!String status:cls(MemberStatus)|ref(Member.MEMBER_STATUS_CODE)!!

select mb.MEMBER_ID
     , mb.MEMBER_NAME
     , mb.BIRTHDATE
     , mb.FORMALIZED_DATETIME
     , mb.MEMBER_STATUS_CODE -- for Classification Test of Sql2Entity
     , stat.DISPLAY_ORDER as STATUS_DISPLAY_ORDER -- for Alias Name Test
     , stat.MEMBER_STATUS_NAME
     , 0 as DUMMY_FLG -- for Classification Test of Sql2Entity
     , 0 as DUMMY_NOFLG -- for Classification Test of Sql2Entity
  from `MEMBER` mb
    left outer join MEMBER_STATUS stat
      on mb.MEMBER_STATUS_CODE = stat.MEMBER_STATUS_CODE
 /*BEGIN*/
 where
   /*IF pmb.memberId != null*/
   mb.MEMBER_ID = /*pmb.memberId*/3
   /*END*/
   /*IF pmb.memberName != null*/
   and mb.MEMBER_NAME like /*pmb.memberName*/'S%'
   /*END*/
   /*IF pmb.memberAccount != null*/
   and mb.MEMBER_ACCOUNT like /*pmb.memberAccount*/'%v%'
   /*END*/
   /*IF pmb.fromFormalizedDate != null*/
   and mb.FORMALIZED_DATETIME >= /*pmb.fromFormalizedDate*/'1964-12-27'
   /*END*/
   /*IF pmb.toFormalizedDate != null*/
   and mb.FORMALIZED_DATETIME < /*pmb.toFormalizedDate*/'1974-04-17'
   /*END*/
   /*IF pmb.memberStatusCode != null*/
   and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode*/'WDL'
   /*END*/
 /*END*/
 order by mb.MEMBER_ID asc
