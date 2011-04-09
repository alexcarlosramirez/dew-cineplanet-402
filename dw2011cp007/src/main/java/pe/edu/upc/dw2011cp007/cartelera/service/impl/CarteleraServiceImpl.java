package pe.edu.upc.dw2011cp007.cartelera.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaArtistaRepository;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;

@Service
public class CarteleraServiceImpl implements CarteleraService {
	private HorarioRepository horarioRepository;
	private PeliculaRepository peliculaRepository;
	private PeliculaArtistaRepository peliculaArtistaRepository;

	@Autowired
	public CarteleraServiceImpl(PeliculaRepository peliculaRepository, HorarioRepository horarioRepository, PeliculaArtistaRepository peliculaArtistaRepository) {
		this.peliculaRepository = peliculaRepository;
		this.horarioRepository = horarioRepository;
		this.peliculaArtistaRepository = peliculaArtistaRepository;
	}

	//peliculaRepository=============================================================

	public boolean registrarPelicula(PeliculaModel peliculaModel) {
		return peliculaRepository.registrarPelicula(peliculaModel);
	}

	public boolean modificarPelicula(PeliculaModel peliculaModel) {
		return peliculaRepository.modificarPelicula(peliculaModel);
	}

	public boolean eliminarPelicula(PeliculaModel peliculaModel) {
		return peliculaRepository.eliminarPelicula(peliculaModel);
	}

	public PeliculaModel buscarPelicula(PeliculaModel peliculaSel) {
		return peliculaRepository.buscarPelicula(peliculaSel);
	}

	public ArrayList<PeliculaModel> buscarListaPelicula(PeliculaModel peliculaBuscar, CineModel cineModel) {
		return peliculaRepository.buscarListaPelicula(peliculaBuscar, cineModel);
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		return peliculaRepository.buscarListaPeliculaEnCartelera();
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		return peliculaRepository.buscarListaPeliculaEnEstreno();
	}

	//horarioRepository=============================================================

	public ArrayList<HorarioModel> buscarListaPeliculaProyectarHoy() {
		return horarioRepository.buscarListaPeliculaProyectarHoy();
	}

	public ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaModel) {
		return horarioRepository.buscarHorarioPorPelicula(peliculaModel);
	}

	//peliculaArtistaRepository=============================================================

	public ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaModel) {
		return peliculaArtistaRepository.buscarListaArtistaPorPelicula(peliculaModel);
	}

	public List<PeliculaModel> buscarListaPeliculaHoy() {
		return peliculaRepository.buscarListaPeliculaHoy();
	}
}
