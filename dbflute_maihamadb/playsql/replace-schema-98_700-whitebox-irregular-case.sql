
-- =======================================================================================
--                                                                          Irregular Case
--                                                                          ==============
-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of escaped dfprop
-- = = = = = = = = = =/
create table WHITE_ESCAPED_DFPROP (
	ESCAPED_DFPROP_CODE CHAR(3) NOT NULL,
	ESCAPED_DFPROP_NAME VARCHAR(20),
	PRIMARY KEY (ESCAPED_DFPROP_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of escaped java-doc comment
-- = = = = = = = = = =/
create table WHITE_ESCAPED_JAVA_DOC (
	ESCAPED_JAVA_DOC_CODE CHAR(3) NOT NULL,
	ESCAPED_JAVA_DOC_NAME VARCHAR(20),
	PRIMARY KEY (ESCAPED_JAVA_DOC_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of escaped number initial name
-- = = = = = = = = = =/
create table WHITE_ESCAPED_NUMBER_INITIAL (
	NUMBER_INITIAL_CODE CHAR(3) NOT NULL,
	NUMBER_INITIAL_NAME VARCHAR(20),
	PRIMARY KEY (NUMBER_INITIAL_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of line separator comment
-- = = = = = = = = = =/
create table WHITE_LINE_SEP_COMMENT (
	LINE_SEP_COMMENT_CODE CHAR(3) NOT NULL,
	LINE_SEP_COMMENT_NAME VARCHAR(20),
	PRIMARY KEY (LINE_SEP_COMMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of no camelzing classification
-- = = = = = = = = = =/
create table WHITE_CLS_NO_CAMELIZING (
	NO_CAMELIZING_CODE VARCHAR(10) NOT NULL,
	NO_CAMELIZING_NAME VARCHAR(20),
	PRIMARY KEY (NO_CAMELIZING_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of deprecated classification element
-- = = = = = = = = = =/
create table WHITE_DEPRECATED_CLS_ELEMENT (
	DEPRECATED_CLS_ELEMENT_CODE CHAR(3) NOT NULL,
	DEPRECATED_CLS_ELEMENT_NAME VARCHAR(20),
	PRIMARY KEY (DEPRECATED_CLS_ELEMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of DB comment
-- = = = = = = = = = =/
create table WHITE_DB_COMMENT (
	DB_COMMENT_CODE CHAR(3) NOT NULL COMMENT 'Normal: this is normal comment.',
	DB_COMMENT_NAME VARCHAR(20) COMMENT 'JavaDocHeadache: e.g. /*BEGIN*/, @ @foo <br>',
	PRIMARY KEY (DB_COMMENT_CODE)
) ;

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of duplicate stiletto alias
-- = = = = = = = = = =/
create table WHITE_STILETTO_ALIAS (
	STILETTO_ALIAS_ID INTEGER NOT NULL PRIMARY KEY,
	FOO VARCHAR(200),
	FOO_0 VARCHAR(200),
	FOO_1 VARCHAR(200),
	FOO2 VARCHAR(200),
	FOO_3 VARCHAR(200),
	FOO4 VARCHAR(200),
	BAR VARCHAR(200),
	QUX VARCHAR(200)
) ;

create table WHITE_STILETTO_ALIAS_REF (
	REF_ID INTEGER NOT NULL PRIMARY KEY,
	FOO0 VARCHAR(200),
	FOO_1 VARCHAR(200),
	FOO2 VARCHAR(200),
	FOO3 VARCHAR(200),
	FOO_4 VARCHAR(200),
	BAR_0 VARCHAR(200),
	QUX_0 VARCHAR(200),
	c21 VARCHAR(200),
	c22 VARCHAR(200),
	c23 VARCHAR(200),
	STILETTO_ALIAS_ID INTEGER
) ;

alter table WHITE_STILETTO_ALIAS_REF add constraint FK_WHITE_STILETTO_ALIAS_REF
	foreign key (STILETTO_ALIAS_ID) references WHITE_STILETTO_ALIAS (STILETTO_ALIAS_ID) ;

-- /= = = = = = = = = = = = = = = = = = 
-- for the test of quoted table name
-- = = = = = = = = = =/
create table WHITE_QUOTED (
	`SELECT` INTEGER NOT NULL PRIMARY KEY,
	`FROM` VARCHAR(200)
) ;

create table WHITE_QUOTED_REF (
	`WHERE` INTEGER NOT NULL PRIMARY KEY,
	`ORDER` INTEGER
) ;

alter table WHITE_QUOTED_REF add constraint FK_WHITE_QUOTED_REF
	foreign key (`ORDER`) references WHITE_QUOTED (`SELECT`) ;

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of program reservation word
-- = = = = = = = = = =/
create table WHITE_PG_RESERV (
	CLASS integer NOT NULL PRIMARY KEY,
	`CASE` integer,
	PACKAGE integer,
	`DEFAULT` integer,
	NEW integer,
	NATIVE integer,
	VOID integer,
	PUBLIC integer,
	PROTECTED integer,
	PRIVATE integer,
	INTERFACE integer,
	ABSTRACT integer,
	FINAL integer,
	FINALLY integer,
	`RETURN` integer,
	`DOUBLE` integer,
	`FLOAT` integer,
	SHORT integer,
	TYPE char(3),
	RESERV_NAME varchar(32) NOT NULL
) ;

create table WHITE_PG_RESERV_REF (
	REF_ID integer NOT NULL PRIMARY KEY,
	CLASS integer
) ;

alter table WHITE_PG_RESERV_REF add constraint FK_WHITE_PG_RESERV_REF_CLASS
	foreign key (CLASS) references WHITE_PG_RESERV (CLASS) ;
