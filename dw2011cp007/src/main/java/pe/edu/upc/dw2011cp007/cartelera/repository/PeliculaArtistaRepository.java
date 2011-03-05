package pe.edu.upc.dw2011cp007.cartelera.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public interface PeliculaArtistaRepository {

	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(
			PeliculaModel peliculaModel);

}
