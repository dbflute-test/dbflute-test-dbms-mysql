/*
 [df:title]
 Resolved Package Name Select
 
 [df:description]
 The parameter bean has several expression.
*/
-- !df:pmb!
-- !!String string1!!
-- !!Integer integer1!!
-- !!BigDecimal bigDecimal1!!
-- !!java.math.BigDecimal bigDecimal2!!
-- !!Date date1!!
-- !!java.util.Date date2!!
-- !!java.sql.Date date3!!
-- !!Time time1!!
-- !!java.sql.Time time2!!
-- !!Timestamp timestamp1!!
-- !!java.sql.Timestamp timestamp2!!
-- !!List<String> list1!!
-- !!java.util.List<String> list2!!
-- !!Map<String, String> map1!!
-- !!java.util.Map<String, String> map2!!
-- !!$$CDef$$ cdef!!
-- !!$$CDef$$.Flg cdefFlg!!
-- !!byte[] bytes!!

select mb.MEMBER_ID
     , mb.MEMBER_NAME
  from `MEMBER` mb
 /*BEGIN*/where
   /*IF pmb.date1 != null*/mb.BIRTHDATE <= /*pmb.date1*/'2000-12-12'/*END*/
   /*IF pmb.list1 != null*/and mb.MEMBER_STATUS_CODE in /*pmb.list1*/('FML', 'PVS')/*END*/
 /*END*/
 order by mb.MEMBER_ID asc
