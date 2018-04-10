DROP DATABASE IF EXISTS historydb;

CREATE DATABASE IF NOT EXISTS historydb;

-- DROP USER historyuser;

CREATE USER historyuser@localhost IDENTIFIED BY 'historyuser';

GRANT SELECT, INSERT, UPDATE, DELETE on historydb.* TO historyuser@localhost;
