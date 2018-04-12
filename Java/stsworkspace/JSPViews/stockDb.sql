DROP DATABASE IF EXISTS stockdb;

CREATE DATABASE IF NOT EXISTS stockdb;

-- DROP USER stockuser;

CREATE USER stockuser@localhost IDENTIFIED BY 'stockuser';

GRANT SELECT, INSERT, UPDATE, DELETE on stockdb.* TO stockuser@localhost;
