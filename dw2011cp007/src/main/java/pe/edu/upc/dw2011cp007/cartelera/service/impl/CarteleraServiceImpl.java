package pe.edu.upc.dw2011cp007.cartelera.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.cartelera.model.HorarioModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.HorarioRepository;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaArtistaRepository;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;
import pe.edu.upc.dw2011cp007.cartelera.service.CarteleraService;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

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

	public PeliculaModel buscarPeliculaPorId(int idPelicula) {
		PeliculaModel peliculaModel = new PeliculaModel();
		peliculaModel.setIdPelicula(idPelicula);
		return peliculaRepository.buscarPelicula(peliculaModel);
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		return peliculaRepository.buscarListaPeliculaEnCartelera();
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		return peliculaRepository.buscarListaPeliculaEnEstreno();
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaProyectarHoy() {
		return horarioRepository.buscarListaPeliculaProyectarHoy();
	}

	public ArrayList<HorarioModel> buscarHorarioPorPelicula(PeliculaModel peliculaModel) {
		return horarioRepository.buscarHorarioPorPelicula(peliculaModel);
	}

	public ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaModel) {
		return peliculaArtistaRepository.buscarListaArtistaPorPelicula(peliculaModel);
	}

}
