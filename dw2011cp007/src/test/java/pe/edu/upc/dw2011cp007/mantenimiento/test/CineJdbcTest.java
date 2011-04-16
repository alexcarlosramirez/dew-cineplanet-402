package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link CineModel}.
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
public class CineJdbcTest {

	@Autowired
	MantenimientoService mantenimientoService;

	/**
	 * Realiza las operaciones del mantenimiento de salas de cines.
	 * (Operaciones usadas para pruebas, el mantenimiento fue incluido en SpringRoo)
	 */
	@Test
	public void mantenimientoCine() {
		CineModel cineModel = new CineModel();
		cineModel.setNombrecine("AZANGARO 3D");

		//inserta
		boolean resInserta = mantenimientoService.registrarCine(cineModel);
		assertTrue(resInserta);

		cineModel = mantenimientoService.buscarCinePorNombre("AZANGARO 3D");
		assertNotNull(cineModel);
		System.out.println("inserta -> " + cineModel);

		//actualiza
		cineModel.setNombrecine("MALVINAS 4D");
		boolean resUpdate = mantenimientoService.actualizarCine(cineModel);
		assertTrue(resUpdate);

		cineModel = mantenimientoService.buscarCinePorNombre("MALVINAS 4D");
		assertNotNull(cineModel);
		System.out.println("actualiza -> " + cineModel);

		//elimina
		boolean resDelete = mantenimientoService.eliminarCine(cineModel);
		assertTrue(resDelete);

		cineModel = mantenimientoService.buscarCinePorNombre("CINEPLANET AREQUIPA");
		assertNotNull(cineModel);
		System.out.println("elimina -> " + cineModel);
	}
}
