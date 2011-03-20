package pe.edu.upc.dw2011cp007.seguridad.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;

public interface UsuarioRepository {

	boolean registrarUsuario(UsuarioModel usuarioModel);
	boolean modificarUsuario(UsuarioModel usuarioModel);
	boolean eliminarUsuario(UsuarioModel usuarioModel);
	boolean generaCodigoUsuario(UsuarioModel usuarioModel);
	ArrayList<UsuarioModel> buscarListaUsuario();
	
}
