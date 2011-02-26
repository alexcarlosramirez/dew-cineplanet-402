package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import pe.edu.upc.dw2011cp007.mantenimiento.model.SalaModel;


public interface SalaRepository {

	boolean registrarSala(SalaModel salaModel);
	boolean modificarSala(SalaModel salaModel);
	boolean eliminarSala(SalaModel salaModel);
}
