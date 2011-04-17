package pe.edu.upc.dw2011cp007.cartelera.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;

public interface HorarioRepository {
	ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy();

	ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaSel);
}
