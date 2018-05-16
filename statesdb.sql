-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema statesdb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `statesdb` ;

-- -----------------------------------------------------
-- Schema statesdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `statesdb` DEFAULT CHARACTER SET utf8 ;
USE `statesdb` ;

-- -----------------------------------------------------
-- Table `statesdb`.`state`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `statesdb`.`state` ;

CREATE TABLE IF NOT EXISTS `statesdb`.`state` (
  `abbreviation` CHAR(2) NOT NULL,
  `name` VARCHAR(30) NOT NULL,
  `capital` VARCHAR(100) NULL DEFAULT NULL,
  `population` INT(10) UNSIGNED NULL DEFAULT NULL,
  `latitude` DECIMAL(8,6) NULL DEFAULT NULL,
  `longitude` DECIMAL(9,6) NULL DEFAULT NULL,
  `flag_url` VARCHAR(1000) NULL DEFAULT NULL,
  `governor_first_name` VARCHAR(30) NULL DEFAULT NULL,
  `governor_last_name` VARCHAR(30) NULL DEFAULT NULL,
  `best_fast_food_chain` VARCHAR(100) NULL,
  PRIMARY KEY (`abbreviation`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statesdb`.`symbol`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `statesdb`.`symbol` ;

CREATE TABLE IF NOT EXISTS `statesdb`.`symbol` (
  `symbol_name` VARCHAR(20) NOT NULL,
  `description` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`symbol_name`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statesdb`.`state_symbol`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `statesdb`.`state_symbol` ;

CREATE TABLE IF NOT EXISTS `statesdb`.`state_symbol` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `abbreviation` CHAR(2) NULL DEFAULT NULL,
  `symbol_name` VARCHAR(20) NULL DEFAULT NULL,
  `symbol` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_abbreviation_state_idx` (`abbreviation` ASC),
  INDEX `fk_symbol_name_idx` (`symbol_name` ASC),
  CONSTRAINT `fk_abbreviation_state`
    FOREIGN KEY (`abbreviation`)
    REFERENCES `statesdb`.`state` (`abbreviation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_symbol_name`
    FOREIGN KEY (`symbol_name`)
    REFERENCES `statesdb`.`symbol` (`symbol_name`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `statesdb`.`state_cities`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `statesdb`.`state_cities` ;

CREATE TABLE IF NOT EXISTS `statesdb`.`state_cities` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NULL,
  `abbreviation` CHAR(2) NOT NULL COMMENT '																																																																											',
  `population` INT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_state_city_idx` (`abbreviation` ASC),
  CONSTRAINT `fk_state_city`
    FOREIGN KEY (`abbreviation`)
    REFERENCES `statesdb`.`state` (`abbreviation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE = '';
GRANT USAGE ON *.* TO statesuser@localhost;
 DROP USER statesuser@localhost;
SET SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE USER 'statesuser'@'localhost' IDENTIFIED BY 'statesuser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE `statesdb`.* TO 'statesuser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `statesdb`.`state`
-- -----------------------------------------------------
START TRANSACTION;
USE `statesdb`;
INSERT INTO `statesdb`.`state` (`abbreviation`, `name`, `capital`, `population`, `latitude`, `longitude`, `flag_url`, `governor_first_name`, `governor_last_name`, `best_fast_food_chain`) VALUES ('CO', 'Colorado ', 'Denver', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `statesdb`.`state` (`abbreviation`, `name`, `capital`, `population`, `latitude`, `longitude`, `flag_url`, `governor_first_name`, `governor_last_name`, `best_fast_food_chain`) VALUES ('TX', 'Texas', 'Austin', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `statesdb`.`symbol`
-- -----------------------------------------------------
START TRANSACTION;
USE `statesdb`;
INSERT INTO `statesdb`.`symbol` (`symbol_name`, `description`) VALUES ('bird', 'State Bird');
INSERT INTO `statesdb`.`symbol` (`symbol_name`, `description`) VALUES ('song', 'State Song or Hymn');
INSERT INTO `statesdb`.`symbol` (`symbol_name`, `description`) VALUES ('dinosaur', 'State Dinosaur');
INSERT INTO `statesdb`.`symbol` (`symbol_name`, `description`) VALUES ('flower', 'State Flower');

COMMIT;


-- -----------------------------------------------------
-- Data for table `statesdb`.`state_symbol`
-- -----------------------------------------------------
START TRANSACTION;
USE `statesdb`;
INSERT INTO `statesdb`.`state_symbol` (`id`, `abbreviation`, `symbol_name`, `symbol`) VALUES (1, 'CO', 'bird', 'Lark Bunting');
INSERT INTO `statesdb`.`state_symbol` (`id`, `abbreviation`, `symbol_name`, `symbol`) VALUES (2, 'CO', 'flower', 'Columbine');

COMMIT;
