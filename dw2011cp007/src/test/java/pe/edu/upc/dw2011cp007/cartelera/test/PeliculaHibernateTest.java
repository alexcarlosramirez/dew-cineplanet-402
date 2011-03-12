package pe.edu.upc.dw2011cp007.cartelera.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class PeliculaHibernateTest {

	@Autowired
	private CarteleraService carteleraService;


	//@Test
	public void buscarPeliculaPorNombre() {
		PeliculaModel peliculaInsertar = new PeliculaModel();
		peliculaInsertar.setNombrepelicula("LA CAIDA DEL IMPERIO DE LAS HORMIGAS");
	
		System.out.println("==========================================================");
		System.out.println("@Test buscarPeliculaPorNombre");
		PeliculaModel peliculaBuscar = carteleraService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
	}

	@Test
	public void mantenimientoPelicula() {
		PaisModel paisModel = new PaisModel();
		paisModel.setIdPais(5);

		TipopeliculaModel tipopeliculaModel = new TipopeliculaModel();
		tipopeliculaModel.setIdTipopelicula(4);

		PeliculaModel peliculaInsertar = new PeliculaModel();
		peliculaInsertar.setNombrepelicula("EL OLIGARCA ARREMETE");
		peliculaInsertar.setPaisModel(paisModel);
		peliculaInsertar.setTipopeliculaModel(tipopeliculaModel);
		peliculaInsertar.setClasificacionPelicula("+14");
		peliculaInsertar.setDoblada(false);
		peliculaInsertar.setEn3d(false);
		peliculaInsertar.setEnestreno(true);
		peliculaInsertar.setEncartelera(true);

		System.out.println("==========================================================");
		System.out.println("@Test mantenimientoPelicula:registrarPelicula");
		carteleraService.registrarPelicula(peliculaInsertar);
		PeliculaModel peliculaBuscar = carteleraService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
		peliculaInsertar.setIdPelicula(peliculaBuscar.getIdPelicula());

		System.out.println("==========================================================");
		System.out.println("@Test mantenimientoPelicula:modificarPelicula");
		peliculaInsertar.setDoblada(true);
		peliculaInsertar.setEn3d(true);
		carteleraService.modificarPelicula(peliculaInsertar);
		peliculaBuscar = carteleraService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);

		System.out.println("==========================================================");
		System.out.println("@Test mantenimientoPelicula:eliminarPelicula");
		carteleraService.eliminarPelicula(peliculaInsertar);
		peliculaBuscar = carteleraService.buscarPelicula(peliculaInsertar);
		assertNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
	}

	/**
	 * Muestra la lista de peliculas en cartelera.
	 */
	//@Test
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
	//@Test
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