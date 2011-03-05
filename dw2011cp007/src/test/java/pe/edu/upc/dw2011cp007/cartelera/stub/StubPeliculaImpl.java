package pe.edu.upc.dw2011cp007.cartelera.stub;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaArtistaModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaCineModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PaisModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.TipopeliculaModel;

public class StubPeliculaImpl implements PeliculaRepository {

	private ArrayList<PeliculaModel> listaPeliculaModel;
	private ArrayList<PeliculaArtistaModel> listaPeliculaArtistaModel;
	private ArrayList<PeliculaCineModel> listaPeliculaCineModel;

	public StubPeliculaImpl() {
		//inicializando stubs
		StubArtistaImpl stubArtistaImpl = new StubArtistaImpl();
		StubCineImpl stubCineImpl = new StubCineImpl();
		StubPaisImpl stubPaisImpl = new StubPaisImpl();
		StubTipopeliculaImpl stubTipopeliculaImpl = new StubTipopeliculaImpl();

		//catalogos
		ArrayList<ArtistaModel> listaArtistaModel = stubArtistaImpl.buscarListaArtista();
		ArrayList<CineModel> listaCineModel = stubCineImpl.buscarListaCine();
		ArrayList<PaisModel> listaPaisModel = stubPaisImpl.buscarListaPais();
		ArrayList<TipopeliculaModel> listaTipopeliculaModel = stubTipopeliculaImpl.buscarListaTipopelicula();

		//--------------------------------
		listaPeliculaModel = new ArrayList<PeliculaModel>();

		PeliculaModel pelicula = new PeliculaModel();
		pelicula.setIdPelicula(1);
		pelicula.setPaisModel(listaPaisModel.get(0));
		pelicula.setTipopeliculaModel(listaTipopeliculaModel.get(0));
		pelicula.setClasificacionPelicula(2);
		listaPeliculaModel.add(pelicula);

		pelicula = new PeliculaModel();
		pelicula.setIdPelicula(2);
		pelicula.setPaisModel(listaPaisModel.get(1));
		pelicula.setTipopeliculaModel(listaTipopeliculaModel.get(1));
		pelicula.setClasificacionPelicula(3);
		listaPeliculaModel.add(pelicula);

		pelicula = new PeliculaModel();
		pelicula.setIdPelicula(3);
		pelicula.setPaisModel(listaPaisModel.get(2));
		pelicula.setTipopeliculaModel(listaTipopeliculaModel.get(0));
		pelicula.setClasificacionPelicula(1);
		listaPeliculaModel.add(pelicula);

		//--------------------------------
		listaPeliculaArtistaModel = new ArrayList<PeliculaArtistaModel>();

		PeliculaArtistaModel peliculaArtistaModel = new PeliculaArtistaModel();
		peliculaArtistaModel.setArtistaModel(listaArtistaModel.get(1));
		peliculaArtistaModel.setPeliculaModel(listaPeliculaModel.get(0));
		listaPeliculaArtistaModel.add(peliculaArtistaModel);

		peliculaArtistaModel = new PeliculaArtistaModel();
		peliculaArtistaModel.setArtistaModel(listaArtistaModel.get(0));
		peliculaArtistaModel.setPeliculaModel(listaPeliculaModel.get(1));
		listaPeliculaArtistaModel.add(peliculaArtistaModel);

		peliculaArtistaModel = new PeliculaArtistaModel();
		peliculaArtistaModel.setArtistaModel(listaArtistaModel.get(1));
		peliculaArtistaModel.setPeliculaModel(listaPeliculaModel.get(2));
		listaPeliculaArtistaModel.add(peliculaArtistaModel);

		//--------------------------------
		listaPeliculaCineModel = new ArrayList<PeliculaCineModel>();

		PeliculaCineModel peliculaCineModel = new PeliculaCineModel();
		peliculaCineModel.setCineModel(listaCineModel.get(1));
		peliculaCineModel.setPeliculaModel(listaPeliculaModel.get(0));
		listaPeliculaCineModel.add(peliculaCineModel);

		peliculaCineModel = new PeliculaCineModel();
		peliculaCineModel.setCineModel(listaCineModel.get(2));
		peliculaCineModel.setPeliculaModel(listaPeliculaModel.get(1));
		listaPeliculaCineModel.add(peliculaCineModel);

		peliculaCineModel = new PeliculaCineModel();
		peliculaCineModel.setCineModel(listaCineModel.get(1));
		peliculaCineModel.setPeliculaModel(listaPeliculaModel.get(2));
		listaPeliculaCineModel.add(peliculaCineModel);
	}

	public PeliculaModel buscarPelicula(PeliculaModel peliculamodel) {
		for (PeliculaModel peliculaModelTemp : listaPeliculaModel) {
			if (peliculaModelTemp.getIdPelicula() == peliculamodel.getIdPelicula()) {
				return peliculaModelTemp;
			}
		}
		return null;
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaModel() {
		return listaPeliculaModel;
	}

	public ArrayList<PeliculaArtistaModel> buscarListaPeliculaArtistaModel() {
		return listaPeliculaArtistaModel;
	}

	public ArrayList<PeliculaCineModel> buscarListaPeliculaCineModel() {
		return listaPeliculaCineModel;
	}

	public boolean registrarPelicula(PeliculaModel peliculamodel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificarPelicula(PeliculaModel peliculamodel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean eliminarPelicula(PeliculaModel peliculamodel) {
		// TODO Auto-generated method stub
		return false;
	}

	public PeliculaModel peliculaRepository(int idPeliculaSel) {
		// TODO Auto-generated method stub
		return null;
	}
}
