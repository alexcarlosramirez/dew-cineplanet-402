package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioInternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioInternoRepository;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link UsuarioInternoModel}.
 *
 * @author <ul>
 *         <li>Romeo Maita</li>
 *         <li>Yonni Lopez</li>
 *         <li>Miguel Cosio</li>
 *         <li>Alexander Ramirez</li>
 *         </ul>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class UserInternoJdbcTest {

	@Autowired
	UsuarioInternoRepository usuarioInternoRepository;

	/**
	 * Valida que el c&oacute;digo de un usuario tenga diez caracteres.
	 */
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

	/**
	 * Realiza las operaciones de una mantenimiento rapido de usuarios.
	 */
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