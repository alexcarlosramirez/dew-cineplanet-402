package pe.edu.upc.dw2011cp007.cartelera.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class HorarioJdbcTest {

	@Autowired
	CarteleraService carteleraService;

	/**
	 * Muestra la lista de peliculas a proyectarse el día de hoy.
	 */

	@Test
	public void buscarListaPeliculaProyectarHoy() {
		ArrayList<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaProyectarHoy();
		assertTrue(listaPelicula.size()>0);

		System.out.println("==========================================================");
		System.out.println("@Test buscarListaPeliculaProyectarHoy");
		System.out.println("Se encontraron " + listaPelicula.size() + " peliculas.");
		for (PeliculaModel peliculaModel : listaPelicula) {
			System.out.println(peliculaModel);
		}
		System.out.println("==========================================================");
	}
}
