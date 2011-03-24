package pe.edu.upc.dw2011cp007.mantenimiento.service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;

public interface AdministraUserInternoService {
	
	public boolean registrarUsuario(UsuarioInternoModel usuarioInternoModel);
	public boolean actualizarUsuario(UsuarioInternoModel usuarioInternoModel);
	public boolean eliminarUsuario(UsuarioInternoModel usuarioInternoModel);
	public UsuarioInternoModel buscarUsuarioPorId(String idUsuario);

}
