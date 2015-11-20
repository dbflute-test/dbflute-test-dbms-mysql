#!/bin/bash

cd `dirname $0`

./percona/bin/mysql --defaults-file=./per.cnf --user=root --default-character-set=utf8
