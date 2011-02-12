package pe.edu.upc.dw2011cp007;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.repository.PerfilRepository;


public class PerfilesTest {
	
	PerfilRepository repository= new PerfilRepository();
	
	
	@Test
	public void actualizarPerfil(){
		
		
	}
	
	@Test
	public void grabarperfil(){
		//PerfilRepository repository= new PerfilRepository();
		int valnombre=0;
		int retorno=0;
		HashMap<Integer, String> listadofuncion= new HashMap<Integer, String>();
		
		//SIMULACION CREACION DEL PRIMER PERFIL
		PerfilModel perfilmodel= new PerfilModel();
		valnombre=perfilmodel.setNombrePerfil("Administrador");
		perfilmodel.setDescripcionPerfil("Perfil de prueba");
		perfilmodel.setVigenciaPerfil(30);
		perfilmodel.setListadofuncion(new HashMap<Integer, String>());
		/*Se espera que la longitud de nom. perfil 
		 * sea de 5 a 30 caracteres 
		 */
		assertTrue("Error en longitud Nombre de Perfil", valnombre==0);
		retorno=repository.grabarperfil(1,perfilmodel);
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
		
		//=============================================================
		//SIMULACION CREACION DEL SEGUNDO PERFIL
		PerfilModel perfilmodel2= new PerfilModel();
		valnombre=perfilmodel2.setNombrePerfil("Operador");
		perfilmodel2.setDescripcionPerfil("Perfil de prueba");
		perfilmodel2.setVigenciaPerfil(30);
		perfilmodel2.setEstadoPerfil(1);
		perfilmodel2.setListadofuncion(new HashMap<Integer, String>());
		/*Se espera que la longitud de nom. perfil 
		 * sea de 5 a 30 caracteres 
		 */
		assertTrue("Error en longitud Nombre de Perfil", valnombre==0);
		retorno=repository.grabarperfil(2,perfilmodel2);
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
	}
	
	@Test
	public void asignarfunciones(){
		int val=0;
		grabarperfil();
		val=repository.asignarfuncion("Administrador","agregar_usuarios");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Administrador","agregar_usuarios2");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Operario","agregar_usuarios3");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Operario","agregar_usuarios4");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		System.out.println("Funcion Asignada");
		/*
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
		*/
	}
}
