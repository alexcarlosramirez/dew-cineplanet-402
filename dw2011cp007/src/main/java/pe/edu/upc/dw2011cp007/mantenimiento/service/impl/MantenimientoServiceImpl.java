 package pe.edu.upc.dw2011cp007.mantenimiento.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.ProductoModel;
import pe.edu.upc.dw2011cp007.mantenimiento.model.SalasModel;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ArtistaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.CineRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.PeliculaArtistaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.PeliculaRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.ProductoRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.repository.SalasRepository;
import pe.edu.upc.dw2011cp007.mantenimiento.service.MantenimientoService;

@Service
public class MantenimientoServiceImpl implements MantenimientoService {

	private CineRepository cineRepository;
	private SalasRepository salasRepository;
	private ProductoRepository productoRepository;
	private PeliculaRepository peliculaRepository;
	private PeliculaArtistaRepository peliculaArtistaRepository;

	@Autowired
	public MantenimientoServiceImpl(CineRepository cineRepository, ArtistaRepository artistaRepository, SalasRepository salasRepository, ProductoRepository productoRepository, PeliculaRepository peliculaRepository, PeliculaArtistaRepository peliculaArtistaRepository) {
		this.cineRepository = cineRepository;
		this.artistaRepository = artistaRepository;
		this.salasRepository = salasRepository;
		this.productoRepository = productoRepository;
		this.peliculaRepository = peliculaRepository;
		this.peliculaArtistaRepository = peliculaArtistaRepository;
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

	public CineModel buscarCinePorNombre(String nombrecine) {
		ArrayList<CineModel> listaCineModel = cineRepository.buscarListaCine();
		for (CineModel cineModel : listaCineModel) {
			if (cineModel.getNombrecine().equals(nombrecine))
				return cineModel;
		}
		return null;
	}

	public boolean registrarSala(SalasModel salasModel) {
		return salasRepository.registrarSala(salasModel);
	}

	public SalasModel buscarSalaPorNombre(String nombresala) {
		ArrayList<SalasModel> listaSalasModel = salasRepository.buscarListaSala();
		for (SalasModel salasModel : listaSalasModel) {
			if (salasModel.getNombreSala().equals(nombresala))
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

	public ArrayList<ProductoModel> buscarListaProductoPorPelicula(
			PeliculaModel peliculaModel) {
		return productoRepository.buscarListaProductoPorPelicula(peliculaModel);
	}

	public ArrayList<ProductoModel> buscarListaProducto() {
		return productoRepository.buscarListaProducto();
	}

	public ProductoModel buscarProducto(ProductoModel productoModel) {
		return productoRepository.buscarProducto(productoModel);
	}
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

	public ArrayList<ArtistaModel> buscarListaArtistaPorPelicula(PeliculaModel peliculaModel) {
		return peliculaArtistaRepository.buscarListaArtistaPorPelicula(peliculaModel);
	}
}
