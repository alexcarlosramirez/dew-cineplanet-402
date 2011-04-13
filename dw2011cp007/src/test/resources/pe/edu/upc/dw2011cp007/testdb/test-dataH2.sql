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