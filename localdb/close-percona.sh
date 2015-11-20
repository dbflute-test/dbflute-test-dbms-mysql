#!/bin/bash

cd `dirname $0`

./percona/bin/mysqladmin --defaults-file=./per.cnf -u root shutdown -p
