package pe.edu.upc.dw2011cp007.seguridad.repository;

import java.util.List;

import pe.edu.upc.dw2011cp007.seguridad.model.FuncionModel;

public interface FuncionRepository {
	
	public List<FuncionModel> obtenerListaFunciones();
}
