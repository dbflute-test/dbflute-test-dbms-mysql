-- #df:changeUser(system)#
-- #df:checkUser()#
create database /*$dfprop.mainCatalog*/;

-- #df:reviveUser()#
-- #df:checkUser(mainUser)#
create user /*$dfprop.mainUser*/@localhost identified by '/*$dfprop.mainPassword*/';

-- #df:reviveUser()#
-- #df:checkUser(mainUser, grant)#
grant all privileges on /*$dfprop.mainCatalog*/.* to /*$dfprop.mainUser*/@localhost;

flush privileges;