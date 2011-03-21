package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;


public interface UsuarioExternoRepository {
	
	boolean grabarUsuario(UsuarioExternoModel usuarioExterno);
	UsuarioExternoModel buscarUsuarioExternoPorUsuario(String loginusuario);
	boolean eliminarUsuario(String codigousuario);
	boolean actualizarUsuario (UsuarioExternoModel usuarioExterno);

}
