package pe.edu.upc.dw2011cp007.cartelera.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;

public interface HorarioRepository {

	ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera();

	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);
}
