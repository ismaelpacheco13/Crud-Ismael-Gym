-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ismaelgym
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ismaelgym
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ismaelgym` ;
USE `ismaelgym` ;

-- -----------------------------------------------------
-- Table `ismaelgym`.`gimnasio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ismaelgym`.`gimnasio` (
  `CodGim` INT NOT NULL AUTO_INCREMENT,
  `NomGim` VARCHAR(45) NOT NULL,
  `DirGim` VARCHAR(60) NOT NULL,
  `HorGim` VARCHAR(5) NOT NULL,
  `ClaGim` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`CodGim`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ismaelgym`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ismaelgym`.`persona` (
  `Id` INT NOT NULL AUTO_INCREMENT,
  `DNI` CHAR(9) NOT NULL,
  `Nombres` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`Id`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
