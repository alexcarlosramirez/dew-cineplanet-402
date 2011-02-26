package pe.edu.upc.dw2011cp007.cartelera.stub;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.TipopeliculaRepository;

public class StubTipopeliculaImpl implements TipopeliculaRepository {

	private ArrayList<TipopeliculaModel> listaTipopeliculaModel;

	public StubTipopeliculaImpl() {
		listaTipopeliculaModel = new ArrayList<TipopeliculaModel>();

		TipopeliculaModel tipopeliculaModel = new TipopeliculaModel();
		tipopeliculaModel.setIdTipopelicula(1);
		tipopeliculaModel.setNombretipopelicula("DRAMA");
		listaTipopeliculaModel.add(tipopeliculaModel);

		tipopeliculaModel = new TipopeliculaModel();
		tipopeliculaModel.setIdTipopelicula(2);
		tipopeliculaModel.setNombretipopelicula("INFANTIL");
		listaTipopeliculaModel.add(tipopeliculaModel);
	}

	public ArrayList<TipopeliculaModel> buscarListaTipopelicula() {
		return listaTipopeliculaModel;
	}
}
