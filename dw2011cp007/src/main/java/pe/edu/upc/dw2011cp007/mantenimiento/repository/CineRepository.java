package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;


public interface CineRepository {

	boolean registrarCine(CineModel cineModel);
	boolean modificarCine(CineModel cineModel);
	boolean eliminarCine(CineModel cineModel);
	ArrayList<CineModel> buscarListaCine();
}
