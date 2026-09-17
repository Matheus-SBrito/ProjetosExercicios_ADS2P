-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Cliente` (
  `cpf` CHAR(11) NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `telefone` CHAR(11) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`cpf`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tipo_Equipamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tipo_Equipamento` (
  `idTipo_Equipamento` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipo_Equipamento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Equipamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Equipamento` (
  `idEquipamento` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(45) NOT NULL,
  `n_serie` VARCHAR(45) NOT NULL,
  `Cliente_cpf` CHAR(11) NOT NULL,
  `Tipo_Equipamento_idTipo_Equipamento` INT NOT NULL,
  PRIMARY KEY (`idEquipamento`),
  UNIQUE INDEX `n_serie_UNIQUE` (`n_serie` ASC) VISIBLE,
  INDEX `fk_Equipamento_Cliente1_idx` (`Cliente_cpf` ASC) VISIBLE,
  INDEX `fk_Equipamento_Tipo_Equipamento1_idx` (`Tipo_Equipamento_idTipo_Equipamento` ASC) VISIBLE,
  CONSTRAINT `fk_Equipamento_Cliente1`
    FOREIGN KEY (`Cliente_cpf`)
    REFERENCES `mydb`.`Cliente` (`cpf`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Equipamento_Tipo_Equipamento1`
    FOREIGN KEY (`Tipo_Equipamento_idTipo_Equipamento`)
    REFERENCES `mydb`.`Tipo_Equipamento` (`idTipo_Equipamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
COMMENT = '						';


-- -----------------------------------------------------
-- Table `mydb`.`PC`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PC` (
  `processador` VARCHAR(45) NOT NULL,
  `memoria` VARCHAR(45) NOT NULL,
  `Equipamento_idEquipamento` INT NOT NULL,
  PRIMARY KEY (`Equipamento_idEquipamento`),
  CONSTRAINT `fk_PC_Equipamento`
    FOREIGN KEY (`Equipamento_idEquipamento`)
    REFERENCES `mydb`.`Equipamento` (`idEquipamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Impressora`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Impressora` (
  `resolucao` INT NOT NULL,
  `Equipamento_idEquipamento` INT NOT NULL,
  PRIMARY KEY (`Equipamento_idEquipamento`),
  CONSTRAINT `fk_Impressora_Equipamento1`
    FOREIGN KEY (`Equipamento_idEquipamento`)
    REFERENCES `mydb`.`Equipamento` (`idEquipamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tablet`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tablet` (
  `imei` INT NULL,
  `Equipamento_idEquipamento` INT NOT NULL,
  PRIMARY KEY (`Equipamento_idEquipamento`),
  CONSTRAINT `fk_Tablet_Equipamento1`
    FOREIGN KEY (`Equipamento_idEquipamento`)
    REFERENCES `mydb`.`Equipamento` (`idEquipamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Tecnico` (
  `id_tecnico` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `especialidade` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_tecnico`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Equipamento_has_Tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Equipamento_has_Tecnico` (
  `Equipamento_idEquipamento` INT NOT NULL,
  `Tecnico_id_tecnico` INT NOT NULL,
  PRIMARY KEY (`Equipamento_idEquipamento`, `Tecnico_id_tecnico`),
  INDEX `fk_Equipamento_has_Tecnico_Tecnico1_idx` (`Tecnico_id_tecnico` ASC) VISIBLE,
  INDEX `fk_Equipamento_has_Tecnico_Equipamento1_idx` (`Equipamento_idEquipamento` ASC) VISIBLE,
  CONSTRAINT `fk_Equipamento_has_Tecnico_Equipamento1`
    FOREIGN KEY (`Equipamento_idEquipamento`)
    REFERENCES `mydb`.`Equipamento` (`idEquipamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Equipamento_has_Tecnico_Tecnico1`
    FOREIGN KEY (`Tecnico_id_tecnico`)
    REFERENCES `mydb`.`Tecnico` (`id_tecnico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Peca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Peca` (
  `id_peca` INT NOT NULL,
  `nome_peca` VARCHAR(45) NOT NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`id_peca`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Peca_has_Equipamento_has_Tecnico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Peca_has_Equipamento_has_Tecnico` (
  `Peca_id_peca` INT NOT NULL,
  `Equipamento_has_Tecnico_Equipamento_idEquipamento` INT NOT NULL,
  `Equipamento_has_Tecnico_Tecnico_id_tecnico` INT NOT NULL,
  `qtd` INT NOT NULL,
  PRIMARY KEY (`Peca_id_peca`, `Equipamento_has_Tecnico_Equipamento_idEquipamento`, `Equipamento_has_Tecnico_Tecnico_id_tecnico`),
  INDEX `fk_Peca_has_Equipamento_has_Tecnico_Equipamento_has_Tecnico_idx` (`Equipamento_has_Tecnico_Equipamento_idEquipamento` ASC, `Equipamento_has_Tecnico_Tecnico_id_tecnico` ASC) VISIBLE,
  INDEX `fk_Peca_has_Equipamento_has_Tecnico_Peca1_idx` (`Peca_id_peca` ASC) VISIBLE,
  CONSTRAINT `fk_Peca_has_Equipamento_has_Tecnico_Peca1`
    FOREIGN KEY (`Peca_id_peca`)
    REFERENCES `mydb`.`Peca` (`id_peca`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Peca_has_Equipamento_has_Tecnico_Equipamento_has_Tecnico1`
    FOREIGN KEY (`Equipamento_has_Tecnico_Equipamento_idEquipamento` , `Equipamento_has_Tecnico_Tecnico_id_tecnico`)
    REFERENCES `mydb`.`Equipamento_has_Tecnico` (`Equipamento_idEquipamento` , `Tecnico_id_tecnico`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
