CREATE  TABLE cp_tb_empleado (
  `coCodigo` VARCHAR(20) NOT NULL ,
  `noApePaterno` VARCHAR(45) NULL DEFAULT NULL ,
  `noApeMaterno` VARCHAR(45) NULL DEFAULT NULL ,
  `noNombre` VARCHAR(45) NULL DEFAULT NULL ,
  `cotipodoc` CHAR(2) NULL DEFAULT NULL ,
  `nudocumento` CHAR(11) NULL DEFAULT NULL ,
  `txtemail` VARCHAR(45) NULL DEFAULT NULL ,
  `noUnidadTrabajo` VARCHAR(45) NULL DEFAULT NULL ,
  `noPuestoTrabajo` VARCHAR(45) NULL DEFAULT NULL ,
  `noTelefono` VARCHAR(10) NULL DEFAULT NULL ,
  `noAnexo` VARCHAR(4) NULL DEFAULT NULL ,
  `coJefeInmediato` VARCHAR(20) NULL DEFAULT NULL ,
  `noContrasena` VARCHAR(20) NOT NULL ,
  `coEstadoEmpleado` CHAR(1) NULL DEFAULT NULL ,
  `coEstadoPassword` CHAR(1) NULL DEFAULT NULL ,
  `feRegistro` DATETIME NOT NULL );
      
    
  
-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_Cliente`
-- -----------------------------------------------------

CREATE  TABLE `cp_tb_Cliente` (
  `coCliente` INT NOT NULL AUTO_INCREMENT ,
  `nologin` VARCHAR(45) NOT NULL ,
  `noApePaterno` VARCHAR(45) NULL DEFAULT NULL ,
  `noApeMaterno` VARCHAR(45) NULL DEFAULT NULL ,
  `noNombre` VARCHAR(45) NULL DEFAULT NULL ,
  `flPremium` TINYINT(1) NULL DEFAULT NULL ,
  `txtemail` VARCHAR(45) NULL DEFAULT NULL ,
  `cotipodoc` VARCHAR(45) NULL DEFAULT NULL ,
  `nudocumento` CHAR(11) NULL DEFAULT NULL ,
  `noTelefono` VARCHAR(10) NULL DEFAULT NULL ,
  `txtDireccion` VARCHAR(60) NULL DEFAULT NULL ,
  `noContrasena` VARCHAR(20) NULL DEFAULT NULL ,
  `coEstadoUsuario` CHAR(1) NULL DEFAULT NULL ,
  `coEstadoPassword` CHAR(1) NULL DEFAULT NULL ,
  `feRegistro` DATETIME NOT NULL);

-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_Perfil`
-- -----------------------------------------------------

CREATE  TABLE `cp_tb_Perfil` (
  `idPerfil` INT NOT NULL AUTO_INCREMENT ,
  `noPerfil` VARCHAR(30) NOT NULL ,
  `txtDescripcion` VARCHAR(60) NULL ,
  `nuvigencia` INT NULL ,
  `coestadoPerfil` CHAR(1) NULL ,
  PRIMARY KEY (`idPerfil`) );


-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_funcion`
-- -----------------------------------------------------

CREATE  TABLE `cp_tb_funcion` (
  `idfuncion` INT NOT NULL AUTO_INCREMENT ,
  `nofuncion` VARCHAR(30) NOT NULL ,
  `txtdescripcion` VARCHAR(60) NULL ,
  PRIMARY KEY (`idfuncion`) );


-- -----------------------------------------------------
-- Table `dw2011cp007`.`Perfil_has_cp_tb_funcion`
-- -----------------------------------------------------

CREATE  TABLE `Perfil_has_cp_tb_funcion` (
  `Perfil_idPerfil` INT NOT NULL ,
  `cp_tb_funcion_idfuncion` INT NOT NULL ,
  PRIMARY KEY (`Perfil_idPerfil`, `cp_tb_funcion_idfuncion`));
      
  
  
-- -----------------------------------------------------
-- Table `dw2011cp007`.Tablas usadas por Spring Security
-- -----------------------------------------------------
  
  create table users(
      username varchar(50) not null primary key,
      password varchar(50) not null,
      enabled boolean not null);

  create table authorities (
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references users(username));
      create unique index ix_auth_username on authorities (username,authority);
