package pe.edu.upc.dw2011cp007.mantenimiento.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ArtistaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {

	private CineRepository cineRepository;

	@Autowired
	public MantenimientoServiceImpl(CineRepository cineRepository,ArtistaRepository artistaRepository) {
		this.cineRepository = cineRepository;
		this.artistaRepository = artistaRepository;
	}

	public boolean registrarCine(CineModel cineModel) {
		return cineRepository.registrarCine(cineModel);
	}

	public boolean actualizarCine(CineModel cineModel) {
		return cineRepository.modificarCine(cineModel);
	}

	public boolean eliminarCine(CineModel cineModel) {
		return cineRepository.eliminarCine(cineModel);
	}

	public CineModel buscarCinePorId(int idCine) {
		ArrayList<CineModel> listaCineModel = cineRepository.buscarListaCine();
		for (CineModel cineModel : listaCineModel) {
			if (cineModel.getIdCine() == idCine)
				return cineModel;
		}
		return null;
	}


	private ArtistaRepository artistaRepository;

		
	public boolean registrarArtista(ArtistaModel artistaModel) {
		return artistaRepository.registrarArtista(artistaModel);
	}

	public ArtistaModel buscarartistaPorId(int idArtista) {
		ArrayList<ArtistaModel> listaArtistaModel = artistaRepository.buscarListaArtista();
		for (ArtistaModel artistaModel : listaArtistaModel) {
			if (artistaModel.getIdArtista() == idArtista)
				return artistaModel;
		}
		return null;
	}

	public boolean actualizarArtista(ArtistaModel artistaModel) {
		return artistaRepository.modificarArtista(artistaModel);
	}

	public boolean eliminarCine(ArtistaModel artistaModel) {
		return artistaRepository.eliminarArtista(artistaModel);
		
	}

	public CineModel buscarCinePorNombre(String string) {
		ArrayList<CineModel> listaCineModel = cineRepository.buscarListaCine();
		for (CineModel cineModel : listaCineModel) {
			if (cineModel.getNombrecine().equals(string))
				return cineModel;
		}
		return null;
	}

}
