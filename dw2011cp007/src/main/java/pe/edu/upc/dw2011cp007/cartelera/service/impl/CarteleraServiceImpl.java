package pe.edu.upc.dw2011cp007.cartelera.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.PeliculaRepository;

@Service
public class CarteleraServiceImpl implements CarteleraService {
	private HorarioRepository horarioRepository;
	private PeliculaRepository peliculaRepository;

	@Autowired
	public CarteleraServiceImpl(PeliculaRepository peliculaRepository, HorarioRepository horarioRepository) {
		this.peliculaRepository = peliculaRepository;
		this.horarioRepository = horarioRepository;
	}

	//peliculaRepository=============================================================
	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		return peliculaRepository.buscarListaPeliculaEnCartelera();
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		return peliculaRepository.buscarListaPeliculaEnEstreno();
	}

	public List<PeliculaModel> buscarListaPeliculaHoy() {
		return peliculaRepository.buscarListaPeliculaHoy();
	}

	//horarioRepository=============================================================

	public ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy() {
		return horarioRepository.buscarListaPeliculaProyectarHoy();
	}

	public ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaModel) {
		return horarioRepository.buscarHorarioPorPelicula(peliculaModel);
	}
}
