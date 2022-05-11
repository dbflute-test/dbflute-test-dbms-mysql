
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The test project for MySQL and DBFlute.



# ========================================================================================
#                                                                              Environment
#                                                                              ===========
[MySQL]

if you use Docker:
```
docker-compose up -d
export answer=y
cd dbflute_resortlinedb
sh manage.sh 0
cd -
cd dbflute_maihamadb
sh manage.sh 0
cd -
cd dbflute_immuhamadb
sh manage.sh 0
cd -
```

if you use plain module:
1. donwload MySQL as zip (non-install version) from official site
2. put it at the following directory:
```
dbflute-test-dbms-mysql
 |-localdb
 |  |-mysql // downloaded module
 |  |  |-bin
 |  |  |-data
 |  |  |-...
```
3. execute boot-mysql.sh/bat
(4. execute close-mysql.sh/bat when close)


settings memo:
needed MySQL settings in my.cnf:
```
# /* * * * * * * * * * * * * * * * * * * * * * * * Custom Settings
character-set-server=utf8mb4

# to ignore case in SQL everywhere
lower_case_table_names=1

# to be strict but already set as default from 5.7 so unneeded
#sql_mode="ONLY_FULL_GROUP_BY,TRADITIONAL"
# * * * * * * * * * */
```
*the settings are already embedded in the both Docker way and plain module way 



# ========================================================================================
#                                                                            Demo Resource
#                                                                            =============
-- alter table MEMBER modify column MEMBER_ACCOUNT VARCHAR(80) NOT NULL;
-- alter table MEMBER add column ARGENTINA_READING VARCHAR(30) after MEMBER_ACCOUNT;
