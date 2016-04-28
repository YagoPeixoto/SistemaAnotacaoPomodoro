CREATE TABLE `sistemaAnotaçcao`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nome` VARCHAR(45) NULL COMMENT '',
  `sobreNome` VARCHAR(45) NULL COMMENT '',
  `dataNascimento` DATE NULL COMMENT '',
  `usuarioID` VARCHAR(45) NULL COMMENT '',
  `tempoPomodoro` INT NULL COMMENT '',
  `tempoDescanco` INT NULL COMMENT '',
  `tempoDescancoLongo` INT NULL COMMENT '',
  `sessoesTrabalho` INT NULL COMMENT '',
  PRIMARY KEY (`idUsuario`)  COMMENT '');
