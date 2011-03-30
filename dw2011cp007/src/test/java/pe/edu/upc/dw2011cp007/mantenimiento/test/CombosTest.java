package pe.edu.upc.dw2011cp007.mantenimiento.test;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import pe.edu.upc.dw2011cp007.mantenimiento.model.CombosModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})

public class CombosTest {

	@Autowired
	MantenimientoService mantenimientoService;

	@Test
	public void mantenimientoCombos() {
		CombosModel combosModel = new CombosModel();
		combosModel.setNombreCombo("COMBO 1");

		//inserta
		boolean resInserta = mantenimientoService.registrarCombo(combosModel);
		assertTrue(resInserta);

		combosModel = mantenimientoService.buscarComboPorNombre("COMBO 1");
		assertNotNull(combosModel);
		System.out.println("inserta -> " + combosModel);

		//actualiza
		combosModel.setNombreCombo("COMBO 2");
		boolean resUpdate = mantenimientoService.actualizarCombo(combosModel);
		assertTrue(resUpdate);

		combosModel = mantenimientoService.buscarComboPorNombre("COMBO 2");
		assertNotNull(combosModel);
		System.out.println("actualiza -> " + combosModel);

		//elimina
		boolean resDelete = mantenimientoService.eliminarCombo(combosModel);
		assertTrue(resDelete);
		
		System.out.println("elimina -> " + combosModel);
		/*
		combosModel = mantenimientoService.buscarComboPorNombre("COMBO 2");
		assertNotNull(combosModel);
		System.out.println("elimina -> " + combosModel);
		*/
	}
}
