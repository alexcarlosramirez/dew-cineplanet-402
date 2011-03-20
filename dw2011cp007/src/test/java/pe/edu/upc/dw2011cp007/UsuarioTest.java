package pe.edu.upc.dw2011cp007;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.seguridad.service.SeguridadService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class UsuarioTest {
	@Autowired
	SeguridadService seguridadService;
	
	UsuarioModel usuario = new UsuarioModel();
	UsuarioModel usuario2 = new UsuarioModel();
	@Test
	

	public void GenerarCodigo() {
			//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		
			
			usuario.setApellidoPaternoUsuario("Lopez");
			usuario.setApellidoMaternoUsuario("Vitor")	;	
			usuario.setNombreUsuario("Yonni");
			usuario.setUnidadTrabajo("Unidad 1");
			usuario.setPuestoLaboral("Sistemas");
			usuario.setTelefonoAnexo("4261591");
			usuario.setNroAnexo("116");
			usuario.setCorreo("u201021071@upc.edu.pe");
			usuario.setJefeInmediato("Loquillo");
			usuario.setTipoDocumento("DNI");
			usuario.setNumeroDocumento("43689535");
			usuario.setPasswordUsuario("");
			usuario.setEstadoPassword("Vencida");
			usuario.setEstadoUsuario("Activo");  //Activo, Suspendido o Bloqueado. 
			usuario.setNroVecesLoguedo(0);//numero de veces logueado
			//generamos codigo
			boolean resGenera = seguridadService.generaCodigoUsuario(usuario);
			assertTrue(resGenera);
	
	}
			
	@Test
	public void VerificarDuplicidad() {
				
		GenerarCodigo();
			
			//busca por codigo codigo
			usuario2 = seguridadService.buscarUsuarioPorId(usuario.getIdUsuario());
			assertNull("ya existe codigo",usuario2);
			
	}	
	
	@Test		
	public void InsertarUsuario() {
	
		GenerarCodigo();	
		
		//se llama al metodo Insertar usuario
		boolean resInserta = seguridadService.registrarUsuario(usuario);
		assertTrue(resInserta);
	}

	@Test		
	public void EliminaUsuario() {	
	GenerarCodigo();
	//elimina
		boolean resDelete = seguridadService.eliminarUsuario(usuario);
		assertTrue(resDelete);
			
}
	
	
	
}