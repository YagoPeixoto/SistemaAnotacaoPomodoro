CREATE TABLE `sistemaAnotacao`.`Anotacao` (
  `idAnotacao` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idUser` INT NOT NULL COMMENT '',
  `titulo` VARCHAR(100) NULL COMMENT '',
  `conteudo` TEXT(250) NULL COMMENT '',
  `lembrete` DATE NULL COMMENT '',
  `dataCriacao` DATE NULL COMMENT '',
  `ultimaModificacao` DATE NULL COMMENT '',
  `cor` VARCHAR(45) NULL COMMENT '',
  `idMarcacao` INT NULL COMMENT '',
  PRIMARY KEY (`idAnotacao`, `idUser`)  COMMENT '');
