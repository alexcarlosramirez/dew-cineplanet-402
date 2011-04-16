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
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

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

	/**
	 * Muestra la lista de peliculas a proyectarse el d�a de hoy.
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
	 * Cuando selecciona una pelicula se env�a el id de este y se busca la informaci�n.
	 */
	@Test
	public void buscarPeliculaSeleccionada() {
		int idPeliculaSel = 5;
		PeliculaModel peliculaBuscar = new PeliculaModel();
		peliculaBuscar.setIdPelicula(idPeliculaSel);

		PeliculaModel peliculaSel = carteleraService.buscarPelicula(peliculaBuscar);
		assertNotNull(peliculaSel);

		ArrayList<HorarioModel> listaHorarioPeliculaSel = carteleraService.buscarHorarioPorPelicula(peliculaSel);
		ArrayList<ArtistaModel> listaArtistaModel = carteleraService.buscarListaArtistaPorPelicula(peliculaSel);
		System.out.println("==========================================================");
		System.out.println("@Test buscarPeliculaSeleccionada");
		System.out.println("Se encontr� pelicula como " + peliculaSel);
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
}
