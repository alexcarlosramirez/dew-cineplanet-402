package pe.edu.upc.dw2011cp007.cartelera.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;

public interface CarteleraService {

	PeliculaModel buscarPelicula(PeliculaModel peliculaSel);

	boolean registrarPelicula(PeliculaModel peliculaModel);

	boolean modificarPelicula(PeliculaModel peliculaModel);

	boolean eliminarPelicula(PeliculaModel peliculaModel);

	ArrayList<PeliculaModel> buscarListaPelicula(PeliculaModel peliculaBuscar, CineModel cineModel);

	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();

	ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno();

	ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy();

	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);

	ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaSel);
}
