package pe.edu.upc.dw2011cp007.cartelera.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link HorarioModel}.
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
public class HorarioJdbcTest {

	@Autowired
	CarteleraService carteleraService;
	@Autowired
	MantenimientoService mantenimientoService;

	/**
	 * Muestra la lista de peliculas a proyectarse el día de hoy.
	 */
	@Test
	public void buscarListaPeliculaProyectarHoy() {
		ArrayList<HorarioModel> listaHorarioPeliculaSel = carteleraService.buscarListaPeliculaProyectarHoy();
		assertTrue(listaHorarioPeliculaSel.size()>0);

		System.out.println("==========================================================");
		System.out.println("@Test buscarListaPeliculaProyectarHoy");
		for (HorarioModel horarioModel : listaHorarioPeliculaSel) {
			System.out.println(
					"la pelicula "
					+ horarioModel.getPeliculaCineModel().getPeliculaModel().getNombrepelicula()
					+ " se proyecta en:");
			System.out.println(
					"\t" + horarioModel.getPeliculaCineModel().getCineModel().getNombrecine()
					+ " el " + horarioModel.getDiahorario()
					+ " a las " + horarioModel.getHorashorario());
		}
		System.out.println("==========================================================");
	}

	/**
	 * Cuando selecciona una pelicula se envía el id de este y se busca la información.
	 */
	@Test
	public void buscarPeliculaSeleccionada() {
		int idPeliculaSel = 5;
		PeliculaModel peliculaBuscar = new PeliculaModel();
		peliculaBuscar.setIdPelicula(idPeliculaSel);

		PeliculaModel peliculaSel = mantenimientoService.buscarPelicula(peliculaBuscar);
		assertNotNull(peliculaSel);

		ArrayList<HorarioModel> listaHorarioPeliculaSel = carteleraService.buscarHorarioPorPelicula(peliculaSel);
		ArrayList<ArtistaModel> listaArtistaModel = mantenimientoService.buscarListaArtistaPorPelicula(peliculaSel);
		System.out.println("==========================================================");
		System.out.println("@Test buscarPeliculaSeleccionada");
		System.out.println("Se encontró pelicula como " + peliculaSel);
		System.out.println("Se proyecta en:");
		for (HorarioModel horarioModel : listaHorarioPeliculaSel) {
			System.out.println(horarioModel.getPeliculaCineModel().getCineModel().getNombrecine()
					+ " el " + horarioModel.getDiahorario()
					+ " a las " + horarioModel.getHorashorario());
		}
		System.out.println("Actuan:");
		for (ArtistaModel artistaModel : listaArtistaModel) {
			System.out.println(artistaModel.getNombreartista());
		}
		System.out.println("==========================================================");
	}

	/**
	 * Muestra la lista de peliculas en cartelera.
	 */
	@Test
	public void buscarListaPeliculaEnCartelera() {
		ArrayList<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnCartelera();
		assertTrue(listaPelicula.size()>0);

		System.out.println("==========================================================");
		System.out.println("@Test buscarListaPeliculaEnCartelera");
		System.out.println("Se encontraron " + listaPelicula.size() + " peliculas.");
		for (PeliculaModel peliculaModel : listaPelicula) {
			System.out.println(peliculaModel);
		}
		System.out.println("==========================================================");
	}

	/**
	 * Permite al usuario consultar la lista de cines y la programación de peliculas de cada uno.
	 * Se considera pelicula en estreno aquella que tiene se proyectan hoy por primera vez
	 */
	@Test
	public void buscarListaPeliculaEnEstreno() {
		ArrayList<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnEstreno();
		assertTrue(listaPelicula.size()>0);

		System.out.println("==========================================================");
		System.out.println("@Test buscarListaPeliculaEnEstreno");
		System.out.println("Se encontraron " + listaPelicula.size() + " peliculas.");
		for (PeliculaModel peliculaModel : listaPelicula) {
			System.out.println(peliculaModel);
		}
		System.out.println("==========================================================");
	}
}
