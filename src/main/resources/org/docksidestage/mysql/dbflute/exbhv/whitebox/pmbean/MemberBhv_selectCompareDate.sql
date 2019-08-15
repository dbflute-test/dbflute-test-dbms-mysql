/*
 [df:title]
 Compare Date Select
 
 [df:description]
 The SQL has Date conditions.
*/
-- !df:pmb!
-- !!Integer memberId:ref(MEMBER)!!
-- !!Date birthdateFrom:ref(MEMBER.BIRTHDATE)!!
-- !!Timestamp formalizedDatetimeFrom:ref(MEMBER.FORMALIZED_DATETIME)!!

select *
  from `MEMBER` mb
 /*BEGIN*/where
   /*IF pmb.memberId != null*/mb.MEMBER_ID = /*pmb.memberId*/3/*END*/
   /*IF pmb.birthdateFrom != null*/and mb.BIRTHDATE >= /*pmb.birthdateFrom*/'1965-04-12'/*END*/
   /*IF pmb.formalizedDatetimeFrom != null*/and mb.FORMALIZED_DATETIME >= /*pmb.formalizedDatetimeFrom*/'1965-04-12 12:34:56'/*END*/
 /*END*/