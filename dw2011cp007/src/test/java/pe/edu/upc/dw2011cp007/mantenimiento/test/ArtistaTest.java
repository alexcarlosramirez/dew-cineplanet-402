package pe.edu.upc.dw2011cp007.mantenimiento.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})


public class ArtistaTest {

	@Autowired
	MantenimientoService mantenimientoService;

	@Test
	public void mantenimientoArtista() {
		ArtistaModel artistaModel = new ArtistaModel();
		artistaModel.setIdArtista(1);
		artistaModel.setNombreartista("Romeo");

		//inserta
		boolean resInserta = mantenimientoService.registrarArtista(artistaModel);
		assertTrue(resInserta);

		ArtistaModel artistaModelBuscar = mantenimientoService.buscarartistaPorId(0);
		assertNotNull(artistaModelBuscar);
		System.out.println("inserta a + " + artistaModelBuscar);

		//actualiza
		artistaModel.setNombreartista("Romeo Aventura");
		boolean resUpdate = mantenimientoService.actualizarArtista(artistaModel);
		assertTrue(resUpdate);

		artistaModelBuscar = mantenimientoService.buscarartistaPorId(1);
		assertNotNull(artistaModelBuscar);
		System.out.println("actualiza + " + artistaModelBuscar);

		//elimina
		boolean resDelete = mantenimientoService.eliminarCine(artistaModel);
		assertTrue(resDelete);

		artistaModelBuscar = mantenimientoService.buscarartistaPorId(6);
		assertNull(artistaModelBuscar);
		System.out.println("elimina + " + artistaModelBuscar);
	}
}
