
start transaction;

-- provisional because of non formalizedDatetime
insert into `MEMBER` (MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
 values ('sea', 'hangar', 'PRV', '2025-06-29 18:58:08.103', 'main', '2025-06-29 18:58:08.103', hex(aes_encrypt('main', 'himitsu')), 0)
;

-- test of LAST_INSERT_ID()
insert into MEMBER_SECURITY (MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
 values (LAST_INSERT_ID(), 'mystic', 'chip?', 'choucho', 906, '2025-06-29 18:58:08.103', 'main', '2025-06-29 18:58:08.103', hex(aes_encrypt('main', 'himitsu')), 0)
;

commit;

start transaction;

-- formalized but non formalizedDatetime
-- if rollback fails, assertion error by take-finally
insert into `MEMBER` (MEMBER_NAME, MEMBER_ACCOUNT, MEMBER_STATUS_CODE, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
 values ('land', 'showbase', 'FML', '2025-06-29 18:58:08.103', 'main', '2025-06-29 18:58:08.103', hex(aes_encrypt('main', 'himitsu')), 0)
;

insert into MEMBER_SECURITY (MEMBER_ID, LOGIN_PASSWORD, REMINDER_QUESTION, REMINDER_ANSWER, REMINDER_USE_COUNT, REGISTER_DATETIME, REGISTER_USER, UPDATE_DATETIME, UPDATE_USER, VERSION_NO)
 values (LAST_INSERT_ID(), 'oneman', 'chip?', 'shining', 416, '2025-06-29 18:58:08.103', 'main', '2025-06-29 18:58:08.103', hex(aes_encrypt('main', 'himitsu')), 0)
;

rollback;


-- #df:assertListExists#
select MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE, FORMALIZED_DATETIME
  from `MEMBER`
 where MEMBER_NAME = 'sea'
;

-- #df:assertListExists#
select sec.MEMBER_ID, sec.LOGIN_PASSWORD
  from MEMBER_SECURITY sec
    left outer join MEMBER mb
      on sec.MEMBER_ID = mb.MEMBER_ID
 where mb.MEMBER_NAME = 'sea'
;


-- #df:assertListZero#
select MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE, FORMALIZED_DATETIME
  from `MEMBER`
 where MEMBER_NAME = 'land'
;

-- #df:assertListZero#
select sec.MEMBER_ID, sec.LOGIN_PASSWORD
  from MEMBER_SECURITY sec
    left outer join MEMBER mb
      on sec.MEMBER_ID = mb.MEMBER_ID
 where mb.MEMBER_NAME = 'land'
;


--
-- manual rollback not to have an impact on existing tests 
--

delete from MEMBER_SECURITY where REMINDER_QUESTION = 'chip?'
;

delete from `MEMBER` where MEMBER_NAME = 'sea'
;

-- #df:assertListZero#
select MEMBER_ID, MEMBER_NAME, MEMBER_STATUS_CODE, FORMALIZED_DATETIME
  from `MEMBER`
 where MEMBER_NAME = 'sea'
;

-- #df:assertListZero#
select MEMBER_ID, LOGIN_PASSWORD
  from MEMBER_SECURITY
 where REMINDER_QUESTION = 'chip?'
;

