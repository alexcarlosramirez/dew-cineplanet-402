package pe.edu.upc.dw2011cp007.cartelera.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.stub.StubPeliculaImpl;

/**
 * Clase encargada de las pruebas para la consulta de cartelera y datos de pelicula
 * 
 * @author Ramirez Ruiz, Alexander
 *
 */
public class PeliculaStubTest {

	private StubPeliculaImpl stubPeliculaImpl;

	/**
	 * Se carga el stub de cartelera para su consulta final
	 */
	@Before
	public void cargarStub() {
		//inicializando stubs
		stubPeliculaImpl = new StubPeliculaImpl();
	}

	/**
	 * Se consultará la cartelera por fechas
	 */
	@Test
	public void consultarPelicula() {
		//Cuando el usuario seleccione una película de la cartelera
		//, se enviará el id de la misma y con elle se consultará la información
			//en caso seleccionase la película con id=1, existen 1, 2 y 3
		int idPeliculaSeleccionada = 1;
		PeliculaModel peliculaSeleccionada = new PeliculaModel();
		peliculaSeleccionada.setIdPelicula(idPeliculaSeleccionada);

		peliculaSeleccionada = stubPeliculaImpl.buscarPelicula(peliculaSeleccionada);

		//se verifica que se encuentre la pelicula
		assertNotNull(peliculaSeleccionada);
	}
}
