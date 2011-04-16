package pe.edu.upc.dw2011cp007.seguridad.test;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.PerfilRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class AsignaPerfilTest {
	
	private PerfilRepository lista_perfiles;
//	private UsuarioInternoRepository lista_usuarios= new UsuarioInternoRepository();

	@BeforeClass
	public static void crear_perfil(){
		PerfilModel perfil1 = new PerfilModel();
		perfil1.setNombrePerfil("Super Usuario");
		perfil1.setDescripcionPerfil("Pruebas de asignacion");
		perfil1.setEstadoPerfil("1");
		perfil1.setVigenciaPerfil(45);
			
		PerfilModel perfil2=new PerfilModel();
		perfil2.setNombrePerfil("Administrador");
		perfil2.setDescripcionPerfil("Pruebas de asignacion2");
		perfil2.setEstadoPerfil("1");
		perfil2.setVigenciaPerfil(25);
		
		
/*		UsuarioInterno_back usuario1 = new UsuarioInterno_back();
		usuario1.setApellidoPaternoUsuario("Cuser01");
		usuario1.setApellidoMaternoUsuario("Muser01")	;	
		usuario1.setNombreUsuario("User01");
		usuario1.setUnidadTrabajo("Unidad 1");
		usuario1.setTelefonoAnexo("4261591-116");
		usuario1.setCorreo("user01@upc.edu.pe");
		usuario1.setJefeInmediato("Jefe de Ventas");
		usuario1.setTipoDocumento("DNI");
		usuario1.setNumeroDocumento("12345678");
		usuario1.setPasswordUsuario("");
		usuario1.setEstadoPassword("Vencida");
		usuario1.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
		usuario1.setNroVecesLoguedo(0);//numero de veces logueado
		
		UsuarioInterno_back usuario2 = new UsuarioInterno_back();
		usuario2.setApellidoPaternoUsuario("Cuser02");
		usuario2.setApellidoMaternoUsuario("Muser02")	;	
		usuario2.setNombreUsuario("User02");
		usuario2.setUnidadTrabajo("Unidad 2");
		usuario2.setTelefonoAnexo("48987488");
		usuario2.setCorreo("user02@upc.edu.pe");
		usuario2.setJefeInmediato("Jefecito");
		usuario2.setTipoDocumento("DNI");
		usuario2.setNumeroDocumento("98765432");
		usuario2.setPasswordUsuario("");
		usuario2.setEstadoPassword("Vencida");
		usuario2.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
		usuario2.setNroVecesLoguedo(0);//numero de veces logueado
		
		lista_perfiles.grabarperfil(perfil1);
		lista_perfiles.grabarperfil(perfil2);
//		lista_usuarios.grabarUsuario(1, usuario1);
//		lista_usuarios.grabarUsuario(2, usuario2);*/
	}
	
	//@Test
	public void asignaperfil(){
//		System.out.println(lista_usuarios.getCtrlUsuario().size()+"");
	}
}
