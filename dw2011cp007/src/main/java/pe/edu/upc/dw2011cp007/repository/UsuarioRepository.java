package pe.edu.upc.dw2011cp007.repository;

import pe.edu.upc.dw2011cp007.model.UsuarioModel;

public class UsuarioRepository {

	public void grabarUsuario(UsuarioModel usuario) {
		System.out.println("Se espera registrar el usuario " + usuario.getNombreUsuario());
		usuario.setIdUsuario(1);
		System.out.println("Se registró el usuario " + usuario.getIdUsuario());
	}
}
