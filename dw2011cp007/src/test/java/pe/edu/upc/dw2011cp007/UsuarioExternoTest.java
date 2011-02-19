package pe.edu.upc.dw2011cp007;
import java.util.Iterator;
import java.util.Map;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.repository.UsuarioRepository;
import pe.edu.upc.dw2011cp007.repository.UsuarioExternoRepository;
import pe.edu.upc.dw2011cp007.model.UsuarioExternoModel;
import static org.junit.Assert.*;//importar todos los metodos estaticos
  


public class UsuarioExternoTest {



	UsuarioExternoRepository repository = new UsuarioExternoRepository();
	
	@Test //recordar que esto identifica que es un metodo de prueba
	public void grabarUsuarioExterno() {
		
		
		
		//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		UsuarioExternoModel usuarioExterno = new UsuarioExternoModel();
		usuarioExterno.setEmail("ylopez@hotmail.com");
		usuarioExterno.setClave("123456")	;	
		usuarioExterno.setNombres("Yonni");

		//se llama al metodo grabar
		int retorno=0;
		retorno=repository.grabarUsuarioExterno(1,usuarioExterno);
		assertTrue("No se grabo el Usuario error: "+ retorno,retorno==0);
		
		//////INGRESO DE USUARIO 2 //////////
		//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		UsuarioExternoModel usuarioExterno2 = new UsuarioExternoModel();
		usuarioExterno2.setEmail("ylvitor@hotmail.com");
		usuarioExterno2.setClave("654321")	;	
		usuarioExterno2.setNombres("Yovani");
		
		//se llama al metodo grabar
		retorno=0;
		retorno=repository.grabarUsuarioExterno(2,usuarioExterno2);
		assertTrue("No se grabo el Usuario error: "+ retorno,retorno==0);
			
		}
	}