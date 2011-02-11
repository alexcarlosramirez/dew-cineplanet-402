package pe.edu.upc.dw2011cp007;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.repository.UsuarioRepository;
import static org.junit.Assert.*;//importar todos los metodos estaticos
  
public class UsuarioTest {

	@Test //recordar que esto identifica que es un metodo de prueba
	public void grabarUsuario() {
		 
		//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		UsuarioModel usuario = new UsuarioModel();
		usuario.setApellidoPaternoUsuario("Lopez");
		usuario.setApellidoMaternoUsuario("Vitor")	;	
		usuario.setNombreUsuario("Yonni");
		usuario.setUnidadTrabajo("Unidad 1");
		usuario.setTelefonoAnexo("4261591-116");
		usuario.setCorreo("u201021071@upc.edu.pe");
		usuario.setJefeInmediato("Loquillo");
		usuario.setTipoDocumento("DNI");
		usuario.setNumeroDocumento("43689535");
		usuario.setPasswordUsuario("123456");
		usuario.setEstadoPassword("Vencida");
		usuario.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
		usuario.setNroVecesLoguedo(0);//numero de veces logueado
		
		
		//se llama al metodo grabar
		UsuarioRepository repository = new UsuarioRepository();
		repository.grabarUsuario(usuario);

		//hacemos pruebas
		//para saber si se devolvi� id=1. No funciona para m�s c�digos
			//assertEquals(1, usuario.getIdUsuario());
		//Si se gener� un usuario con cualquier c�digo
			//assertTrue("usuario registrado", usuario.getIdUsuario() > 0);
		//validaciones seg�n historia
		//aqui termina la prueba de video
	}
}
