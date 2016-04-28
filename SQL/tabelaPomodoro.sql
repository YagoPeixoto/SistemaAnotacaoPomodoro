CREATE TABLE `sistemaAnotacao`.`Pomodoro` (
  `idPomodoro` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idUsuario` INT NOT NULL COMMENT '',
  `idAnotacao` INT NULL COMMENT '',
  `dataInicio` DATE NULL COMMENT '',
  `dataFim` DATE NULL COMMENT '',
  PRIMARY KEY (`idPomodoro`, `idUsuario`)  COMMENT '');
