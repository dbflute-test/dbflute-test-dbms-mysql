/*
 [df:title]
 parameter auto-detect
 
 [df:description]
 This SQL cannot be executed by application.
 (only for DBFlute task testing)
*/
-- !df:pmb!
-- !!AutoDetect!!
-- !!String overriddenFromDate!!
-- !!boolean definedBoolean!!

select mb.MEMBER_ID
     , mb.MEMBER_NAME
  from `MEMBER` mb
 /*BEGIN*/where
   mb.MEMBER_ID = /*pmb.normalInteger:comment(memberId's comment)*/3
   and mb.MEMBER_ID = 123 /*pmb.noTestValue*/
   and mb.MEMBER_NAME like /*pmb.prefixSearchOption*/'S%'
   and mb.MEMBER_NAME like /*pmb.suffixSearchOption:ref(MEMBER.MEMBER_NAME)*/'%S'
   and mb.MEMBER_NAME like /*pmb.containSearchOption:comment(comment with implicit(likeContain))*/'%S%'
   and mb.MEMBER_NAME like /*pmb.normalLikeSearchOption*/'%S%v%'
   and mb.MEMBER_STATUS_CODE = /*pmb.basicCls:cls(MemberStatus)|comment(second option test)|ref(MEMBER.MEMBER_STATUS_CODE)*/'PRV'
   and mb.MEMBER_STATUS_CODE = /*pmb.fixedCls:cls(MemberStatus.Withdrawal)|comment(fixed classification)*/'PRV'
   and mb.MEMBER_STATUS_CODE = /*pmb.memberStatusCode:cls(MemberStatus)|ref(MEMBER)*/'PRV'
   and mb.BIRTHDATE > /*pmb.normalDate*/'2010-08-23'
   and mb.BIRTHDATE > /*pmb.fromDateOption:fromDate*/'2010-08-23'
   and mb.BIRTHDATE > /*pmb.toDateOption:toDate*/'2010-08-23'
   and mb.BIRTHDATE > /*pmb.duplicateFromDate:fromDate*/'2010-08-23'
   and mb.BIRTHDATE > /*pmb.duplicateFromDate*/'2010-08-23'
   and mb.BIRTHDATE > /*pmb.overriddenFromDate:fromDate*/'2010-08-23'
   and mb.MEMBER_ID in /*pmb.integerList*/(0, 2)
   and mb.MEMBER_STATUS_CODE in /*pmb.basicClsList:cls(MemberStatus)*/('FML', 'PRV')
   and mb.MEMBER_STATUS_CODE in /*pmb.fixedClsOneList:cls(MemberStatus.Formalized)*/('WDL')
   and mb.MEMBER_STATUS_CODE in /*pmb.fixedClsPluralList:cls(MemberStatus.Formalized, Withdrawal)*/('FML', 'PRV')
   and mb.MEMBER_STATUS_CODE in /*pmb.memberStatusCodeList:cls(MemberStatus)|ref(MEMBER)*/('FML', 'PRV')
   and mb.MEMBER_NAME = /*pmb.outsideSqlPath*/'Reservation'
   and mb.MEMBER_NAME = /*pmb.procedureName*/'Reservation'
   and mb.MEMBER_NAME = /*pmb.entityType*/'Reservation'
   /*IF pmb.isFirstAlternate()*/
   and mb.MEMBER_NAME is not null
   /*END*/
   /*FOR pmb.forCommentBasic*//*FIRST*/and (/*END*/
     /*NEXT 'or '*/mb.MEMBER_NAME like /*#current*/'S%'
   /*LAST*/)/*END*//*END*/
   /*FOR pmb.nestedForList*/
     /*IF #current.isEmpty()*/
       -- should be out of boolean alternate method
       and 0 = 0
     /*END*/
     /*FOR #current.nestedForList*/
       and mb.MEMBER_ID in /*#current*/(1, 2)
     /*END*/
   /*END*/
   /*FOR pmb.forCommentCurrentNotExists*/
   /*END*/
   /*FOR pmb.forCommentCurrentIllegal*/
     and mb.MEMBER_ID = /*#current.size*/3
   /*END*/
   /*FOR pmb.methodForList()*/
   /*END*/
   /*FOR pmb.ifCommentOnlyForList*/
     /*IF #current*/
     /*END*/
   /*END*/
   /*FOR pmb.bindInIfCommentForList*/
     /*IF #current*/
       and mb.BIRTHDATE > /*#current*/date '2011-12-12'
     /*END*/
   /*END*/
 /*END*/
 /*IF pmb.ifCommentOnly*/
 /*END*/
 /*IF pmb.ifCommentAndFirst && pmb.ifCommentAndSecond == 'foo' && pmb.ifCommentAndThird >= 0*/
 /*END*/
 /*IF !pmb.ifCommentBooleanNotFormal && !pmb.ifCommentBooleanNotWrongSyntax == 'foo'*/
 /*END*/
 /*IF !pmb.isNotUseAlternate()*/
 /*END*/
 /*IF pmb.isOutOfAlternate() == true*/
 /*END*/
 /*IF pmb.isDuplicateAlternate()*/
 /*END*/
 /*IF pmb.isDefinedBoolean()*/
 /*END*/
 /*IF pmb.getDefinedBoolean()*/
 /*END*/
 /*IF pmb.hasDefinedBoolean()*/
 /*END*/
 /*IF pmb.isPaging()*/
 /*END*/
 /*IF pmb.isEscapeStatement()*/
 /*END*/
 order by mb.MEMBER_ID asc
