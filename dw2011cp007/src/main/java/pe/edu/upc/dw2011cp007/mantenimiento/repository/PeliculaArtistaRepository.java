package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;

public interface PeliculaArtistaRepository {

	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(
			PeliculaModel peliculaModel);

}
