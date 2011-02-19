insert into re_tb_pais values (1, 'PERU');
insert into re_tb_pais values (2, 'COLOMBIA');
insert into re_tb_pais values (3, 'BRAZIL');
insert into re_tb_pais values (4, 'ESPAÑA');
insert into re_tb_pais values (5, 'ESTADOS UNIDOS');

insert into cp_tb_cine values (1, 'CINEPLANET MIRAFLORES');
insert into cp_tb_cine values (2, 'CINEPLANET REALPLAZA WILSON');
insert into cp_tb_cine values (3, 'CINEPLANET ALCAZAR');
insert into cp_tb_cine values (4, 'CINEPLANET LINCE');
insert into cp_tb_cine values (5, 'CINEPLANET AREQUIPA');

insert into cp_tb_artista values (1, 'ARTISTA 1');
insert into cp_tb_artista values (2, 'ARTISTA 2');
insert into cp_tb_artista values (3, 'ARTISTA 3');
insert into cp_tb_artista values (4, 'ARTISTA 4');
insert into cp_tb_artista values (5, 'ARTISTA 5');

insert into cp_tb_tipopelicula values (1, 'COMEDIA');
insert into cp_tb_tipopelicula values (2, 'DRAMA');
insert into cp_tb_tipopelicula values (3, 'TERROR');
insert into cp_tb_tipopelicula values (4, 'ACCION');

insert into cp_tb_pelicula values (1, 'PERRO QUE LADRA', 1, 1, 2, 1, 1);
insert into cp_tb_pelicula values (2, 'NO MUERDE', 2, 1, 1, 1, 1);
insert into cp_tb_pelicula values (3, 'EL ABEJORRO NEGRO', 3, 4, 3, 1, 2);
insert into cp_tb_pelicula values (4, 'EL ASESINO DE LA VERDURA', 4, 3, 4, 1, 2);
insert into cp_tb_pelicula values (5, 'UN DIA DE CAMPO', 5, 2, 2, 2, 1);
insert into cp_tb_pelicula values (6, 'DONDE ESTAS YOLANDA', 1, 2, 2, 2, 1);
insert into cp_tb_pelicula values (7, 'EL MAESTRO DE LAS ARTES MARCIANAS', 2, 4, 3, 2, 2);
insert into cp_tb_pelicula values (8, 'LA CAIDA DEL IMPERIO DE LAS HORMIGAS', 3, 4, 3, 2, 2);

insert into cp_tb_peliculaartista values (1, 1);
insert into cp_tb_peliculaartista values (1, 2);
insert into cp_tb_peliculaartista values (1, 3);
insert into cp_tb_peliculaartista values (1, 4);
insert into cp_tb_peliculaartista values (2, 1);
insert into cp_tb_peliculaartista values (2, 2);
insert into cp_tb_peliculaartista values (2, 5);
insert into cp_tb_peliculaartista values (3, 4);
insert into cp_tb_peliculaartista values (3, 5);
insert into cp_tb_peliculaartista values (6, 1);
insert into cp_tb_peliculaartista values (6, 3);
insert into cp_tb_peliculaartista values (6, 5);
insert into cp_tb_peliculaartista values (7, 2);
insert into cp_tb_peliculaartista values (7, 4);
insert into cp_tb_peliculaartista values (8, 4);

insert into cp_tb_peliculacine values (1, 1, '2011-01-01', '2011-01-30');
insert into cp_tb_peliculacine values (1, 2, '2011-01-01', '2011-01-30');
insert into cp_tb_peliculacine values (1, 3, '2011-01-01', '2011-01-30');
insert into cp_tb_peliculacine values (1, 4, '2011-01-15', '2011-01-15');
insert into cp_tb_peliculacine values (1, 5, '2011-01-15', '2011-01-15');
insert into cp_tb_peliculacine values (2, 1, '2011-01-01', '2011-01-31');
insert into cp_tb_peliculacine values (2, 2, '2011-01-01', '2011-01-31');
insert into cp_tb_peliculacine values (2, 3, '2011-01-01', '2011-01-31');
insert into cp_tb_peliculacine values (2, 4, '2011-01-01', '2011-01-31');
insert into cp_tb_peliculacine values (2, 5, '2011-01-01', '2011-01-31');
insert into cp_tb_peliculacine values (3, 1, '2011-02-01', '2011-02-15');--
insert into cp_tb_peliculacine values (3, 2, '2011-02-01', '2011-02-15');--
insert into cp_tb_peliculacine values (3, 3, '2011-02-01', '2011-02-15');--
insert into cp_tb_peliculacine values (3, 4, '2011-02-01', '2011-02-15');--
insert into cp_tb_peliculacine values (3, 5, '2011-02-01', SYSDATE);--
insert into cp_tb_peliculacine values (4, 1, '2011-02-01', SYSDATE);--
insert into cp_tb_peliculacine values (4, 2, '2011-02-01', SYSDATE);--
insert into cp_tb_peliculacine values (5, 3, '2011-02-01', SYSDATE);--
insert into cp_tb_peliculacine values (5, 4, '2011-02-15', SYSDATE);--
insert into cp_tb_peliculacine values (5, 5, '2011-02-15', SYSDATE);--
insert into cp_tb_peliculacine values (6, 1, '2011-02-15', SYSDATE);--
insert into cp_tb_peliculacine values (6, 3, '2011-02-15', SYSDATE);--
insert into cp_tb_peliculacine values (6, 5, '2011-02-15', SYSDATE);--
insert into cp_tb_peliculacine values (7, 1, '2011-03-01', null);
insert into cp_tb_peliculacine values (7, 2, '2011-03-01', null);
insert into cp_tb_peliculacine values (8, 1, '2011-03-01', null);
insert into cp_tb_peliculacine values (8, 3, '2011-03-01', null);
insert into cp_tb_peliculacine values (8, 5, '2011-03-01', null);

insert into cp_tb_peliculacine values (11,3, 1, '2011-02-12','12-18',1,1);
insert into cp_tb_peliculacine values (12,3, 2, '2011-02-13','16-22',0,1);
insert into cp_tb_peliculacine values (13,3, 3, '2011-02-14','12-18',1,0);
insert into cp_tb_peliculacine values (14,3, 4, '2011-02-15','16-22',0,0);
insert into cp_tb_peliculacine values (15,3, 5, SYSDATE,'16-22',0,0);
insert into cp_tb_peliculacine values (16,4, 1, SYSDATE,'12-18',0,1);
insert into cp_tb_peliculacine values (17,4, 2, SYSDATE,'16-22',0,1);
insert into cp_tb_peliculacine values (18,5, 3, SYSDATE,'12-18',0,0);
insert into cp_tb_peliculacine values (19,5, 4, SYSDATE,'16-22',0,0);
insert into cp_tb_peliculacine values (20,5, 5, SYSDATE,'12-18',0,0);
insert into cp_tb_peliculacine values (21,6, 1, SYSDATE,'16-22',0,0);
insert into cp_tb_peliculacine values (22,6, 3, SYSDATE,'12-18',0,0);
insert into cp_tb_peliculacine values (23,6, 5, SYSDATE,'16-22',0,0);
