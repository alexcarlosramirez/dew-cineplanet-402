package pe.edu.upc.dw2011cp007.mantenimiento.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {

	private CineRepository cineRepository;

	@Autowired
	public MantenimientoServiceImpl(CineRepository cineRepository) {
		this.cineRepository = cineRepository;
	}

	public boolean registrarCine(CineModel cineModel) {
		return cineRepository.registrarCine(cineModel);
	}

	public CineModel buscarCinePorId(int idCine) {
		ArrayList<CineModel> listaCineModel = cineRepository.buscarListaCine();
		for (CineModel cineModel : listaCineModel) {
			if (cineModel.getIdCine() == idCine)
				return cineModel;
		}
		return null;
	}
}
