package pe.edu.upc.dw2011cp007.cartelera.repository.impl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import pe.edu.upc.dw2011cp007.cartelera.model.PeliculaModel;
import pe.edu.upc.dw2011cp007.cartelera.repository.PeliculaRepository;

@Repository
public class HibernatePeliculaRepositoryImpl extends HibernateDaoSupport implements PeliculaRepository {

	public HibernatePeliculaRepositoryImpl(SessionFactory sessionFactory) {
		setSessionFactory(sessionFactory);
	}

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

	public ArrayList<PeliculaModel> buscarListaPeliculaEnCartelera() {
		return null;
	}

	public ArrayList<PeliculaModel> buscarListaPeliculaEnEstreno() {
		return null;
	}

}
