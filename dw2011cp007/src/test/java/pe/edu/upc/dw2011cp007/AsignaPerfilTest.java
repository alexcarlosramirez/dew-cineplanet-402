package pe.edu.upc.dw2011cp007;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import pe.edu.upc.dw2011cp007.model.PerfilModel;
import pe.edu.upc.dw2011cp007.repository.PerfilRepository;

public class AsignaPerfilTest {
	
	static PerfilRepository lista_perfiles=new PerfilRepository();
	
	@BeforeClass
	public static void crear_perfil(){
		PerfilModel perfil1 = new PerfilModel();
		perfil1.setNombrePerfil("Super Usuario");
		perfil1.setDescripcionPerfil("Pruebas de asignacion");
		perfil1.setEstadoPerfil(1);
		perfil1.setVigenciaPerfil(45);
		perfil1.setListadofuncion(new HashMap<Integer, String>());
		lista_perfiles.grabarperfil(perfil1);
		//lista_perfiles.getCtrlPerfil().size();
		System.out.println(lista_perfiles.getCtrlPerfil().size()+"");
		
		//perfil1=null;
		System.out.println(lista_perfiles.getCtrlPerfil().size()+"");
		
		PerfilModel perfil2=new PerfilModel();
		perfil2.setNombrePerfil("Administrador");
		perfil2.setDescripcionPerfil("Pruebas de asignacion2");
		perfil2.setEstadoPerfil(1);
		perfil2.setVigenciaPerfil(25);
		perfil2.setListadofuncion(new HashMap<Integer, String>());
		lista_perfiles.grabarperfil(perfil2);
		System.out.println(lista_perfiles.getCtrlPerfil().size()+"");
	}
	
	@Test
	public void asignaperfil(){
		System.out.println("Prueba");
	}
}
