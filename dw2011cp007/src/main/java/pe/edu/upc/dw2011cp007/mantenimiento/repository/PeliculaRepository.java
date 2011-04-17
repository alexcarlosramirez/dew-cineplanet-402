package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;
import java.util.List;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;

public interface PeliculaRepository {

	boolean registrarPelicula(PeliculaModel peliculamodel);
	boolean modificarPelicula(PeliculaModel peliculamodel);
	boolean eliminarPelicula(PeliculaModel peliculamodel);
	PeliculaModel buscarPelicula(PeliculaModel peliculamodel);
	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();
	ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno();
	ArrayList<PeliculaModel> buscarListaPelicula(PeliculaModel peliculaBuscar, CineModel cineModel);
	List<PeliculaModel> buscarListaPeliculaHoy();
}
