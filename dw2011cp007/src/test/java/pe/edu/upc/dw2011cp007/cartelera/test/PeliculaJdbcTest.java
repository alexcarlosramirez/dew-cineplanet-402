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
@ContextConfiguration(
		locations={
				"classpath:pe/edu/upc/dw2011cp007/config/test-infrastructure-config.xml",
				"classpath:pe/edu/upc/dw2011cp007/config/application-config.xml"})
public class PeliculaJdbcTest {

	@Autowired
	CarteleraService carteleraService;

	//@Test
	public void registrarPelicula() {
	}
	//@Test
	public void modificarPelicula() {
		
	}
	//@Test
	public void eliminarPelicula() {
		
	}
	@Test
	public void buscarPelicula() {
		//peliculas de estreno
		ArrayList<PeliculaModel> listaPelicula = carteleraService.buscarListaPeliculaEnCartelera();
		for (PeliculaModel peliculaModel : listaPelicula) {
			System.out.println(peliculaModel);
		}
		assertTrue(listaPelicula.size()>0);
	}
}
