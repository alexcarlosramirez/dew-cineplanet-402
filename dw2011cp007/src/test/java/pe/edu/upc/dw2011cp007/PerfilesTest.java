package pe.edu.upc.dw2011cp007;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.*;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.repository.PerfilRepository;


public class PerfilesTest {
	
	PerfilRepository repository= new PerfilRepository();
	
	
	@Test
	public void cambiarvigencia(){
		int retorno=0;
		grabarperfil();
		retorno=repository.actualizarvigencia("Administrador",50);
		assertTrue("Vigencia no fue alterada", retorno==0);
		
	}
	
	@Test
	public void grabarperfil(){
		//PerfilRepository repository= new PerfilRepository();
		int valnombre=0;
		int retorno=0;
		//HashMap<Integer, String> listadofuncion= new HashMap<Integer, String>();
		
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
		retorno=repository.grabarperfil(perfilmodel);
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
		
		//=============================================================
		//SIMULACION CREACION DEL SEGUNDO PERFIL
		PerfilModel perfilmodel2= new PerfilModel();
		valnombre=perfilmodel2.setNombrePerfil("Invitado");
		perfilmodel2.setDescripcionPerfil("Perfil de prueba");
		perfilmodel2.setVigenciaPerfil(30);
		perfilmodel2.setEstadoPerfil(1);
		perfilmodel2.setListadofuncion(new HashMap<Integer, String>());
		
		//Se espera que la longitud de nom. perfil sea de 5 a 30 caracteres 
		assertTrue("Error en longitud Nombre de Perfil", valnombre==0);
		retorno=repository.grabarperfil(perfilmodel2);
		//Verifica que el nombre del Perfil no se duplique
		assertTrue("No se grabo el perfil error: "+ retorno,retorno==0);
	}
	
	@Test
	public void asignarfunciones(){
		int val=0;
		grabarperfil();
		val=repository.asignarfuncion("Administrador","agregar_usuarios");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Administrador","agregar_usuarios2");
		//Verifica que la funcion no sea asignada 2 veces al mismo Perfil 
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Administrador","agregar_usuarios3");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Administrador","agregar_usuarios4");
		val=repository.asignarfuncion("Administrador","agregar_usuarios5");
		val=repository.asignarfuncion("Administrador","agregar_usuarios6");
		val=repository.asignarfuncion("Administrador","agregar_usuarios7");
		val=repository.asignarfuncion("Administrador","agregar_usuarios8");
		val=repository.asignarfuncion("Administrador","agregar_usuarios9");
		val=repository.asignarfuncion("Administrador","agregar_usuarios10");
		val=repository.asignarfuncion("Administrador","agregar_usuarios11");
		val=repository.asignarfuncion("Administrador","agregar_usuarios12");
		val=repository.asignarfuncion("Administrador","agregar_usuarios13");
		val=repository.asignarfuncion("Administrador","agregar_usuarios14");
		val=repository.asignarfuncion("Administrador","agregar_usuarios15");
		val=repository.asignarfuncion("Administrador","agregar_usuarios16");
		val=repository.asignarfuncion("Administrador","agregar_usuarios17");
		val=repository.asignarfuncion("Administrador","agregar_usuarios18");
		val=repository.asignarfuncion("Administrador","agregar_usuarios19");
		val=repository.asignarfuncion("Administrador","agregar_usuarios20");
		val=repository.asignarfuncion("Administrador","agregar_usuarios21");
		val=repository.asignarfuncion("Administrador","agregar_usuarios22");
		val=repository.asignarfuncion("Administrador","agregar_usuarios23");
		val=repository.asignarfuncion("Administrador","agregar_usuarios24");
		
		/*val=repository.asignarfuncion("Operador","agregar_usuarios3");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		val=repository.asignarfuncion("Operador","agregar_usuarios4");
		assertTrue("Funcion ya asignada al Perfil",val==0);
		System.out.println("Funcion Asignada");*/

	}
	
	@Test
	public void ver_informacion(){
		PerfilModel perfil_buscado;//=new PerfilModel();
		grabarperfil();
		perfil_buscado=repository.buscarperfil("Administrador");
		assertNotNull("Informacion no se guardo correctamente", perfil_buscado);
		System.out.println(perfil_buscado.getIdPerfil()+"");
		System.out.println(perfil_buscado.getNombrePerfil());
		System.out.println(perfil_buscado.getDescripcionPerfil());
		System.out.println(perfil_buscado.getVigenciaPerfil()+"");
		System.out.println(perfil_buscado.getEstadoPerfil()+"");
		System.out.println("Tiene "+perfil_buscado.getListadofuncion().size()+ "funcion(es) Asignadas(s)");
	}
}
