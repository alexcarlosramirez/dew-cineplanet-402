package pe.edu.upc.dw2011cp007;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.repository.UsuarioRepository;
import static org.junit.Assert.*;//importar todos los metodos estaticos

public class UsuarioTest {

	@Test //recordar que esto identifica que es un metodo de prueba
	public void grabarUsuario() {
		//supuestamente se reciben los datos de un formulario
		UsuarioModel usuario = new UsuarioModel();
		usuario.setApellidoUsuario("Ramirez Ruiz");
		usuario.setNombreUsuario("Alexander");
		usuario.setLoginUsuario("usuario");
		usuario.setPasswordUsuario("usuario");

		//se llama al metodo grabar
		UsuarioRepository repository = new UsuarioRepository();
		repository.grabarUsuario(usuario);

		//hacemos pruebas
		//para saber si se devolvió id=1. No funciona para más códigos
			//assertEquals(1, usuario.getIdUsuario());
		//Si se generó un usuario con cualquier código
			//assertTrue("usuario registrado", usuario.getIdUsuario() > 0);
		//validaciones según historia
		//aqui termina la prueba de video
	}
}
