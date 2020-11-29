
# ========================================================================================
#                                                                                 Overview
#                                                                                 ========
The test project for MySQL and DBFlute.


# ========================================================================================
#                                                                              Environment
#                                                                              ===========

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


# ========================================================================================
#                                                                            Demo Resource
#                                                                            =============
-- alter table MEMBER modify column MEMBER_ACCOUNT VARCHAR(80) NOT NULL;
-- alter table MEMBER add column ARGENTINA_READING VARCHAR(30) after MEMBER_ACCOUNT;
