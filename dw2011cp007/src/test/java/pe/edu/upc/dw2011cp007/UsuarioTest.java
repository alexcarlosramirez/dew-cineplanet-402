package pe.edu.upc.dw2011cp007;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;
import pe.edu.upc.dw2011cp007.seguridad.model.UsuarioModel;
import pe.edu.upc.dw2011cp007.seguridad.service.SeguridadService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class UsuarioTest {
	@Autowired
	SeguridadService seguridadService;

	@Test
	
	
	public void mantenimientoUsuario() {
			//DATOS A ENVIAR PARA EL INGRESO DE USUARIO
		
			UsuarioModel usuario = new UsuarioModel();
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
			
			/*
			UsuarioModel usuario2 = new UsuarioModel();
			//generamos codigo
			boolean resGenera = seguridadService.generaCodigoUsuario(usuario);
			assertTrue(resGenera);
			*/
			
			//busca por codigo codigo
			usuario = seguridadService.buscarUsuarioPorId("YLopezVito");
			assertNull(usuario);
			//System.out.println("mirar -> " + usuario2);
			
			/*
			assertTrue(resGenera);			
			//se llama al metodo Insertar usuario
			boolean resInserta = seguridadService.registrarUsuario(usuario);
			assertTrue(resInserta);
			*/
			
	}
	
}