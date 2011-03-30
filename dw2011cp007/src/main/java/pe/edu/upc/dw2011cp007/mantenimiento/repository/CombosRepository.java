package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CombosModel;

public interface CombosRepository {
	boolean registrarCombo(CombosModel combosModel);
	boolean modificarCombo(CombosModel combosModel);
	boolean eliminarCombo(CombosModel combosModel);
	ArrayList<CombosModel> buscarListaCombo();
}
