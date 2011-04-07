truncate table cp_tb_horario;
truncate table cp_tb_peliculaartista;
truncate table cp_tb_peliculacine;
truncate table cp_tb_pelicula;
truncate table cp_tb_pais;
truncate table cp_tb_cine;
truncate table cp_tb_artista;
truncate table cp_tb_tipopelicula;
truncate table cp_tb_empleado;
truncate table cp_tb_Perfil;

insert into cp_tb_pais (no_pais) values ('PERU');
insert into cp_tb_pais (no_pais) values ('COLOMBIA');
insert into cp_tb_pais (no_pais) values ('BRAZIL');
insert into cp_tb_pais (no_pais) values ('ESPAÑA');
insert into cp_tb_pais (no_pais) values ('ESTADOS UNIDOS');

insert into cp_tb_cine (no_cine) values ('CINEPLANET MIRAFLORES');
insert into cp_tb_cine (no_cine) values ('CINEPLANET REALPLAZA WILSON');
insert into cp_tb_cine (no_cine) values ('CINEPLANET ALCAZAR');
insert into cp_tb_cine (no_cine) values ('CINEPLANET LINCE');
insert into cp_tb_cine (no_cine) values ('CINEPLANET AREQUIPA');

insert into cp_tb_artista (no_artista) values ('ARTISTA 1');
insert into cp_tb_artista (no_artista) values ('ARTISTA 2');
insert into cp_tb_artista (no_artista) values ('ARTISTA 3');
insert into cp_tb_artista (no_artista) values ('ARTISTA 4');
insert into cp_tb_artista (no_artista) values ('ARTISTA 5');

insert into cp_tb_tipopelicula (no_tipopelicula) values ('COMEDIA');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('DRAMA');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('TERROR');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('ACCION');

insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('PERRO QUE LADRA', 1, 1, 'INF', true, true, false, false);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('NO MUERDE', 2, 1, 'INF', true, true, false, false);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL ABEJORRO NEGRO', 3, 4, '+14', true, false, false, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL ASESINO DE LA VERDURA', 4, 3, '+18', true, false, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('UN DIA DE CAMPO', 5, 2, 'TOD', false, true, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('DONDE ESTAS YOLANDA', 1, 2, 'TOD', false, true, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL MAESTRO DE LAS ARTES MARCIANAS', 2, 4, '+14', false, false, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('LA CAIDA DEL IMPERIO DE LAS HORMIGAS', 3, 4, '+14', false, false, true, true);

insert into cp_tb_peliculaartista values (1, 1);
insert into cp_tb_peliculaartista values (1, 2);
insert into cp_tb_peliculaartista values (1, 3);
insert into cp_tb_peliculaartista values (1, 4);
insert into cp_tb_peliculaartista values (2, 1);
insert into cp_tb_peliculaartista values (2, 2);
insert into cp_tb_peliculaartista values (2, 5);
insert into cp_tb_peliculaartista values (3, 4);
insert into cp_tb_peliculaartista values (3, 5);
insert into cp_tb_peliculaartista values (5, 1);
insert into cp_tb_peliculaartista values (5, 3);
insert into cp_tb_peliculaartista values (5, 5);
insert into cp_tb_peliculaartista values (6, 2);
insert into cp_tb_peliculaartista values (6, 4);
insert into cp_tb_peliculaartista values (7, 4);

insert into cp_tb_peliculacine values (1, 1);
insert into cp_tb_peliculacine values (1, 2);
insert into cp_tb_peliculacine values (1, 3);
insert into cp_tb_peliculacine values (1, 4);
insert into cp_tb_peliculacine values (1, 5);
insert into cp_tb_peliculacine values (2, 1);
insert into cp_tb_peliculacine values (2, 2);
insert into cp_tb_peliculacine values (2, 3);
insert into cp_tb_peliculacine values (2, 4);
insert into cp_tb_peliculacine values (2, 5);
insert into cp_tb_peliculacine values (3, 1);
insert into cp_tb_peliculacine values (3, 2);
insert into cp_tb_peliculacine values (3, 3);
insert into cp_tb_peliculacine values (3, 4);
insert into cp_tb_peliculacine values (3, 5);
insert into cp_tb_peliculacine values (4, 1);
insert into cp_tb_peliculacine values (4, 2);
insert into cp_tb_peliculacine values (5, 3);
insert into cp_tb_peliculacine values (5, 4);
insert into cp_tb_peliculacine values (5, 5);
insert into cp_tb_peliculacine values (6, 1);
insert into cp_tb_peliculacine values (6, 3);
insert into cp_tb_peliculacine values (6, 5);
insert into cp_tb_peliculacine values (7, 1);
insert into cp_tb_peliculacine values (7, 2);
insert into cp_tb_peliculacine values (8, 1);
insert into cp_tb_peliculacine values (8, 3);
insert into cp_tb_peliculacine values (8, 5);

insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (3, 1, '2011-02-12','12-18', false, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (3, 2, '2011-02-13','16-22', false,true);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (3, 3, '2011-02-14','12-18', true, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (3, 4, '2011-02-15','16-22', true, true);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (3, 5, SYSDATE(),'16-22', false, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (4, 1, SYSDATE(),'12-18', false,true);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (4, 2, SYSDATE(),'16-22', true, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (5, 3, SYSDATE(),'12-18', false,true);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (5, 4, SYSDATE(),'16-22', false, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (5, 5, SYSDATE(),'12-18', false,true);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (6, 1, SYSDATE(),'16-22', true, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (6, 3, SYSDATE(),'12-18', false, false);
insert into cp_tb_horario (id_pelicula, id_cine, fe_diahorario, no_horashorario, fl_doblada, fl_en3d) values (6, 5, SYSDATE(),'16-22', false,true);

INSERT into cp_tb_empleado (`coCodigo`, `noApePaterno`, `noApeMaterno`, `noNombre`, `cotipodoc`, `nudocumento`, `txtemail`, `noUnidadTrabajo`, `noPuestoTrabajo`, `noTelefono`, `noAnexo`, `coJefeInmediato`, `noContrasena`, `coEstadoEmpleado`, `coEstadoPassword`, `feRegistro`) VALUES ('MCOSIOESPI', 'COSIO', 'ESPINO', 'MIGUEL', '1', '42587813', 'MIGUELMAC20@GMAIL.COM', 'TECNOLOGIA', 'ANALISTA QA', '2222222', '1512', NULL, '123456789', '1', '1', SYSDATE());

INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('ADMINISTRADOR','ADMINISTRADOR DEL SISTEMA',1000,'1');
INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('OPERADOR','PERFIL OPERATIVO',30,'1');
INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('ACTUALIZADOR','ACTUALIZA EL CONTENIDO',45,'2');

INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('ROOT','CONTROL TOTAL');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('MANTENIMIENTO','MANTENIMIENTO DE TABLAS PRINCIPALES');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('INVITADO','ACCESO LIMITADO');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('PREMIUM','USUARIO PREMIO');