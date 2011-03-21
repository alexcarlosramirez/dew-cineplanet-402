package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioInternoRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class UserInternoTest {
	
	@Autowired
	UsuarioInternoRepository usuarioInternoRepository;
	
	@Test
	public void longitudcodigousuario(){
		UsuarioInternoModel usuarioInterno= new UsuarioInternoModel();
		usuarioInterno.setUserGenApePaterno("GIL");
		usuarioInterno.setUserGenApeMaterno("GIL");
		usuarioInterno.setUserGenNombre("MAC");
		boolean res=usuarioInterno.setcodigoautogenerado();
		assertFalse(res);
		System.out.println("Codigo de Usuario debe ser mayor a 10 caracteres");
	}
	
	@Test
	public void mantenimientoUsuarioInterno(){
		UsuarioInternoModel usuarioInterno= new UsuarioInternoModel();
		
		usuarioInterno.setUserGenApePaterno("PETROVICH");
		usuarioInterno.setUserGenApeMaterno("GIL");
		usuarioInterno.setUserGenNombre("OMAIRA");
		usuarioInterno.setcodigoautogenerado();
		usuarioInterno.setUserInternoUnidadTrabajo("TECNOLOGIA");
		usuarioInterno.setUserInternoPuestotrabajo("DESARROLLADOR");
		usuarioInterno.setUserGenTelefono("2554435");
		usuarioInterno.setUserInternoAnexo("1512");
		usuarioInterno.setUserGenEmail("OMI_XXXXXX@LOQUESEA.COM");
		usuarioInterno.setUserInternoJefeInmediato(null);
		usuarioInterno.setUserGenTipoDocumento("1");
		usuarioInterno.setUserGenNumeroDocumento("43738382");
		usuarioInterno.setUserGenUsuarioPassword(usuarioInterno.getUserGenCodigo());
		usuarioInterno.setUserGenEstadopassword("2");
		usuarioInterno.setUserGenEstadoUsuario("0");
		
		//Insertar un Nuevo Registro
		boolean resInsert = usuarioInternoRepository.grabarUsuario(usuarioInterno);
		assertTrue(resInsert);
		System.out.println("Usuario "+usuarioInterno.getUserGenNombre()+ " registrado");
		
		//Buscar el registro ingresado
		usuarioInterno=usuarioInternoRepository.buscarUsuarioInternoPorCodigo("OPETROVICH");
		assertNotNull(usuarioInterno);
		System.out.println("Usuario " + usuarioInterno.getUserGenNombre() + " encontrado");
		
		//actualizar el registro
		usuarioInterno.setUserInternoUnidadTrabajo("INFRAESTRUCTURA");
		usuarioInterno.setUserInternoPuestotrabajo("SOPORTE");
		usuarioInterno.setUserGenTelefono("2554434");
		usuarioInterno.setUserInternoAnexo("1511");
		usuarioInterno.setUserInternoJefeInmediato("MCOSIOESPI");
		boolean resupdate = usuarioInternoRepository.actualizarUsuario(usuarioInterno);
		assertTrue(resupdate);
		System.out.println("Usuario "+usuarioInterno.getUserGenNombre()+ " Actualizado - Puesto: " +
				usuarioInterno.getUserInternoPuestotrabajo());
		
		usuarioInterno=usuarioInternoRepository.buscarUsuarioInternoPorCodigo("OPETROVICH");
		
		//borrar el registro
		boolean resdelete = usuarioInternoRepository.eliminarUsuario("OPETROVICH");
		assertTrue(resdelete);
		
		usuarioInterno=usuarioInternoRepository.buscarUsuarioInternoPorCodigo("OPETROVICH");
		assertNull(usuarioInterno);
		System.out.println("Usuario Eliminado");
				
	}
	
}
