package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;


public interface UsuarioInternoRepository {

	boolean grabarUsuario(UsuarioInternoModel usuarioInterno);
	UsuarioInternoModel buscarUsuarioInternoPorCodigo(String codigousuario);
	boolean eliminarUsuario(String codigousuario);
	boolean actualizarUsuario (UsuarioInternoModel usuarioInterno);
	
}
