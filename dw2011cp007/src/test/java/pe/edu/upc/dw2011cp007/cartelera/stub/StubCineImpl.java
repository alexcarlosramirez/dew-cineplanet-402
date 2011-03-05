package pe.edu.upc.dw2011cp007.cartelera.stub;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;

public class StubCineImpl implements CineRepository {

	private ArrayList<CineModel> listaCineModel;

	public StubCineImpl() {
		listaCineModel = new ArrayList<CineModel>();

		CineModel cineModel = new CineModel();
		cineModel.setIdCine(1);
		cineModel.setNombrecine("LIMA");
		listaCineModel.add(cineModel);

		cineModel = new CineModel();
		cineModel.setIdCine(2);
		cineModel.setNombrecine("MIRAFLORES");
		listaCineModel.add(cineModel);

		cineModel = new CineModel();
		cineModel.setIdCine(3);
		cineModel.setNombrecine("LINCE");
		listaCineModel.add(cineModel);
	}

	public ArrayList<CineModel> buscarListaCine() {
		return listaCineModel;
	}

	public boolean registrarCine(CineModel cineModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean actualizarCine(CineModel cineModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarCine(CineModel cineModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificarCine(CineModel cineModel) {
		// TODO Auto-generated method stub
		return false;
	}
}
