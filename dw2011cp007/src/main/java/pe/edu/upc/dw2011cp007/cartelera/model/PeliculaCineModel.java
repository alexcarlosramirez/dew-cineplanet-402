package pe.edu.upc.dw2011cp007.cartelera.model;

import pe.edu.upc.dw2011cp007.mantenimiento.model.CineModel;

public class PeliculaCineModel {

	private PeliculaModel peliculaModel;
	private CineModel cineModel;

	public PeliculaModel getPeliculaModel() {
		return peliculaModel;
	}
	public void setPeliculaModel(PeliculaModel peliculaModel) {
		this.peliculaModel = peliculaModel;
	}
	public CineModel getCineModel() {
		return cineModel;
	}
	public void setCineModel(CineModel cineModel) {
		this.cineModel = cineModel;
	}
}
