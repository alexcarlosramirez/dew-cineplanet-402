package pe.edu.upc.dw2011cp007.cartelera.stub;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ArtistaRepository;

public class StubArtistaImpl implements ArtistaRepository {

	private ArrayList<ArtistaModel> listaArtistaModel;

	public StubArtistaImpl() {
		listaArtistaModel = new ArrayList<ArtistaModel>();

		ArtistaModel artistaModel = new ArtistaModel();
		artistaModel.setIdArtista(1);
		artistaModel.setNombreartista("ARTISTA 1");
		listaArtistaModel.add(artistaModel);

		artistaModel = new ArtistaModel();
		artistaModel.setIdArtista(2);
		artistaModel.setNombreartista("ARTISTA 2");
		listaArtistaModel.add(artistaModel);
	}

	public ArrayList<ArtistaModel> buscarListaArtista() {
		return listaArtistaModel;
	}

	public boolean registrarArtista(ArtistaModel artistaModel) {
		return false;
	}

	public boolean actualizarArtista(ArtistaModel artistaModel) {
		return false;
	}

	public boolean eliminarArtista(ArtistaModel artistaModel) {
		return false;
	}

	public ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaModel) {
		return null;
	}
}
