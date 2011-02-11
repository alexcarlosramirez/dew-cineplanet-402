package pe.edu.upc.dw2011cp007.repository;

import pe.edu.upc.dw2011cp007.model.UsuarioModel;

/**
 * Clase encargada de la administración del UsuarioModel
 * @author u201021418
 *
 */
public class UsuarioRepository {

	/**
	 * Graba usuario
	 * @param usuario
	 */
	
	public void GeneraCodigoUsuario(UsuarioModel usuario) {
	
		ValidamosIngresoUsuario(usuario,1);
		
		String generaCodigo=(usuario.getNombreUsuario().substring(0,1) ) + usuario.getApellidoPaternoUsuario() ;

		
		if (generaCodigo.length()< 10) {
			generaCodigo=(generaCodigo + usuario.getApellidoMaternoUsuario()).substring(0,10);
		};
		
		if (generaCodigo.length()< 10) {
			generaCodigo=(generaCodigo + (usuario.getNombreUsuario().substring(1,usuario.getNombreUsuario().length()))).substring(0,10);
		};
		
		usuario.setIdUsuario(generaCodigo);
		usuario.setPasswordUsuario(generaCodigo);
	}
	
	
	public void ValidamosIngresoUsuario(UsuarioModel usuario,int tipo) {
	
		
		if  (tipo==1) {

			if (usuario.getNombreUsuario().equals("")) {
				System.out.println("Debe ingresar Nombre de Usuario" );
				return;
			}
			if (usuario.getApellidoPaternoUsuario().equals("")) {
				System.out.println("Debe ingresar Apellido Paterno" );
				return;
			}			
			if (usuario.getApellidoMaternoUsuario().equals("")) {
				System.out.println("Debe ingresar Apellido Materno" );
				return;
			}			
			
		}
		
		
		
		
		
		
		if  (tipo==2) {
			if (usuario.getIdUsuario().length()< 10) {
				System.out.println("El codigo contiene menos de 10 Caracteres" );
				return;
			}
			
			if (usuario.getIdUsuario().equals("")) {
				System.out.println("El codigo no cumple con las condciones especificadas" );
				return;
			}
		}
		
		
	}	
	
	
	
	public void grabarUsuario(UsuarioModel usuario) {
		
		GeneraCodigoUsuario(usuario);
		ValidamosIngresoUsuario(usuario,2);
		
		
		//MOSTRAMOS LO GRABADO
		System.out.println("Codigo Usuario      :" + usuario.getIdUsuario());		
		System.out.println("Usuario             :" + usuario.getNombreUsuario() + " " + usuario.getApellidoPaternoUsuario() + " " + usuario.getApellidoMaternoUsuario()     );
		System.out.println("Unidad de trabajo   :" + usuario.getUnidadTrabajo ());
		System.out.println("Telefono y Anexo    :" + usuario.getTelefonoAnexo ());
		System.out.println("Correo              :" + usuario.getCorreo());
		System.out.println("jefe Inmediato      :" + usuario.getJefeInmediato());
		System.out.println("Tipo de Documento   :" + usuario.getTipoDocumento());
		System.out.println("Nro. Documento      :" + usuario.getNumeroDocumento());
		System.out.println("Password            :" + usuario.getPasswordUsuario());
		System.out.println("Estado Password     :" + usuario.getEstadoPassword());
		System.out.println("Estado Usuario      :" + usuario.getEstadoUsuario());
		System.out.println("Nro de Ingresos     :" + usuario.getNroVecesLoguedo());		
	
		
	
	}
}
