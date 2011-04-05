 package pe.edu.upc.dw2011cp007.mantenimiento.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CombosModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ArtistaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CombosRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.SalasRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {

	private CineRepository cineRepository;
	private CombosRepository combosRepository;
	private SalasRepository salasRepository;
	@Autowired
	public MantenimientoServiceImpl(CineRepository cineRepository,ArtistaRepository artistaRepository
			,CombosRepository combosRepository
			,SalasRepository salasRepository
	) {
		this.cineRepository = cineRepository;
		this.artistaRepository = artistaRepository;
		this.combosRepository = combosRepository;
		this.salasRepository = salasRepository;
		
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

	public ArrayList<CineModel> buscarListaCine() {
		return cineRepository.buscarListaCine();
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

	public boolean registrarCombo(CombosModel combosModel) {
		return combosRepository.registrarCombo(combosModel);
		
	}

	public CombosModel buscarComboPorNombre(String string) {
		ArrayList<CombosModel> listaCombosModel = combosRepository.buscarListaCombo();
		for (CombosModel combosModel : listaCombosModel) {
			if (combosModel.getNombreCombo().equals(string))
				return combosModel;
		}
		return null;
	}

	public boolean actualizarCombo(CombosModel combosModel) {
		return combosRepository.modificarCombo(combosModel);

	}

	public boolean eliminarCombo(CombosModel combosModel) {
		return combosRepository.eliminarCombo(combosModel);
	}

	public boolean registrarSala(SalasModel salasModel) {
		return salasRepository.registrarSala(salasModel);
	}

	public SalasModel buscarSalaPorNombre(String string) {
		ArrayList<SalasModel> listaSalasModel = salasRepository.buscarListaSala();
		for (SalasModel salasModel : listaSalasModel) {
			if (salasModel.getNombreSala().equals(string))
				return salasModel;
		}
		return null;
	}

	public boolean actualizarSala(SalasModel salasModel) {
		return salasRepository.modificarSala(salasModel);
	}

	public boolean eliminarSala(SalasModel salasModel) {
		return salasRepository.eliminarSala(salasModel);
	}
}
