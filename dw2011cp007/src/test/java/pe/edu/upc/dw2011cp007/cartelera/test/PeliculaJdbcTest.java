package pe.edu.upc.dw2011cp007.cartelera.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

/**
 * Test con conexi&oacute;n a base de datos de los m&eacute;todos de la clase
 * {@link PeliculaModel}.
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
public class PeliculaJdbcTest {

	@Autowired
	MantenimientoService mantenimientoService;

	/**
	 * Busca una pelicula según su nombre.
	 */
	@Test
	public void buscarPeliculaPorNombre() {
		PeliculaModel peliculaInsertar = new PeliculaModel();
		peliculaInsertar.setNombrepelicula("LA CAIDA DEL IMPERIO DE LAS HORMIGAS");

		PeliculaModel peliculaBuscar = mantenimientoService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
	}

	/**
	 * Realiza, de manera r&aacute;pida, las operaciones del mantenimiento de una pelicula.
	 * (Operaciones usadas para pruebas, el mantenimiento fue incluido en SpringRoo)
	 */
	//@Test
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
		mantenimientoService.registrarPelicula(peliculaInsertar);
		PeliculaModel peliculaBuscar = mantenimientoService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
		peliculaInsertar.setIdPelicula(peliculaBuscar.getIdPelicula());

		System.out.println("==========================================================");
		System.out.println("@Test mantenimientoPelicula:modificarPelicula");
		peliculaInsertar.setDoblada(true);
		peliculaInsertar.setEn3d(true);
		mantenimientoService.modificarPelicula(peliculaInsertar);
		peliculaBuscar = mantenimientoService.buscarPelicula(peliculaInsertar);
		assertNotNull(peliculaBuscar);
		System.out.println(peliculaBuscar);

		System.out.println("==========================================================");
		System.out.println("@Test mantenimientoPelicula:eliminarPelicula");
		mantenimientoService.eliminarPelicula(peliculaInsertar);
		peliculaBuscar = mantenimientoService.buscarPelicula(peliculaInsertar);
		assertNull(peliculaBuscar);
		System.out.println(peliculaBuscar);
	}
}