package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations={
				"classpath:pe/edu/upc/dw2011cp007/config/test-infrastructure-config.xml",
				"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class CineTest {

	@Autowired
	MantenimientoService mantenimientoService;

	@Test
	public void mantenimientoCine() {
		CineModel cineModel = new CineModel();
		cineModel.setIdCine(6);
		cineModel.setNombrecine("AZANGARO 3D");

		//inserta
		boolean resInserta = mantenimientoService.registrarCine(cineModel);
		assertTrue(resInserta);

		CineModel cineModelBuscar = mantenimientoService.buscarCinePorId(6);
		assertNotNull(cineModelBuscar);
		System.out.println("inserta + " + cineModelBuscar);

		//actualiza
		cineModel.setNombrecine("MALVINAS 4D");
		boolean resUpdate = mantenimientoService.actualizarCine(cineModel);
		assertTrue(resUpdate);

		cineModelBuscar = mantenimientoService.buscarCinePorId(6);
		assertNotNull(cineModelBuscar);
		System.out.println("actualiza + " + cineModelBuscar);

		//elimina
		boolean resDelete = mantenimientoService.eliminarCine(cineModel);
		assertTrue(resDelete);

		cineModelBuscar = mantenimientoService.buscarCinePorId(6);
		assertNull(cineModelBuscar);
		System.out.println("elimina + " + cineModelBuscar);
	}
}
