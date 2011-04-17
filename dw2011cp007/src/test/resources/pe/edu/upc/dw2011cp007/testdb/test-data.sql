insert into cp_tb_pais (no_pais) values ('PERU');
insert into cp_tb_pais (no_pais) values ('COLOMBIA');
insert into cp_tb_pais (no_pais) values ('BRAZIL');
insert into cp_tb_pais (no_pais) values ('ESPAÑA');
insert into cp_tb_pais (no_pais) values ('ESTADOS UNIDOS');

insert into cp_tb_cine (no_cine, tx_observacion, tx_direccion, tx_telefono, tx_rutaimagen) values ('CINEPLANET MIRAFLORES', 'LOCAL MODERNO CON PROYECCIÓN 3D', 'DIRECCION 1', '555-8884', 'CIN001.jpg');
insert into cp_tb_cine (no_cine, tx_observacion, tx_direccion, tx_telefono, tx_rutaimagen) values ('CINEPLANET REALPLAZA WILSON', 'LOCAL NUEVO EN FANTASIA PLAZA', 'DIRECCION 5', '555-8885', 'CIN002.jpg');
insert into cp_tb_cine (no_cine, tx_observacion, tx_direccion, tx_telefono, tx_rutaimagen) values ('CINEPLANET ALCAZAR', 'NUESTRO LOCA EMBLEMATICO', '555-8886', 'DIRECCION 2', 'CIN003.jpg');
insert into cp_tb_cine (no_cine, tx_observacion, tx_direccion, tx_telefono, tx_rutaimagen) values ('CINEPLANET LINCE', 'OTRO LOCA DESTACADO', 'DIRECCION 3', '555-8887', 'CIN004.jpg');
insert into cp_tb_cine (no_cine, tx_observacion, tx_direccion, tx_telefono, tx_rutaimagen) values ('CINEPLANET AREQUIPA', 'PEQUEÑO Y MODERNO', 'DIRECCION 4', '555-8888', 'CIN005.jpg');

insert into cp_tb_artista (no_artista) values ('ARTISTA 1');
insert into cp_tb_artista (no_artista) values ('ARTISTA 2');
insert into cp_tb_artista (no_artista) values ('ARTISTA 3');
insert into cp_tb_artista (no_artista) values ('ARTISTA 4');
insert into cp_tb_artista (no_artista) values ('ARTISTA 5');

insert into cp_tb_tipopelicula (no_tipopelicula) values ('COMEDIA');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('DRAMA');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('TERROR');
insert into cp_tb_tipopelicula (no_tipopelicula) values ('ACCION');

insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('PERRO QUE LADRA', 1, 1, 'INF', 'SIPNOPSIS 1', 'PEL001.jpg',true, true, false, false);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('NO MUERDE', 2, 1, 'INF', 'SIPNOPSIS 2', 'PEL002.jpg', true, true, false, false);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL ABEJORRO NEGRO', 3, 4, '+14', 'SIPNOPSIS 3', 'PEL003.jpg', true, false, false, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL ASESINO DE LA VERDURA', 4, 3, '+18', 'SIPNOPSIS 4', 'PEL004.jpg', true, false, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('UN DIA DE CAMPO', 5, 2, 'TOD', 'SIPNOPSIS 5', 'PEL005.jpg', false, true, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('DONDE ESTAS YOLANDA', 1, 2, 'TOD', 'SIPNOPSIS 6', 'PEL006.jpg', false, true, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('EL MAESTRO DE LAS ARTES MARCIANAS', 2, 4, '+14', 'SIPNOPSIS 7', 'PEL007.jpg', false, false, true, true);
insert into cp_tb_pelicula (no_pelicula, id_pais, id_tipopelicula, co_clasificacionpelicula, tx_sinopsis, tx_nombreimagen, fl_doblada, fl_en3d, fl_enestreno, fl_encartelera) values ('LA CAIDA DEL IMPERIO DE LAS HORMIGAS', 3, 4, '+14', 'SIPNOPSIS 8', 'PEL008.jpg', false, false, true, true);

update cp_tb_pelicula set tx_sinopsis='Siglo IV. Egipto bajo el Imperio Romano. Las violentas revueltas religiosas en las calles de Alejandría alcanzan a su legendaria Biblioteca. Atrapada tras sus muros, la brillante astrónoma Hipatia lucha por salvar la sabiduría del Mundo Antiguo con la ayuda de sus discípulos.' where id_pelicula=4;  
update cp_tb_pelicula set tx_sinopsis='En Saw 7 un grupo de supervivientes de los juegos de Jigsaw se reunirán para buscar el apoyo del gurú de autoayuda y superviviente Bobby Dagen, un hombre que tiene un oscuro secreto en el que quiere desatar una nueva oleada de terror...' where id_pelicula=5;
update cp_tb_pelicula set tx_sinopsis='Basado en hechos reales, el film toma como base una novela de Matt Baglio. Un estudiante norteamericano que se prepara para el sacerdocio, está en una etapa de pérdida de fé, para recuperarla acudirá a la escuela de exorcismos de El Vaticano en la que se verá cara a cara con las fuerzas demoníacas' where id_pelicula=3;
update cp_tb_pelicula set tx_sinopsis='Martin Lawrence regresa como el agente del FBI Malcolm Turner y su alter-ego del espionaje "Big Momma". Pero en esta ocasión, se une a Turner su hijastro adolescente Trent al tiempo en que se van de agentes encubiertos a una escuela para las artes exclusiva para señoritas.' where id_pelicula=6;
update cp_tb_pelicula set tx_sinopsis='Let Me In se centra en un niño triste llamado Owen, maltratado por sus compañeros de clase y abandonado por sus padres divorciados; sin embargo, algo cambiará en la solitaria vida de Owen cuando conozca a una nueva y misteriosa vecina llamada Abby.' where id_pelicula=7;
update cp_tb_pelicula set tx_sinopsis='Will es un soldado que ha pasado los últimos tiempos en hospitales del ejército, curando sus heridas de su tiempo pasado en la guerra de Iraq. Además, la mujer que dejó atrás ha seguido con su vida, y ya no puede contar con ella.' where id_pelicula=8;

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

insert into cp_tb_tipoproducto values (1, 'ROPA');
insert into cp_tb_tipoproducto values (2, 'GORROS');
insert into cp_tb_tipoproducto values (3, 'WALLPAPERS');
insert into cp_tb_tipoproducto values (4, 'DULCES');
insert into cp_tb_tipoproducto values (5, 'JUGUETES');
insert into cp_tb_tipoproducto values (6, 'ACCESORIOS');

insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (1, 'ASD13', 'POLO ESTAMPADO "MI PERRO"', 5.00, 5, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (3, 'MOADI', 'WP "MI PERRO Y YO"', 0.00, -1, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (5, '2938J', 'MUÑECO ANIMADO DEL PERRO', 10.00, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (2, '293DM', 'GORRO ESTAPADO ESCENA DE LA MORDIDA', 4.50, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (4, '239ID', 'VASO DE GASEOSA DE NO MUERDE', 1.00, 5, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (6, '2M9FF', 'LLAVERO DEL MORDEDOR', 2.50, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (1, '2MF9I', 'JEAN DEL ABEJORRO', 23.00, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (2, '2O3IM', 'GORRO DEL ABEJORRO', 5.00, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (3, '2M3F0', 'WP "EL ABEJORRO"', 0.0, -1, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (4, '2O30F', 'CANCHA DE ZANAHORIA', 2.00, 5, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (5, '20FDO', 'JUGUETE MOVIBLE DE LA VERDURA ASESINA', 6.00, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (6, '23FI0', 'PEINE CON IMAGEN DE LA VERDURA ASESINA', 5.00, 5, true);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (1, '945UH', 'MANTA DEL DIA DE CAMPO', 3.00, 5, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (2, 'DN834', 'GORRO ROMANTICO DE YOLANDA', 2.5, 5, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (3, 'KAJSB', 'WP DE LA PELEA DEL MAESTRO Y ALUMNO', 0.0, -1, false);
insert into cp_tb_producto (id_tipoproducto, co_producto, no_producto, ss_producto, nu_stockproducto, fl_solopremiun) values (4, '2WDUH', 'CARAMELOS HORMIGA', 0.10, 5, false);
update cp_tb_producto p set p.tx_rutaimagen = concat('P', p.co_producto, '.jpg');

insert into cp_tb_productopelicula values (1, 1);
insert into cp_tb_productopelicula values (2, 1);
insert into cp_tb_productopelicula values (3, 1);
insert into cp_tb_productopelicula values (4, 2);
insert into cp_tb_productopelicula values (5, 2);
insert into cp_tb_productopelicula values (6, 2);
insert into cp_tb_productopelicula values (7, 3);
insert into cp_tb_productopelicula values (8, 3);
insert into cp_tb_productopelicula values (9, 3);
insert into cp_tb_productopelicula values (10, 4);
insert into cp_tb_productopelicula values (11, 4);
insert into cp_tb_productopelicula values (12, 4);
insert into cp_tb_productopelicula values (13, 5);
insert into cp_tb_productopelicula values (14, 6);
insert into cp_tb_productopelicula values (15, 7);
insert into cp_tb_productopelicula values (16, 8);


INSERT into cp_tb_empleado (`coCodigo`, `noApePaterno`, `noApeMaterno`, `noNombre`, `cotipodoc`, `nudocumento`, `txtemail`, `noUnidadTrabajo`, `noPuestoTrabajo`, `noTelefono`, `noAnexo`, `coJefeInmediato`, `noContrasena`, `coEstadoEmpleado`, `coEstadoPassword`, `feRegistro`) VALUES ('MCOSIOESPI', 'COSIO', 'ESPINO', 'MIGUEL', '1', '42587813', 'MIGUELMAC20@GMAIL.COM', 'TECNOLOGIA', 'ANALISTA QA', '2222222', '1512', NULL, '123456789', '1', '1', SYSDATE());

INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('ADMINISTRADOR','ADMINISTRADOR DEL SISTEMA',1000,'1');
INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('OPERADOR','PERFIL OPERATIVO',30,'1');
INSERT into cp_tb_Perfil (noPerfil,txtDescripcion,nuvigencia,coestadoPerfil) values('ACTUALIZADOR','ACTUALIZA EL CONTENIDO',45,'2');

INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('ROOT','CONTROL TOTAL');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('MANTENIMIENTO','MANTENIMIENTO DE TABLAS PRINCIPALES');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('INVITADO','ACCESO LIMITADO');
INSERT INTO cp_tb_funcion (nofuncion,txtdescripcion) VALUES('PREMIUM','USUARIO PREMIO');

INSERT INTO cp_tb_Cliente (coCliente,nologin,noApePaterno,noNombre,flPremium,txtemail,noContrasena,coEstadoUsuario,feRegistro) VALUES (1,'invitado01','invitado001','invitado0001',false,'miguelmac20@gmail.com','123456',1,SYSDATE()) ;
INSERT INTO cp_tb_Cliente (coCliente,nologin,noApePaterno,noNombre,flPremium,txtemail,noContrasena,coEstadoUsuario,feRegistro) VALUES (2,'invitado02','invitado002','invitado0002',true,'miguelmac20@gmail.com','123456',1,SYSDATE()) ;


INSERT INTO users VALUES ('user1', 'pass1', true);
INSERT INTO users VALUES ('user2', 'pass2', true);
 
INSERT INTO authorities VALUES ('user1', 'ROLE_USER');
INSERT INTO authorities VALUES ('user1', 'ROLE_ADMIN');
INSERT INTO authorities VALUES ('user2', 'ROLE_USER');
