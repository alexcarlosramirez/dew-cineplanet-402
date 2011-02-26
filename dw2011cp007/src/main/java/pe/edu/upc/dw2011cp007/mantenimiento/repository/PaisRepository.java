package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;

public interface PaisRepository {

	boolean registrarPais(PaisModel paisModel);
	boolean modificarPais(PaisModel paisModel);
	boolean eliminarPais(PaisModel paisModel);
	ArrayList<PaisModel> buscarListaPais();
}
