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
  `HorGim` VARCHAR(11) NOT NULL,
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
  `GimPre` INT NOT NULL,
  PRIMARY KEY (`Id`),
  FOREIGN KEY (`GimPre`) REFERENCES `gimnasio` (`CodGim`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION)
ENGINE = InnoDB;

INSERT INTO gimnasio VALUES (NULL,'El Calvario','C/ Frenesi Nº 17','08:00-23:00','Crossfit, Musculación'),
						   (NULL,'La Rosaleda','C/ Marte Nº 09','09:00-22:00','Spinning, Aerobic'),
						   (NULL,'Gold Gym','C/ Santa Monica Nº 01','08:00-23:00','Halterofilia, Musculación'),
						   (NULL,'Arnold','C/ Ventali Nº 04','10:00-23:00','Clases orientadas'),
						   (NULL,'Parlero','C/ Mariana Nº 20','08:00-23:00','Musculación');

INSERT INTO persona VALUES (NULL,'75902166A','Pedro Garcia', 1),
						   (NULL,'69382199T','Juan Alvarado', 3),
						   (NULL,'89265811Z','Alfredo Martinez', 4),
						   (NULL,'72087688P','Martina Fernandez', 5),
						   (NULL,'89673688Y','Jorge Tabet', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE IF NOT EXISTS `acceso` (
  `usuario` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `clave` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`usuario`, `clave`) VALUES
('admin', '123456'),
('ismael', 'ismael13');


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;