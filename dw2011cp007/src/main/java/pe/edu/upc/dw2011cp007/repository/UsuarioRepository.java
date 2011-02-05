package pe.edu.upc.dw2011cp007.repository;

import pe.edu.upc.dw2011cp007.model.UsuarioModel;

/**
 * Clase encargada de la administraci�n del UsuarioModel
 * @author u201021418
 *
 */
public class UsuarioRepository {

	/**
	 * Graba usuario
	 * @param usuario
	 */
	public void grabarUsuario(UsuarioModel usuario) {
		System.out.println("Se espera registrar el usuario " + usuario.getNombreUsuario());
		usuario.setIdUsuario(50);//si grabamos usuario, el id debe ser mayor a cero
		System.out.println("Se registr� el usuario " + usuario.getIdUsuario());
	}
}
