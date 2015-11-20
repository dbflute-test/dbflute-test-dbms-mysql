#!/bin/bash

cd `dirname $0`

./percona/bin/mysqld --defaults-file=./per.cnf
