
-- #df:changeUser(system)#
-- #df:checkUser(mainSchema)#
create database /*$dfprop.mainCatalog*/;

-- #df:reviveUser()#
-- #df:checkUser(mainUser)#
create user /*$dfprop.mainUser*/@"%" identified by '/*$dfprop.mainPassword*/';

-- #df:reviveUser()#
-- #df:checkUser(grant)#
grant all privileges on /*$dfprop.mainCatalog*/.* to /*$dfprop.mainUser*/@"%";

flush privileges;

-- #df:backToMainUser()#
create table STATION(
    STATION_ID INTEGER NOT NULL,
    STATION_NAME VARCHAR(200) NOT NULL,
    BIRTHDATE DATE,
    FORMALIZED_DATETIME DATETIME,
    HOME_COUNT INTEGER,
    WORKING_KILOMETER DECIMAL(4,2),
    PRIMARY KEY (STATION_ID)
);
