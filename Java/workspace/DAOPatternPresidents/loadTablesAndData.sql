
-- #	First	Middle	Last	Inagurated	Left office	Elections won	Reason left office	Party
-- 1	George		Washington	July 1, 1789	March 4, 1797	2	Did not seek re-election	Independent

USE historydb;

DROP TABLE IF EXISTS president;

CREATE TABLE president (
  term INTEGER PRIMARY KEY,
  first_name VARCHAR(32) NOT NULL,
  middle_name VARCHAR(32),
  last_name VARCHAR(32) NOT NULL,
  inauguration_date DATE,
  date_left_office DATE NULL DEFAULT NULL,
  elections_won TINYINT,
  reason_left_office TEXT,
  party VARCHAR(64)
);


LOAD DATA LOCAL INFILE 'presidents.tsv'
     INTO TABLE president
     FIELDS TERMINATED BY '\t'
     IGNORE 1 LINES
     ( term, first_name, middle_name, last_name,
       @inaug, @leftoffice,
       elections_won, reason_left_office, party )
     SET inauguration_date = STR_TO_DATE( @inaug, '%M %e, %Y' ),
         date_left_office = CASE @leftoffice WHEN NULL THEN NULL WHEN '' THEN NULL ELSE STR_TO_DATE( @leftoffice, '%M %e, %Y' ) END
     ;

SHOW WARNINGS;

-- id,abbrev,state,capital,admission_date,latitude,longitude,population
-- 1,AL,Alabama,Montgomery,Dec 14 1819,32.380120,-86.300629,205764

DROP TABLE IF EXISTS state;

CREATE TABLE state (
  abbreviation CHAR(2) NOT NULL PRIMARY KEY,
  name VARCHAR(32) NOT NULL,
  capital VARCHAR(64),
  admission_date DATE,
  latitude DOUBLE,
  longitude DOUBLE,
  capital_population INTEGER, 
  state_population INTEGER
);


LOAD DATA LOCAL INFILE 'states.csv'
     INTO TABLE state
     FIELDS TERMINATED BY ','
     IGNORE 1 LINES
     ( @dummy, abbreviation, name, capital, @admitdate, latitude, longitude, capital_population, state_population )
     SET admission_date = STR_TO_DATE( @admitdate, '%b %e %Y' )
     ;

SHOW WARNINGS;

