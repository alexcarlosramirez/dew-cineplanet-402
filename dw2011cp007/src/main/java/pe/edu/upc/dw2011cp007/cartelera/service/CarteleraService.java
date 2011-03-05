package pe.edu.upc.dw2011cp007.cartelera.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public interface CarteleraService {

	PeliculaModel buscarPeliculaPorId(int idPelicula);

	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();

	ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno();

	ArrayList<PeliculaModel> buscarListaPeliculaProyectarHoy();

	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);

	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaSel);
}
