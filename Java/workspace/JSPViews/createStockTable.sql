-- "Symbol","Name","LastSale","MarketCap","IPOyear","Sector","industry","Summary Quote",
-- "DDD","3D Systems Corporation","10.15","$1.16B","n/a","Technology","Computer Software: Prepackaged Software","https://www.nasdaq.com/symbol/ddd",

USE stockdb;

DROP TABLE IF EXISTS symbol;

CREATE TABLE symbol (
  symbol VARCHAR(5) PRIMARY KEY,
  company_name VARCHAR(100) NOT NULL,
  quote DECIMAL(10,2),
  sector VARCHAR(48),
  industry VARCHAR(128)
);


LOAD DATA LOCAL INFILE 'companylist.csv'
     INTO TABLE symbol
     FIELDS TERMINATED BY ','
     ENCLOSED BY '"'
     ESCAPED BY '%'
     LINES TERMINATED BY '\r\n'
     IGNORE 1 LINES
     ( symbol, company_name, quote, @dummy, @dummy, sector, industry, @dummy )
     ;

SHOW WARNINGS;

