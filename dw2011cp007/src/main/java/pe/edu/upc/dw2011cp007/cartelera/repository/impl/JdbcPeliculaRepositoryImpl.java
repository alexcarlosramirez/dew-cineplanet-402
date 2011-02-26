package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaArtistaModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaCineModel;
import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;

@Repository
public class JdbcPeliculaRepositoryImpl implements PeliculaRepository {

	@Autowired
	private DataSource dataSource;

	public boolean registrarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public boolean modificarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public boolean eliminarPelicula(PeliculaModel peliculamodel) {
		return false;
	}

	public PeliculaModel buscarPelicula(PeliculaModel peliculamodel) {
		return null;
	}
}
