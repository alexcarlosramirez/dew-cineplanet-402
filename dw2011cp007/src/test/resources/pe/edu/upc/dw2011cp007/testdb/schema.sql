--create database dw2011cp007;

--use dw2011cp007;

drop table cp_tb_pais if exists;
drop table cp_tb_cine if exists;
drop table cp_tb_artista if exists;
drop table cp_tb_tipopelicula if exists;
drop table cp_tb_pelicula if exists;
drop table cp_tb_peliculaartista if exists;
drop table cp_tb_peliculacine if exists;
drop table cp_tb_horario if exists;

create table cp_tb_pais (
  id_pais int not null,
  no_pais varchar(50)
);
alter table cp_tb_pais add constraint cp_pk_pais primary key (id_pais);

create table cp_tb_cine (
  id_cine int not null,
  no_cine varchar(50)
);
alter table cp_tb_cine add constraint cp_pk_cine primary key (id_cine);

create table cp_tb_artista (
  id_artista int not null,
  no_artista varchar(50)
);
alter table cp_tb_artista add constraint cp_pk_artista primary key (id_artista);

create table cp_tb_tipopelicula (
  id_tipopelicula int not null,
  no_tipopelicula varchar(50)
);
alter table cp_tb_tipopelicula add constraint cp_pk_tipopelicula primary key (id_tipopelicula);

create table cp_tb_pelicula (
  id_pelicula                 int not null,
  no_pelicula                 varchar(50),
  id_pais                     int,
  id_tipopelicula             int,
  id_clasificacionpelicula    int,
  fl_tienesubtitulopelicula   int,
  fl_tiene3dpelicula          int
);
alter table cp_tb_pelicula add constraint cp_pk_pelicula primary key (id_pelicula);
alter table cp_tb_pelicula add constraint cp_fk_pelpai foreign key (id_pais) references cp_tb_pais (id_pais);
alter table cp_tb_pelicula add constraint cp_fk_peltippel foreign key (id_tipopelicula) references cp_tb_tipopelicula (id_tipopelicula);

create table cp_tb_peliculaartista (
  id_pelicula int not null,
  id_artista int not null
);
alter table cp_tb_peliculaartista add constraint cp_pk_pelart primary key (id_pelicula,id_artista);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_pel foreign key (id_pelicula) references cp_tb_pelicula (id_pelicula);
alter table cp_tb_peliculaartista add constraint cp_fk_pelart_art foreign key (id_artista) references cp_tb_artista (id_artista);

create table cp_tb_peliculacine (
  id_pelicula int not null,
  id_cine int not null,
  fe_inicioproyecion date,
  fe_finproyecion date
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
  fl_essubtitulado            int,
  fl_esen3d                   int
);
alter table cp_tb_horario add constraint cp_pk_horario primary key (id_horario,id_pelicula,id_cine);
alter table cp_tb_horario add constraint cp_fk_hor_pelcin foreign key (id_pelicula,id_cine) references cp_tb_peliculacine (id_pelicula, id_cine);