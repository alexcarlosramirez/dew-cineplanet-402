drop database dw2011cp007;
create database dw2011cp007;
use dw2011cp007;

-- =============================================================================
-- TABLAS DE MANTENIMIENTO
-- =============================================================================

-- TABLA cp_tb_pais
create table cp_tb_pais (
  id_pais int not null,
  no_pais varchar(50)
);
alter table cp_tb_pais add constraint cp_pk_pais primary key (id_pais);
alter table cp_tb_pais modify id_pais int not null auto_increment;

-- TABLA cp_tb_artista
create table cp_tb_artista (
  id_artista int not null,
  no_artista varchar(50)
);
alter table cp_tb_artista add constraint cp_pk_artista primary key (id_artista);
alter table cp_tb_artista modify id_artista int not null auto_increment;

-- TABLA cp_tb_tipopelicula
create table cp_tb_tipopelicula (
  id_tipopelicula int not null,
  no_tipopelicula varchar(50)
);
alter table cp_tb_tipopelicula add constraint cp_pk_tipopelicula primary key (id_tipopelicula);
alter table cp_tb_tipopelicula modify id_tipopelicula int not null auto_increment;

-- TABLA cp_tb_tipoproducto
create table cp_tb_tipoproducto (
  id_tipoproducto             int not null,
  no_tipoproducto             varchar(50)
);
alter table cp_tb_tipoproducto add constraint cp_pk_tipoproducto primary key (id_tipoproducto);

-- TABLA cp_tb_producto
create table cp_tb_producto (
  id_producto                 int not null,
  id_tipoproducto             int not null,
  co_producto                 char(5),
  no_producto                 varchar(50),
  ss_producto                 double(5,2),
  nu_stockproducto            int,
  tx_rutaimagen               varchar(10),
  fl_solopremiun              boolean
);
alter table cp_tb_producto add constraint cp_pk_producto primary key (id_producto);
alter table cp_tb_producto add constraint cp_fk_pro_tippro foreign key (id_tipoproducto) references cp_tb_tipoproducto (id_tipoproducto);
alter table cp_tb_producto modify id_producto int not null auto_increment;

-- TABLA cp_tb_cine
create table cp_tb_cine (
  id_cine int not null,
  no_cine varchar(50),
  tx_observacion varchar(100),
  tx_direccion varchar(50),
  tx_telefono varchar(50),
  tx_rutaimagen varchar(10)
);
alter table cp_tb_cine add constraint cp_pk_cine primary key (id_cine);
alter table cp_tb_cine modify id_cine int not null auto_increment;

-- TABLA cp_tb_pelicula
create table cp_tb_pelicula (
  id_pelicula                 int not null,
  no_pelicula                 varchar(50),
  id_pais                     int,
  id_tipopelicula             int,
  co_clasificacionpelicula    char(3),/*INF, TOD, +14, +18*/
  tx_sinopsis                 varchar(300),
  tx_nombreimagen             varchar(10),
  fl_doblada                  boolean,
  fl_en3d                     boolean,
  fl_enestreno                boolean,
  fl_encartelera              boolean
);
alter table cp_tb_pelicula add constraint cp_pk_pelicula primary key (id_pelicula);
alter table cp_tb_pelicula add constraint cp_fk_pelpai foreign key (id_pais) references cp_tb_pais (id_pais);
alter table cp_tb_pelicula add constraint cp_fk_peltippel foreign key (id_tipopelicula) references cp_tb_tipopelicula (id_tipopelicula);
alter table cp_tb_pelicula modify id_pelicula int not null auto_increment;

-- TABLA cp_tb_peliculaartista
create table cp_tb_peliculaartista (
  id_pelicula int not null,
  id_artista int not null
);
alter table cp_tb_peliculaartista add constraint cp_pk_pelart primary key (id_pelicula,id_artista);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_art foreign key (id_artista) references cp_tb_artista (id_artista);

-- TABLA cp_tb_peliculacine
create table cp_tb_peliculacine (
  id_pelicula int not null,
  id_cine int not null
);
alter table cp_tb_peliculacine add constraint cp_pk_pelcin primary key (id_pelicula,id_cine);
alter table cp_tb_peliculacine add constraint cp_fk_pelcin_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_peliculacine add constraint cp_fk_pelcin_cin foreign key (id_cine) references cp_tb_cine (id_cine);

-- TABLA cp_tb_productopelicula
create table cp_tb_productopelicula (
  id_producto                 int not null,
  id_pelicula                 int not null
);
alter table cp_tb_productopelicula add constraint cp_pk_pelpro primary key (id_producto,id_pelicula);
alter table cp_tb_productopelicula add constraint cp_fk_pelpro_pro foreign key (id_producto) references cp_tb_producto (id_producto);
alter table cp_tb_productopelicula add constraint cp_fk_pelpro_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);

-- TABLA cp_tb_salas
create table  cp_tb_salas (
  id_sala int(10) not null,
  no_sala varchar(45) not null,
  id_cine int(11) not null
);
alter table cp_tb_salas add constraint cp_pk_sala primary key (id_sala);
alter table cp_tb_salas add constraint cp_fk_sal_cin foreign key (id_cine) references cp_tb_cine (id_cine);
alter table cp_tb_salas modify id_sala int not null auto_increment;

-- =============================================================================
-- TABLAS DE CARTELERA
-- =============================================================================

-- TABLA cp_tb_horario
create table cp_tb_horario (
  id_horario                  int not null,
  id_pelicula                 int not null,
  id_cine                     int not null,
  fe_diahorario               date,
  no_horashorario             varchar(100),
  fl_doblada                  boolean,
  fl_en3d                     boolean
);
alter table cp_tb_horario add constraint cp_pk_horario primary key (id_horario);
alter table cp_tb_horario add constraint cp_fk_hora_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_horario add constraint cp_fk_hora_cin foreign key (id_cine) references cp_tb_cine (id_cine);
alter table cp_tb_horario modify id_horario int not null auto_increment;

-- =============================================================================
-- TABLAS DE COMPRA Y RESERVA
-- =============================================================================

-- TABLA cp_tb_compra
create table cp_tb_compra (
  id_compra       int not null,
  username        varchar(50) not null,
  co_ticket       char(20),
  fe_compra       date
);
alter table cp_tb_compra add constraint cp_pk_compra primary key (id_compra);
alter table cp_tb_compra modify id_compra int not null auto_increment;

-- TABLA cp_tb_detallecompra
create table cp_tb_detallecompra (
  id_compra       int not null,
  id_producto     int not null,
  ss_compra       double(5,2),
  ss_pagado       double(5,2)
);
alter table cp_tb_detallecompra add constraint cp_pk_detallecompra primary key (id_compra, id_producto);
alter table cp_tb_detallecompra add constraint cp_fk_detcom_com foreign key (id_compra) references cp_tb_compra (id_compra);
alter table cp_tb_detallecompra add constraint cp_fk_detcom_pro foreign key (id_producto) references cp_tb_producto (id_producto);

-- =============================================================================
-- TABLAS DE SEGURIDAD
-- =============================================================================
create table users(
      username varchar(50) not null primary key,
      password varchar(50) not null,
      enabled boolean not null);

DROP TABLE IF EXISTS `dw2011cp007`.`authorities`;
create table authorities (
      username varchar(50) not null,
      authority varchar(50) not null,
      constraint fk_authorities_users foreign key(username) references users(username));
      create unique index ix_auth_username on authorities (username,authority);

create  table if not exists `dw2011cp007`.`cp_tb_empleado` (
  `cocodigo` varchar(20) not null ,
  `noapepaterno` varchar(45) null default null ,
  `noapematerno` varchar(45) null default null ,
  `nonombre` varchar(45) null default null ,
  `cotipodoc` char(2) null default null ,
  `nudocumento` char(11) null default null ,
  `txtemail` varchar(45) null default null ,
  `nounidadtrabajo` varchar(45) null default null ,
  `nopuestotrabajo` varchar(45) null default null ,
  `notelefono` varchar(10) null default null ,
  `noanexo` varchar(4) null default null ,
  `cojefeinmediato` varchar(20) null default null ,
  `nocontrasena` varchar(20) not null ,
  `coestadoempleado` char(1) null default null ,
  `coestadopassword` char(1) null default null ,
  `feregistro` datetime not null ,
  primary key (`cocodigo`) ,
  index `jefeinmediato` (`cojefeinmediato` asc) ,
  index `fk_jefeinmediato` (`cojefeinmediato` asc) ,
  constraint `fk_jefeinmediato`
    foreign key (`cojefeinmediato` )
    references `dw2011cp007`.`cp_tb_empleado` (`cocodigo` )
    on delete set null
    on update no action);    

create  table if not exists `dw2011cp007`.`cp_tb_cliente` (
  `cocliente` int not null auto_increment ,
  `nologin` varchar(45) not null ,
  `noapepaterno` varchar(45) null default null ,
  `noapematerno` varchar(45) null default null ,
  `nonombre` varchar(45) null default null ,
  `flpremium` boolean null default null ,
  `txtemail` varchar(45) null default null ,
  `cotipodoc` varchar(45) null default null ,
  `nudocumento` char(11) null default null ,
  `notelefono` varchar(10) null default null ,
  `txtdireccion` varchar(60) null default null ,
  `nocontrasena` varchar(20) null default null ,
  `coestadousuario` char(1) null default null ,
  `coestadopassword` char(1) null default null ,
  `feregistro` datetime not null ,
  primary key (`cocliente`) ,
  unique index `nologin_unique` (`nologin` asc) );

create  table if not exists `dw2011cp007`.`cp_tb_perfil` (
  `idperfil` int not null auto_increment ,
  `noperfil` varchar(30) not null ,
  `txtdescripcion` varchar(60) null ,
  `nuvigencia` int null ,
  `coestadoperfil` char(1) null ,
  primary key (`idperfil`) );

create  table if not exists `dw2011cp007`.`cp_tb_funcion` (
  `idfuncion` int not null auto_increment ,
  `nofuncion` varchar(30) not null ,
  `txtdescripcion` varchar(60) null ,
  primary key (`idfuncion`) );

create  table if not exists `dw2011cp007`.`perfil_has_cp_tb_funcion` (
  `perfil_idperfil` int not null ,
  `cp_tb_funcion_idfuncion` int not null ,
  primary key (`perfil_idperfil`, `cp_tb_funcion_idfuncion`) ,
  index `fk_perfil_has_cp_tb_funcion_cp_tb_funcion1` (`cp_tb_funcion_idfuncion` asc) ,
  index `fk_perfil_has_cp_tb_funcion_perfil1` (`perfil_idperfil` asc) ,
  constraint `fk_perfil_has_cp_tb_funcion_perfil1`
    foreign key (`perfil_idperfil` )
    references `dw2011cp007`.`cp_tb_perfil` (`idperfil` )
    on delete no action
    on update no action,
  constraint `fk_perfil_has_cp_tb_funcion_cp_tb_funcion1`
    foreign key (`cp_tb_funcion_idfuncion` )
    references `dw2011cp007`.`cp_tb_funcion` (`idfuncion` )
    on delete no action
    on update no action);