package pe.edu.upc.dw2011cp007.cartelera.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public interface CarteleraService {

	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();

	PeliculaModel buscarPeliculaPorId(int idPelicula);

	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);

	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(
			PeliculaModel peliculaSel);
}
