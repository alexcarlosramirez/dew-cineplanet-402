package pe.edu.upc.dw2011cp007.cartelera.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;

@Service
public class CarteleraServiceImpl implements CarteleraService {
	private HorarioRepository horarioRepository;

	@Autowired
	public CarteleraServiceImpl(
			HorarioRepository horarioRepository) {
		this.horarioRepository = horarioRepository;
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		return horarioRepository.buscarListaPeliculaEnCartelera();
	}

}
