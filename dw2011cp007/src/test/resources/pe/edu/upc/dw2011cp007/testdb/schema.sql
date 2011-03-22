drop database dw2011cp007;
create database dw2011cp007;
use dw2011cp007;

drop table if exists cp_tb_pais;
drop table if exists cp_tb_cine;
drop table if exists cp_tb_artista;
drop table if exists cp_tb_tipopelicula;
drop table if exists cp_tb_pelicula;
drop table if exists cp_tb_peliculaartista;
drop table if exists cp_tb_peliculacine;
drop table if exists cp_tb_horario;


create table cp_tb_pais (
  id_pais int not null,
  no_pais varchar(50)
);
alter table cp_tb_pais add constraint cp_pk_pais primary key (id_pais);
alter table cp_tb_pais modify id_pais int not null auto_increment;

create table cp_tb_cine (
  id_cine int not null,
  no_cine varchar(50)
);
alter table cp_tb_cine add constraint cp_pk_cine primary key (id_cine);
alter table cp_tb_cine modify id_cine int not null auto_increment;

create table cp_tb_artista (
  id_artista int not null,
  no_artista varchar(50)
);
alter table cp_tb_artista add constraint cp_pk_artista primary key (id_artista);
alter table cp_tb_artista modify id_artista int not null auto_increment;

create table cp_tb_tipopelicula (
  id_tipopelicula int not null,
  no_tipopelicula varchar(50)
);
alter table cp_tb_tipopelicula add constraint cp_pk_tipopelicula primary key (id_tipopelicula);
alter table cp_tb_tipopelicula modify id_tipopelicula int not null auto_increment;

create table cp_tb_pelicula (
  id_pelicula                 int not null,
  no_pelicula                 varchar(50),
  id_pais                     int,
  id_tipopelicula             int,
  co_clasificacionpelicula    char(3),/*INF, TOD, +14, +18*/
  fl_doblada                  boolean,
  fl_en3d                     boolean,
  fl_enestreno                boolean,
  fl_encartelera              boolean
);
alter table cp_tb_pelicula add constraint cp_pk_pelicula primary key (id_pelicula);
alter table cp_tb_pelicula add constraint cp_fk_pelpai foreign key (id_pais) references cp_tb_pais (id_pais);
alter table cp_tb_pelicula add constraint cp_fk_peltippel foreign key (id_tipopelicula) references cp_tb_tipopelicula (id_tipopelicula);
alter table cp_tb_pelicula modify id_pelicula int not null auto_increment;

create table cp_tb_peliculaartista (
  id_pelicula int not null,
  id_artista int not null
);
alter table cp_tb_peliculaartista add constraint cp_pk_pelart primary key (id_pelicula,id_artista);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_art foreign key (id_artista) references cp_tb_artista (id_artista);

create table cp_tb_peliculacine (
  id_pelicula int not null,
  id_cine int not null
);
alter table cp_tb_peliculacine add constraint cp_pk_pelcin primary key (id_pelicula,id_cine);
alter table cp_tb_peliculacine add constraint cp_fk_pelcin_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_peliculacine add constraint cp_fk_pelcin_cin foreign key (id_cine) references cp_tb_cine (id_cine);

create table cp_tb_horario (
  id_horario                  int not null,
  id_pelicula                 int not null,
  id_cine                     int not null,
  fe_diahorario               date,
  no_horashorario             varchar(100),
  fl_doblada                  boolean,
  fl_en3d                     boolean
);
alter table cp_tb_horario add constraint cp_pk_horario primary key (id_horario,id_pelicula,id_cine);
alter table cp_tb_horario add constraint cp_fk_hor_pelcin foreign key (id_pelicula,id_cine) references cp_tb_peliculacine (id_pelicula, id_cine);
alter table cp_tb_horario modify id_horario int not null auto_increment;

-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_empleado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dw2011cp007`.`cp_tb_empleado` ;

CREATE  TABLE IF NOT EXISTS `dw2011cp007`.`cp_tb_empleado` (
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
  `feRegistro` DATETIME NOT NULL ,
  PRIMARY KEY (`coCodigo`) ,
  INDEX `JefeInmediato` (`coJefeInmediato` ASC) ,
  INDEX `fk_jefeInmediato` (`coJefeInmediato` ASC) ,
  CONSTRAINT `fk_jefeInmediato`
    FOREIGN KEY (`coJefeInmediato` )
    REFERENCES `dw2011cp007`.`cp_tb_empleado` (`coCodigo` )
    ON DELETE SET NULL
    ON UPDATE NO ACTION);    
    
  
-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_Cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dw2011cp007`.`cp_tb_Cliente` ;

CREATE  TABLE IF NOT EXISTS `dw2011cp007`.`cp_tb_Cliente` (
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
  `feRegistro` DATETIME NOT NULL ,
  PRIMARY KEY (`coCliente`) ,
  UNIQUE INDEX `nologin_UNIQUE` (`nologin` ASC) );


-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_Perfil`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dw2011cp007`.`cp_tb_Perfil` ;

CREATE  TABLE IF NOT EXISTS `dw2011cp007`.`cp_tb_Perfil` (
  `idPerfil` INT NOT NULL AUTO_INCREMENT ,
  `noPerfil` VARCHAR(30) NOT NULL ,
  `txtDescripcion` VARCHAR(60) NULL ,
  `nuvigencia` INT NULL ,
  `coestadoPerfil` CHAR(1) NULL ,
  PRIMARY KEY (`idPerfil`) );


-- -----------------------------------------------------
-- Table `dw2011cp007`.`cp_tb_funcion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dw2011cp007`.`cp_tb_funcion` ;

CREATE  TABLE IF NOT EXISTS `dw2011cp007`.`cp_tb_funcion` (
  `idfuncion` INT NOT NULL AUTO_INCREMENT ,
  `nofuncion` VARCHAR(30) NOT NULL ,
  `txtdescripcion` VARCHAR(60) NULL ,
  PRIMARY KEY (`idfuncion`) );


-- -----------------------------------------------------
-- Table `dw2011cp007`.`Perfil_has_cp_tb_funcion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `dw2011cp007`.`Perfil_has_cp_tb_funcion` ;

CREATE  TABLE IF NOT EXISTS `dw2011cp007`.`Perfil_has_cp_tb_funcion` (
  `Perfil_idPerfil` INT NOT NULL ,
  `cp_tb_funcion_idfuncion` INT NOT NULL ,
  PRIMARY KEY (`Perfil_idPerfil`, `cp_tb_funcion_idfuncion`) ,
  INDEX `fk_Perfil_has_cp_tb_funcion_cp_tb_funcion1` (`cp_tb_funcion_idfuncion` ASC) ,
  INDEX `fk_Perfil_has_cp_tb_funcion_Perfil1` (`Perfil_idPerfil` ASC) ,
  CONSTRAINT `fk_Perfil_has_cp_tb_funcion_Perfil1`
    FOREIGN KEY (`Perfil_idPerfil` )
    REFERENCES `dw2011cp007`.`cp_tb_Perfil` (`idPerfil` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Perfil_has_cp_tb_funcion_cp_tb_funcion1`
    FOREIGN KEY (`cp_tb_funcion_idfuncion` )
    REFERENCES `dw2011cp007`.`cp_tb_funcion` (`idfuncion` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);