-- MySQL dump 10.13  Distrib 5.6.38, for osx10.9 (x86_64)
--
-- Host: localhost    Database: historydb
-- ------------------------------------------------------
-- Server version	5.6.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: historydb
--

/*!40000 DROP DATABASE IF EXISTS historydb*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `historydb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE historydb;

--
-- Table structure for table `president`
--

DROP TABLE IF EXISTS president;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE president (
  term int(11) NOT NULL,
  first_name varchar(32) NOT NULL,
  middle_name varchar(32) DEFAULT NULL,
  last_name varchar(32) NOT NULL,
  inauguration_date date DEFAULT NULL,
  date_left_office date DEFAULT NULL,
  elections_won tinyint(4) DEFAULT NULL,
  reason_left_office text,
  party varchar(64) DEFAULT NULL,
  PRIMARY KEY (term)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `president`
--

LOCK TABLES president WRITE;
/*!40000 ALTER TABLE president DISABLE KEYS */;
INSERT INTO president (term, first_name, middle_name, last_name, inauguration_date, date_left_office, elections_won, reason_left_office, party) VALUES (1,'George','','Washington','1789-07-01','1797-03-04',2,'Did not seek re-election','Independent'),(2,'John','','Adams','1797-03-04','1801-03-04',1,'Lost reelection','Federalist'),(3,'Thomas','','Jefferson','1801-03-04','1809-03-04',2,'Did not seek reelection','Democratic-Republican'),(4,'James','','Madison','1809-03-04','1817-03-04',2,'Did not seek reelection','Democratic-Republican'),(5,'James','','Monroe','1817-03-04','1825-03-04',2,'Did not seek reelection','Democratic-Republican'),(6,'John','Quincy','Adams','1825-03-04','1829-03-04',1,'Lost reelection','Democratic-Republican'),(7,'Andrew','','Jackson','1829-03-04','1837-03-04',2,'Did not seek reelection','Democrat'),(8,'Martin','','Van Buren','1837-03-04','1841-03-04',1,'Lost reelection','Democrat'),(9,'William','Henry','Harrison','1841-03-04','1841-04-04',1,'Died in office','Whig'),(10,'John','','Tyler','1841-04-04','1845-03-04',0,'Did not seek reelection','Whig'),(11,'James','Knox','Polk','1845-03-04','1849-03-04',1,'Did not seek reelection','Democrat'),(12,'Zachary','','Taylor','1849-03-04','1850-07-09',1,'Died in office','Whig'),(13,'Millard','','Fillmore','1850-07-09','1853-03-04',0,'Did not seek reelection','Whig'),(14,'Franklin','','Pierce','1853-03-04','1857-03-04',1,'Did not seek reelection','Democrat'),(15,'James','','Buchanan','1857-03-04','1861-03-04',1,'Did not seek reelection','Democrat'),(16,'Abraham','','Lincoln','1861-03-04','1865-04-15',1,'Assassinated','Republican'),(17,'Andrew','','Johnson','1865-04-15','1869-03-04',0,'Did not seek reelection','Democrat'),(18,'Ulysses','Simpson','Grant','1869-03-04','1877-03-04',2,'Did not seek reelection','Republican'),(19,'Rutherford','Birchard','Hayes','1877-03-04','1881-03-04',1,'Did not seek reelection','Republican'),(20,'James','Abram','Garfield','1881-03-04','1881-09-19',1,'Assassinated','Republican'),(21,'Chester','Alan','Arthur','1881-09-19','1885-03-04',0,'Did not seek reelection','Republican'),(22,'Grover','','Cleveland','1885-03-04','1889-03-04',1,'Lost reelection','Democrat'),(23,'Benjamin','','Harrison','1889-03-04','1893-03-04',1,'Lost reelection','Republican'),(24,'Grover','','Cleveland (2nd time)','1893-03-04','1897-03-04',1,'Did not seek reelection','Democrat'),(25,'William','','McKinley','1897-03-04','1901-09-14',2,'Assassinated','Republican'),(26,'Theodore','','Roosevelt','1901-09-14','1909-03-04',1,'Did not seek reelection','Republican'),(27,'William','Henry','Taft','1909-03-04','1913-03-04',1,'Lost reelection','Republican'),(28,'Woodrow','','Wilson','1913-03-04','1921-03-04',2,'Did not seek reelection','Democrat'),(29,'Warren','Gamaliel','Harding','1921-03-04','1923-08-02',1,'Died in office','Republican'),(30,'Calvin','','Coolidge','1923-08-02','1929-03-04',1,'Did not seek reelection','Republican'),(31,'Herbert','Clark','Hoover','1929-03-04','1933-03-04',1,'Lost reelection','Republican'),(32,'Franklin','Delano','Roosevelt','1933-03-04','1945-04-12',4,'Died in office','Democrat'),(33,'Harry','S','Truman','1945-04-12','1953-01-20',1,'Did not seek reelection','Democrat'),(34,'Dwight','David','Eisenhower','1953-01-20','1961-01-20',2,'Term ended','Republican'),(35,'John','Fitzgerald','Kennedy','1961-01-20','1963-11-22',1,'Assassinated','Democrat'),(36,'Lyndon','Baines','Johnson','1963-11-22','1969-01-20',1,'Did not seek reelection','Democrat'),(37,'Richard','Milhous','Nixon','1969-01-20','1974-08-09',2,'Resigned','Republican'),(38,'Gerald','Rudolph','Ford','1974-08-09','1977-01-20',0,'Lost election','Republican'),(39,'James','Earl','Carter','1977-01-20','1981-01-20',1,'Lost reelection','Democrat'),(40,'Ronald','Wilson','Reagan','1981-01-20','1989-01-20',2,'Term ended','Republican'),(41,'George','Herbert Walker','Bush','1989-01-20','1993-01-20',1,'Lost reelection','Republican'),(42,'William','Jefferson','Clinton','1993-01-20','2001-01-20',2,'Term ended','Democrat'),(43,'George','Walker','Bush','2001-01-20','2009-01-20',2,'Term ended','Republican'),(44,'Barack','Hussein','Obama','2009-01-20','2017-01-20',2,'Term ended','Democrat'),(45,'Donald','John','Trump','2017-01-20',NULL,1,' ','Republican');
/*!40000 ALTER TABLE president ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS state;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE state (
  abbreviation char(2) NOT NULL,
  `name` varchar(32) NOT NULL,
  capital varchar(64) DEFAULT NULL,
  admission_date date DEFAULT NULL,
  latitude double DEFAULT NULL,
  longitude double DEFAULT NULL,
  capital_population int(11) DEFAULT NULL,
  state_population int(11) DEFAULT NULL,
  PRIMARY KEY (abbreviation)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES state WRITE;
/*!40000 ALTER TABLE state DISABLE KEYS */;
INSERT INTO state (abbreviation, name, capital, admission_date, latitude, longitude, capital_population, state_population) VALUES ('AK','Alaska','Juneau','1959-01-03',58.29974,-134.406794,31275,741894),('AL','Alabama','Montgomery','1819-12-14',32.38012,-86.300629,205764,4863300),('AR','Arkansas','Little Rock','1836-06-15',34.748655,-92.274494,193524,2988248),('AZ','Arizona','Phoenix','1912-02-14',33.44826,-112.075774,1445632,6931071),('CA','California','Sacramento','1850-09-09',38.579065,-121.491014,466488,39250017),('CO','Colorado','Denver','1876-08-01',39.74001,-104.992259,600158,5540545),('CT','Connecticut','Hartford','1788-01-09',41.763325,-72.674069,124775,3576452),('DE','Delaware','Dover','1787-12-07',39.158035,-75.524734,36047,952065),('FL','Florida','Tallahassee','1845-03-03',30.439775,-84.280649,181376,20612439),('GA','Georgia','Atlanta','1788-01-02',33.748315,-84.391109,420003,10310371),('HI','Hawaii','Honolulu','1959-08-21',21.30477,-157.857614,337256,1428557),('IA','Iowa','Des Moines','1846-12-28',41.58979,-93.615659,203433,3134693),('ID','Idaho','Boise','1890-07-03',43.60698,-116.193409,205671,1683140),('IL','Illinois','Springfield','1818-12-03',39.801055,-89.643604,116250,12801539),('IN','Indiana','Indianapolis','1816-12-11',39.76691,-86.149964,820445,6633053),('KS','Kansas','Topeka','1861-01-29',39.049285,-95.671184,127473,2907289),('KY','Kentucky','Frankfort','1792-06-01',38.19507,-84.878694,25527,4436974),('LA','Louisiana','Baton Rouge','1812-04-30',30.443345,-91.186994,229493,4681666),('MA','Massachusetts','Boston','1788-02-06',42.358635,-71.056699,617594,6811779),('MD','Maryland','Annapolis','1788-04-28',38.9767,-76.489934,38394,6016447),('ME','Maine','Augusta','1820-03-15',44.318036,-69.776218,19136,1331479),('MI','Michigan','Lansing','1837-01-26',42.73194,-84.552249,114297,9928300),('MN','Minnesota','Saint Paul','1858-05-11',44.943829,-93.093326,285068,5519952),('MO','Missouri','Jefferson City','1821-08-10',38.577515,-92.177839,43079,6093000),('MS','Mississippi','Jackson','1817-12-10',32.29869,-90.180489,173514,2988726),('MT','Montana','Helana','1889-11-08',46.58976,-112.021202,28190,1042520),('NC','North Carolina','Raleigh','1789-11-21',35.78551,-78.642669,403892,10146788),('ND','North Dakota','Bismarck','1889-11-02',46.805372,-100.779334,61272,757952),('NE','Nebraska','Lincoln','1867-03-01',40.81362,-96.707739,258379,1907116),('NH','New Hampshire','Concord','1788-06-21',43.20725,-71.536604,42695,1334795),('NJ','New Jersey','Trenton','1787-12-18',40.217875,-74.759404,84913,8944469),('NM','New Mexico','Santa Fe','1912-01-06',35.691543,-105.937406,67947,2081015),('NV','Nevada','Carson City','1864-10-31',39.164885,-119.766999,55274,2940058),('NY','New York','Albany','1788-07-26',42.651445,-73.755254,97856,19745289),('OH','Ohio','Columbus','1803-03-01',39.96196,-83.002984,787033,11614373),('OK','Oklahoma','Oklahoma City','1907-11-16',35.472015,-97.520354,579999,3923561),('OR','Oregon','Salem','1859-02-14',44.93326,-123.043814,154637,4093465),('PA','Pennsylvania','Harrisburg','1787-12-12',40.259865,-76.88223,49528,12784227),('RI','Rhode Island','Providence','1790-05-29',41.823875,-71.411994,178042,1056426),('SC','South Carolina','Columbia','1788-05-23',33.99855,-81.045249,129272,4961119),('SD','South Dakota','Pierre','1889-11-02',44.368924,-100.350158,13646,865454),('TN','Tennessee','Nashville','1796-06-01',36.167783,-86.778365,601222,6651194),('TX','Texas','Austin','1845-12-29',30.267605,-97.742984,790390,27862596),('UT','Utah','Salt Lake City','1896-01-04',40.759505,-111.888229,186440,3051217),('VA','Virginia','Richmond','1788-06-25',37.5407,-77.433654,204214,8411808),('VT','Vermont','Montpelier','1791-03-04',44.260299,-72.576264,7855,624594),('WA','Washington','Olympia','1889-11-11',47.039231,-122.891366,46478,7288000),('WI','Wisconsin','Madison','1848-05-29',43.07295,-89.386694,233209,5778708),('WV','West Virginia','Charleston','1863-06-20',38.350195,-81.638989,51400,1831102),('WY','Wyoming','Cheyenne','1890-07-10',41.134815,-104.821544,59466,585501);
/*!40000 ALTER TABLE state ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-13 13:45:42
