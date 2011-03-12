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
drop table if exists cp_tb_userinterno;
drop table if exists cp_tb_perfil;

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

create table cp_tb_userinterno (
	id_usuario varchar(10) not null,
	no_apepaterno varchar(30),
	no_apematerno varchar(30),
	no_nombreusuario varchar(30),
	no_unidadtrabajo varchar(20),
	no_puestolaboral varchar(20),
	nu_telefono varchar(10),
	nu_anexo varchar(4),
	no_email varchar(40),
	id_jefeinmediato varchar(10),
	no_tipodoc varchar(1),
	no_numdoc varchar(11),
	no_password varchar(10),
	no_estadousuario varchar(1)
);
alter table cp_tb_userinterno add constraint cp_pk_userinterno primary key (id_usuario);


create table cp_tb_perfil (
  id_perfil             int not null,
  no_nombreperfil       varchar(30),
  tx_descripcion        varchar(100),
  nu_diasvigencia       int,
  co_estado             int
);
alter table cp_tb_perfil add constraint cp_pk_perfil primary key (id_perfil);