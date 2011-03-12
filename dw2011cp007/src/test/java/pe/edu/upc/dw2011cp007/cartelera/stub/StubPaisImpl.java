package pe.edu.upc.dw2011cp007.cartelera.stub;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.PaisRepository;

public class StubPaisImpl implements PaisRepository {

	private ArrayList<PaisModel> listaPaisModel;

	public StubPaisImpl() {
		//catalogo de paises
		listaPaisModel = new ArrayList<PaisModel>();

		PaisModel paisModel = new PaisModel();
		paisModel.setIdPais(1);
		paisModel.setNombrepais("PERU");
		listaPaisModel.add(paisModel);

		paisModel = new PaisModel();
		paisModel.setIdPais(2);
		paisModel.setNombrepais("ARGENTINA");
		listaPaisModel.add(paisModel);

		paisModel = new PaisModel();
		paisModel.setIdPais(3);
		paisModel.setNombrepais("ECUADOR");
		listaPaisModel.add(paisModel);
	}

	public ArrayList<PaisModel> buscarListaPais() {
		return listaPaisModel;
	}

	public boolean registrarPais(PaisModel paisModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificarPais(PaisModel paisModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarPais(PaisModel paisModel) {
		// TODO Auto-generated method stub
		return false;
	}
}
