package pe.edu.upc.dw2011cp007.mantenimiento.repository;

import java.util.ArrayList;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public interface ArtistaRepository {

	boolean registrarArtista(ArtistaModel artistaModel);
	boolean modificarArtista(ArtistaModel artistaModel);
	boolean eliminarArtista(ArtistaModel artistaModel);
	ArrayList<ArtistaModel> buscarListaArtista();
}
