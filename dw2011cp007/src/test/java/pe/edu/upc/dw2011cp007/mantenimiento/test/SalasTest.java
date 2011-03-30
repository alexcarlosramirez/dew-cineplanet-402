package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})

public class SalasTest {


	@Autowired
	MantenimientoService mantenimientoService;

	@Test
	public void mantenimientoSalas() {
		SalasModel salasModel = new SalasModel();
		salasModel.setNombreSala("Sala 1");
		salasModel.setIdCine(1);

		//inserta
		boolean resInserta = mantenimientoService.registrarSala(salasModel);
		assertTrue(resInserta);

		salasModel = mantenimientoService.buscarSalaPorNombre("Sala 1");
		assertNotNull(salasModel);
		System.out.println("inserta -> " + salasModel);

		//actualiza
		salasModel.setNombreSala("Sala 2");
		boolean resUpdate = mantenimientoService.actualizarSala(salasModel);
		assertTrue(resUpdate);

		salasModel = mantenimientoService.buscarSalaPorNombre("Sala 2");
		assertNotNull(salasModel);
		System.out.println("actualiza -> " + salasModel);

		//elimina
		boolean resDelete = mantenimientoService.eliminarSala(salasModel);
		assertTrue(resDelete);
		
		System.out.println("elimina -> " + salasModel);
		/*
		SalasModel = mantenimientoService.buscarSalaPorNombre("Sala 2");
		assertNotNull(SalasModel);
		System.out.println("elimina -> " + SalasModel);
		*/
	}
	
	
}
