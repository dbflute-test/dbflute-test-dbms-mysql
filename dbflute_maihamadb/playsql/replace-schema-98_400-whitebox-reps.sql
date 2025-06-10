
-- =======================================================================================
--                                                                           ReplaceSchema
--                                                                           =============
-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema delimiter data loading
-- = = = = = = = = = =/
create table WHITE_DELIMITER (
	DELIMITER_ID BIGINT AUTO_INCREMENT NOT NULL,
	NUMBER_NULLABLE INTEGER,
	STRING_CONVERTED VARCHAR(200),
	STRING_NON_CONVERTED VARCHAR(200),
	DATE_DEFAULT DATE NOT NULL,
	PRIMARY KEY (DELIMITER_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema excel data loading
-- = = = = = = = = = =/
create table WHITE_XLS_MAN (
	XLS_MAN_ID BIGINT AUTO_INCREMENT NOT NULL,
	STRING_CONVERTED VARCHAR(200),
	TIMESTAMP_CONVERTED DATETIME,
	PRIMARY KEY (XLS_MAN_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema logging for LoadData
-- = = = = = = = = = =/
create table WHITE_LOAD_DATA (
	LOAD_DATA_ID BIGINT NOT NULL,
	LOAD_DATA_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (LOAD_DATA_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of ReplaceSchema logging for LoadData
-- = = = = = = = = = =/
create table WHITE_SUPPRESS_DEF_CHECK (
	DEF_CHECK_ID BIGINT NOT NULL,
	DEF_CHECK_NAME VARCHAR(200) NOT NULL,
	PRIMARY KEY (DEF_CHECK_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of date adjustment for LoadData
-- = = = = = = = = = =/
create table WHITE_DATE_ADJUSTMENT (
	DATE_ADJUSTMENT_ID BIGINT NOT NULL,
	ADJUSTED_DATE DATE COMMENT 'adjusted',
	ADJUSTED_DATETIME DATETIME,
	ADJUSTED_TIME TIME,
	ADJUSTED_INTEGER INTEGER,
	ADJUSTED_NAMED_STRING_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_NAMED_TYPED_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PINPOINT_STRING_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PINPOINT_TYPED_LONG BIGINT COMMENT 'adjusted',
	ADJUSTED_PLAIN_LONG BIGINT,
	ADJUSTED_STRING VARCHAR(32),
	PRIMARY KEY (DATE_ADJUSTMENT_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = = = = = = =
-- for the test of large text file
-- = = = = = = = = = =/
create table WHITE_LARGE_TEXT_FILE (
	LARGE_TEXT_FILE_ID BIGINT NOT NULL,
	LARGE_TEXT_FILE_TEXT TEXT,
	PRIMARY KEY (LARGE_TEXT_FILE_ID)
) ;

-- /= = = = = = = = = = = = = = = = = = = =
-- for the test of over relation non cache
-- = = = = = = = = = =/

create table WHITE_PERROTTA_OVER_MEMBER(
    MEMBER_ID INTEGER NOT NULL,
    MEMBER_NAME VARCHAR(180) NOT NULL,
    PRODUCT_ID INTEGER NOT NULL,
    TRACE_TYPE_CODE CHAR(3) NOT NULL,
    MACHO_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (MEMBER_ID)
);

create table WHITE_PERROTTA_OVER_MEMBER_MACHO(
    MACHO_CODE CHAR(3) NOT NULL,
    MACHO_NAME VARCHAR(200) NOT NULL,
    PRIMARY KEY (MACHO_CODE)
);

create table WHITE_PERROTTA_OVER_PRODUCT(
    PRODUCT_ID INTEGER NOT NULL,
    PRODUCT_NAME VARCHAR(50) NOT NULL,
    PRODUCT_NESTED_CODE CHAR(3) NOT NULL,
    PRIMARY KEY (PRODUCT_ID)
);

create table WHITE_PERROTTA_OVER_PRODUCT_NESTED(
    PRODUCT_NESTED_CODE CHAR(3) NOT NULL,
    PRODUCT_NESTED_NAME VARCHAR(50) NOT NULL,
    PRIMARY KEY (PRODUCT_NESTED_CODE)
);

create table WHITE_PERROTTA_OVER_TRACE(
    TRACE_ID BIGINT NOT NULL,
    PREVIOUS_PRODUCT_ID INTEGER NOT NULL,
    NEXT_PRODUCT_ID INTEGER NOT NULL,
    TRACE_TYPE_CODE CHAR(3) NOT NULL,
    UNIQUE (PREVIOUS_PRODUCT_ID, NEXT_PRODUCT_ID),
    PRIMARY KEY (TRACE_ID)
);

alter table WHITE_PERROTTA_OVER_MEMBER add constraint FK_WHITE_PERROTTA_OVER_MEMBER_PRODUCT
	foreign key (PRODUCT_ID) references WHITE_PERROTTA_OVER_PRODUCT (PRODUCT_ID) ;

alter table WHITE_PERROTTA_OVER_MEMBER add constraint FK_WHITE_PERROTTA_OVER_MEMBER_MACHO
	foreign key (MACHO_CODE) references WHITE_PERROTTA_OVER_MEMBER_MACHO (MACHO_CODE) ;

alter table WHITE_PERROTTA_OVER_PRODUCT add constraint FK_WHITE_PERROTTA_OVER_PRODUCT_NESTED
	foreign key (PRODUCT_NESTED_CODE) references WHITE_PERROTTA_OVER_PRODUCT_NESTED (PRODUCT_NESTED_CODE) ;

alter table WHITE_PERROTTA_OVER_TRACE add constraint FK_WHITE_PERROTTA_OVER_TRACE_PREVIOUS
	foreign key (PREVIOUS_PRODUCT_ID) references WHITE_PERROTTA_OVER_PRODUCT (PRODUCT_ID) ;

alter table WHITE_PERROTTA_OVER_TRACE add constraint FK_WHITE_PERROTTA_OVER_TRACE_NEXT
	foreign key (NEXT_PRODUCT_ID) references WHITE_PERROTTA_OVER_PRODUCT (PRODUCT_ID) ;


