-- #df:checkEnv(ut,slave)#

-- #df:changeUser(system)#
-- #df:checkUser(mainSchema)#
create database /*$dfprop.mainCatalog*/;

-- #MySQL_5_7 cannot use create user statement
-- so use "grant all privileges + identified by" here

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant all privileges on /*$dfprop.mainCatalog*/.* to /*$dfprop.mainUser*/@"%"
    identified by '/*$dfprop.mainPassword*/';

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant all privileges on /*$nextCatalog*/.* to /*$dfprop.mainUser*/@"%"
    identified by '/*$dfprop.mainPassword*/';

flush privileges;
