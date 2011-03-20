package pe.edu.upc.dw2011cp007.seguridad.service;

import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;


public interface SeguridadService {

	boolean registrarUsuario(UsuarioModel usuarioModel);

	boolean actualizarUsuario(UsuarioModel usuarioModel);

	boolean eliminarUsuario(UsuarioModel usuarioModel);

	UsuarioModel buscarUsuarioPorId(String idUsuario);

	UsuarioModel buscarUsuarioPorNombre(String Nombre);


	
}