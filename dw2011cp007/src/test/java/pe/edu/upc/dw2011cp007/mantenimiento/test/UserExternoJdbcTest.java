package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.UsuarioExternoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.UsuarioExternoRepository;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link UsuarioExternoModel}.
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
public class UserExternoJdbcTest {
	@Autowired
	UsuarioExternoRepository usuarioExternoRepository;

	/**
	 * Realiza las operaciones de un mantenimiento de un usuario externo. Es decir, un usuario cliente del cine.
	 */
	@Test
	public void mantenimientousuarioExternoModel(){
		UsuarioExternoModel usuarioExternoModel= new UsuarioExternoModel();

		usuarioExternoModel.setUserGenCodigo("PRUEBA01");
		usuarioExternoModel.setUserGenApePaterno("PETROVICH");
		usuarioExternoModel.setUserGenApeMaterno("GIL");
		usuarioExternoModel.setUserGenNombre("OMAIRA");
		usuarioExternoModel.setUserGenTelefono("2554435");
		usuarioExternoModel.setUsuarioExternoDireccion("AV LAS GAVIOTAS 355 - SURQUILLO");
		usuarioExternoModel.setUserGenEmail("OMI_XXXXXX@LOQUESEA.COM");
		usuarioExternoModel.setUserGenTipoDocumento("1");
		usuarioExternoModel.setUserGenNumeroDocumento("43738382");
		usuarioExternoModel.setUsuarioExternoPremium(false);
		usuarioExternoModel.setUserGenUsuarioPassword(usuarioExternoModel.getUserGenCodigo());
		usuarioExternoModel.setUserGenEstadopassword("2");
		usuarioExternoModel.setUserGenEstadoUsuario("0");

		boolean resinsert= usuarioExternoRepository.grabarUsuario(usuarioExternoModel);
		assertTrue(resinsert);
		System.out.println("Usuario: " + usuarioExternoModel.getUserGenApePaterno() + " registrado");

		//Buscar el registro ingresado
		usuarioExternoModel=usuarioExternoRepository.buscarUsuarioExternoPorUsuario("PRUEBA01");
		assertNotNull(usuarioExternoModel);
		System.out.println("Usuario " + usuarioExternoModel.getUserGenNombre() + " encontrado");
		/*
		System.out.println(usuarioExternoModel.getUserGenCodigo());
		System.out.println(usuarioExternoModel.getUserGenApePaterno());
		System.out.println(usuarioExternoModel.getUserGenApeMaterno());
		System.out.println(usuarioExternoModel.getUserGenNombre());
		System.out.println(usuarioExternoModel.getUserGenTipoDocumento());
		System.out.println(usuarioExternoModel.getUserGenNumeroDocumento());
		System.out.println(usuarioExternoModel.getUserGenEmail());
		System.out.println(usuarioExternoModel.isUsuarioExternoPremium());
		System.out.println(usuarioExternoModel.getUsuarioExternoDireccion());
		System.out.println(usuarioExternoModel.getUserGenTelefono());
		System.out.println(usuarioExternoModel.getUserGenUsuarioPassword());
		System.out.println(usuarioExternoModel.getUserGenEstadoUsuario());
		System.out.println(usuarioExternoModel.getUserGenEstadopassword());
		System.out.println(usuarioExternoModel.getUserGenFechaRegistro());
		*/

		//actualizar el registro
		usuarioExternoModel.setUserGenApePaterno("PETROVICH");
		usuarioExternoModel.setUserGenApeMaterno("GILGIL");
		usuarioExternoModel.setUserGenNombre("OMAYRA");
		usuarioExternoModel.setUserGenTelefono("2554434");
		usuarioExternoModel.setUsuarioExternoPremium(true);
		boolean resupdate = usuarioExternoRepository.actualizarUsuario(usuarioExternoModel);
		assertTrue(resupdate);
		System.out.println("Usuario "+ usuarioExternoModel.getUserGenNombre()+ " Actualizado - Premium: " + usuarioExternoModel.isUsuarioExternoPremium());

		usuarioExternoModel=usuarioExternoRepository.buscarUsuarioExternoPorUsuario("PRUEBA01");

		//borrar el registro
		boolean resdelete = usuarioExternoRepository.eliminarUsuario("PRUEBA01");
		assertTrue(resdelete);

		usuarioExternoModel=usuarioExternoRepository.buscarUsuarioExternoPorUsuario("OPETROVICH");
		assertNull(usuarioExternoModel);
		System.out.println("Usuario Eliminado");
	}
}