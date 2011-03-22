package pe.edu.upc.dw2011cp007.seguridad;

import static org.junit.Assert.*;


import org.junit.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.seguridad.model.PerfilModel;
import pe.edu.upc.dw2011cp007.seguridad.repository.PerfilRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class PerfilesTest {

	@Autowired
	PerfilRepository perfilRepository;


	@Test
	public void mantenimientoperfil(){
		
		PerfilModel perfilModel=new PerfilModel();
		int res=perfilModel.setNombrePerfil("INVITADO");
		perfilModel.setDescripcionPerfil("USUARIO INVITADO AL SISTEMA");
		perfilModel.setVigenciaPerfil(30);
		perfilModel.setEstadoPerfil("1");
		/*Se espera que la longitud de nom. perfil 
		 * sea de 5 a 30 caracteres 
		 */
		assertTrue("Error en longitud Nombre de Perfil", res>=0);
		boolean resinsert=perfilRepository.grabarperfil(perfilModel);
		assertTrue(resinsert);
		System.out.println("Perfil: "+ perfilModel.getNombrePerfil()+ " Registrado");
		
		//Buscar Perfil
		perfilModel=perfilRepository.buscarperfil("INVITADO");
		assertNotNull(perfilModel);
		System.out.println("Perfil: " + perfilModel.getNombrePerfil()+" Encontrado - ID: " 
							+ perfilModel.getIdPerfil()+ "-" 
							+perfilModel.getVigenciaPerfil());
		
		//actualizar Perfil
		perfilModel.setVigenciaPerfil(45);
		boolean resupdate=perfilRepository.actualizarPerfil(perfilModel);
		assertTrue(resupdate);
		System.out.println("Perfil: " + perfilModel.getNombrePerfil()+" Actualizado - ID: " 
							+ perfilModel.getIdPerfil()+ "-" 
							+perfilModel.getVigenciaPerfil());
		
		perfilModel=perfilRepository.buscarperfil("INVITADO");
		
		//borrar Perfil
		boolean resdelete=perfilRepository.eliminarPerfil("INVITADO");
		assertTrue(resdelete);
		perfilModel=perfilRepository.buscarperfil("INVITADO");
		assertNull(perfilModel);
		System.out.println("Perfil Eliminado");
		
	}

	//@Test
	public void asignarfunciones(){
		
	}

}