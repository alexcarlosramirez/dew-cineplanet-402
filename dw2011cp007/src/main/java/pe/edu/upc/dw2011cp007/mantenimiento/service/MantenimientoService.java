package pe.edu.upc.dw2011cp007.mantenimiento.service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;

public interface MantenimientoService {

	boolean registrarCine(CineModel cineModel);

	boolean actualizarCine(CineModel cineModel);

	boolean eliminarCine(CineModel cineModel);

	CineModel buscarCinePorId(int i);

}
