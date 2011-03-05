package pe.edu.upc.dw2011cp007.cartelera.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;

public interface PeliculaRepository {

	boolean registrarPelicula(PeliculaModel peliculamodel);
	boolean modificarPelicula(PeliculaModel peliculamodel);
	boolean eliminarPelicula(PeliculaModel peliculamodel);
	PeliculaModel buscarPelicula(PeliculaModel peliculamodel);
	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();
	ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno();
}
