package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;

public interface  SalasRepository {
	boolean registrarSala(SalasModel salaModel);
	boolean modificarSala(SalasModel salaModel);
	boolean eliminarSala(SalasModel salaModel);
	ArrayList<SalasModel> buscarListaSala();
}
