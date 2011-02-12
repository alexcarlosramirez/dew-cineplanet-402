package pe.edu.upc.dw2011cp007;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.repository.PerfilRepository;


public class PerfilesTest {
	
	@Before
	public void funciones(){
	
	}
	
	@Test
	public void actualizarPerfil(){
		PerfilRepository repository= new PerfilRepository();
		
	}
	
	@Test
	public void grabarperfil(){
		PerfilRepository repository= new PerfilRepository();
		int valnombre=0;
		int retorno=0;
		HashMap<Integer, String> listadofuncion= new HashMap<Integer, String>();
		PerfilModel perfilmodel= new PerfilModel();
		valnombre=perfilmodel.setNombrePerfil("Administrador");
		perfilmodel.setDescripcionPerfil("Perfil de prueba");
		perfilmodel.setVigenciaPerfil(30);
		perfilmodel.setEstadoPerfil(1);
		listadofuncion.put(1, "agregar_usuarios");
		listadofuncion.put(2, "eliminar_usuarios");
		listadofuncion.put(4, "actualizar_usuarios");
		listadofuncion.put(5, "agregar_peliculas");
		listadofuncion.put(6, "eliminar_peliculas");
		listadofuncion.put(7, "actualizar_peliculas");
		listadofuncion.put(8, "actualizar_cartelera");
		listadofuncion.put(9, "reinicilizar_password");
		listadofuncion.put(10, "otro");
		perfilmodel.setListadofuncion(listadofuncion);
	
		/*Se espera que la longitud de nom. perfil 
		 * sea de 5 a 30 caracteres 
		 */
		assertTrue("Error en Nombre de Perfil", valnombre==0);
		retorno=repository.grabarperfil(1,perfilmodel);
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
		
		//Grabando Segundo Perfil
		PerfilModel perfilmodel2= new PerfilModel();
		valnombre=perfilmodel2.setNombrePerfil("Operador");
		perfilmodel2.setDescripcionPerfil("Perfil de prueba");
		perfilmodel2.setVigenciaPerfil(30);
		perfilmodel2.setEstadoPerfil(1);
		listadofuncion.put(1, "agregar_usuarios");
		listadofuncion.put(2, "eliminar_usuarios");
		listadofuncion.put(4, "actualizar_usuarios");
		listadofuncion.put(5, "agregar_peliculas");
		listadofuncion.put(6, "eliminar_peliculas");
		listadofuncion.put(7, "actualizar_peliculas");
		listadofuncion.put(8, "actualizar_cartelera");
		listadofuncion.put(9, "reinicilizar_password");
		listadofuncion.put(10, "otro");
		perfilmodel2.setListadofuncion(listadofuncion);
	
		/*Se espera que la longitud de nom. perfil 
		 * sea de 5 a 30 caracteres 
		 */
		assertTrue("Error en Nombre de Perfil", valnombre==0);
		retorno=repository.grabarperfil(2,perfilmodel2);
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
	}
}