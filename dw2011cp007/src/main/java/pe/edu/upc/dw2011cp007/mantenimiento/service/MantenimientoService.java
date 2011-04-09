package pe.edu.upc.dw2011cp007.mantenimiento.service;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CombosModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;

public interface MantenimientoService {

	boolean registrarCine(CineModel cineModel);

	boolean actualizarCine(CineModel cineModel);

	boolean eliminarCine(CineModel cineModel);

	CineModel buscarCinePorId(int i);

	ArrayList<CineModel> buscarListaCine();

	CineModel buscarCinePorNombre(String string);

	boolean registrarArtista(ArtistaModel artistaModel);

	ArtistaModel buscarartistaPorId(int i);

	boolean actualizarArtista(ArtistaModel artistaModel);

	boolean eliminarCine(ArtistaModel artistaModel);

	boolean registrarCombo(CombosModel combosModel);

	CombosModel buscarComboPorNombre(String string);

	boolean actualizarCombo(CombosModel combosModel);

	boolean eliminarCombo(CombosModel combosModel);

	boolean registrarSala(SalasModel salasModel);

	SalasModel buscarSalaPorNombre(String string);

	boolean actualizarSala(SalasModel salasModel);

	boolean eliminarSala(SalasModel salasModel);

	ArrayList<ProductoModel> buscarListaProductoPorPelicula(
			PeliculaModel peliculaModel);

	
}
