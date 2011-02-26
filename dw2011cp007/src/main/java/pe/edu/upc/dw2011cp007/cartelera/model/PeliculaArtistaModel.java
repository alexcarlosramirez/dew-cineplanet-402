package pe.edu.upc.dw2011cp007.cartelera.model;

import pe.edu.upc.dw2011cp007.mantenimiento.model.ArtistaModel;

public class PeliculaArtistaModel {

	private PeliculaModel peliculaModel;
	private ArtistaModel artistaModel;

	public PeliculaModel getPeliculaModel() {
		return peliculaModel;
	}
	public void setPeliculaModel(PeliculaModel peliculaModel) {
		this.peliculaModel = peliculaModel;
	}
	public ArtistaModel getArtistaModel() {
		return artistaModel;
	}
	public void setArtistaModel(ArtistaModel artistaModel) {
		this.artistaModel = artistaModel;
	}
}
